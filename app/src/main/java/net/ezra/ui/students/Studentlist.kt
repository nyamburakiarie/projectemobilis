

package net.ezra.ui.students

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue

//uncomment
import androidx.compose.runtime.livedata.observeAsState
//uncomment



import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore

import androidx.lifecycle.ViewModel
import coil.compose.AsyncImage
import coil.compose.SubcomposeAsyncImage
import coil.request.ImageRequest
import dagger.Lazy
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_VIEW_STUDENTS


data class Item(

    val imageUrl: String? = "",
    val studentName: String? = "",
    val studentClass: String? = "",
    val studentCourse: String? = "",

    )


class FirestoreViewModel : ViewModel() {

    private val firestore = Firebase.firestore
    private val itemsCollection = firestore.collection("Students")

    private val _items = MutableLiveData<List<Item>>()
    val items: LiveData<List<Item>> = _items

    init {
        fetchItems()
    }

    fun fetchItems() {
        itemsCollection.addSnapshotListener { snapshot, error ->
            if (error != null) {
                Log.e("FirestoreViewModel", "Error fetching items", error)
                return@addSnapshotListener
            }

            val itemList = mutableListOf<Item>()
            snapshot?.documents?.forEach { document ->
                val item = document.toObject(Item::class.java)?.copy(studentClass = document.id)
                item?.let {
                    itemList.add(it)
                }
            }
            _items.value = itemList
        }
    }
}


@Composable
fun ItemList(items: List<Item>) {


                Image(painter = painterResource(id = R.drawable.wallpape), contentDescription = "" )

                Column {

                    Text(text = "Student List",  style = TextStyle(textDecoration = TextDecoration.Underline), color = Color.White, fontSize = 24.sp)


                    LazyVerticalGrid(
                        columns = GridCells.Fixed(3),
                        modifier = Modifier
                            .padding(10.dp)
                    ) {

                        items.forEach { item ->
                            item {
                                Column {


                                    SubcomposeAsyncImage(
                                        model = ImageRequest.Builder(LocalContext.current)
                                            .data(item.imageUrl)
                                            .crossfade(true)
                                            .build(),
                                        loading = {
                                            CircularProgressIndicator()
                                        },
                                        contentDescription = item.studentName,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier.clip(RoundedCornerShape(10))
                                    )

                                    item.studentName?.let { Text(text = it) }
                                    item.studentClass?.let { Text(text = it) }
                                    item.studentCourse?.let { Text(text = it) }

                                }

                            }
                        }


                    }
                }

            }


@Composable
fun StudentList(navController: NavHostController, viewModel: FirestoreViewModel) {

    LazyColumn {
        item {
            Box{

            val items by viewModel.items.observeAsState(initial = emptyList())
//uncomment ukishaa clone


    // Fetch items when the composable is first created
    LaunchedEffect(viewModel, key2 = true) {
        viewModel.fetchItems()
    }

    Column {

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_MIT) {
                        popUpTo(ROUTE_VIEW_STUDENTS) { inclusive = true }
                    }
                },
            text = "go home, ",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )


//uncomment
//        ItemList(items)
//uncomment
    }


}
        }
    }


}







