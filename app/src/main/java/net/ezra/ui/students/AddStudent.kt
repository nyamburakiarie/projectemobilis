package net.ezra.ui.students


import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale



import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter

import coil.request.ImageRequest
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.google.firebase.storage.FirebaseStorage
import java.util.UUID


import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.navigation.ROUTE_VIEW_STUDENTS

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddStudents(navController: NavHostController) {
//
LazyColumn {
    item {

   Box(

   ){

       Image(painter = painterResource(id =R.drawable.wallpape) , contentDescription = "")

    Column(

        modifier = Modifier

            .padding(15.dp),


        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Book your Land ", fontSize = 24.sp, color = Color.White,
            style = TextStyle(textDecoration = TextDecoration.Underline))

        var photoUri: Uri? by remember { mutableStateOf(null) }
        val launcher =
            rememberLauncherForActivityResult(ActivityResultContracts.PickVisualMedia()) { uri ->
                photoUri = uri
            }

        var studentName by rememberSaveable {
            mutableStateOf("")
        }

        var studentClass by rememberSaveable {
            mutableStateOf("")
        }

        var studentCourse by rememberSaveable {
            mutableStateOf("")
        }

        Spacer(modifier = Modifier.height(10.dp))


       Text(text = "Your Message",  fontSize = 17.sp, color = Color.White,  )

            OutlinedTextField(
                value = studentName,
                onValueChange = { studentName = it },
                label = { Text(text = "Message") },
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 10.dp)
                    .fillMaxWidth(),

                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.AccountBox,
                        contentDescription = ""
                    )
                },
//         you can also use a trailing icon

                textStyle = TextStyle(Color.White),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.Green,
                    focusedLabelColor = Color.White,
//             focused label color and focused border color should always match
                    unfocusedLabelColor = Color.White,
                    cursorColor = Color.White,
                    focusedLeadingIconColor = Color.White,
                    unfocusedLeadingIconColor = Color.White,
                )

            )




        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "How did you here about us?",  fontSize = 17.sp, color = Color.White,  )

        OutlinedTextField(
            value = studentClass,
            onValueChange = { studentClass = it },
            label = { Text(text = "how did you here about us") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
                    leadingIcon = { Icon(imageVector = Icons.Default.Info , contentDescription = "" ) },
//         you can also use a trailing icon

            textStyle = TextStyle(Color.White),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.Green,
                focusedLabelColor = Color.White,
//             focused label color and focused border color should always match
                unfocusedLabelColor = Color.White,
                cursorColor = Color.White,
                focusedLeadingIconColor = Color.White,
                unfocusedLeadingIconColor = Color.White,
        )



        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Which land interests you? Where is it located!",  fontSize = 17.sp, color = Color.White,  )

        OutlinedTextField(
            value = studentCourse,
            onValueChange = { studentCourse = it },
            label = { Text(text = "Land of interest") },

            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),


            leadingIcon = { Icon(imageVector = Icons.Default.Place , contentDescription = "" ) },
//         you can also use a trailing icon

            textStyle = TextStyle(Color.White),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.Green,
                focusedLabelColor = Color.White,
//             focused label color and focused border color should always match
                unfocusedLabelColor = Color.White,
                cursorColor = Color.White,
                focusedLeadingIconColor = Color.White,
                unfocusedLeadingIconColor = Color.White,)





//            modifier = Modifier
//                .padding(16.dp)
//                .fillMaxWidth()
        )

//        OutlinedTextField(
//            value = password,
//            onValueChange = {password = it},
//            label = {Text(text = "password")},
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
//
//            leadingIcon = { Icon(imageVector = Icons.Default.Place , contentDescription = "" ) },
////         you can also use a trailing icon
//
//            textStyle = TextStyle(Color.White),
//            colors = TextFieldDefaults.outlinedTextFieldColors(
//                focusedBorderColor = Color.White,
//                unfocusedBorderColor = Color.Green,
//                focusedLabelColor = Color.White,
////             focused label color and focused border color should always match
//                unfocusedLabelColor = Color.White,
//                cursorColor = Color.White,
//                focusedLeadingIconColor = Color.White,
//                unfocusedLeadingIconColor = Color.White,


        OutlinedButton(
            onClick = {
                launcher.launch(
                    PickVisualMediaRequest(
                        //Here we request only photos. Change this to .ImageAndVideo if you want videos too.
                        //Or use .VideoOnly if you only want videos.
                        mediaType = ActivityResultContracts.PickVisualMedia.ImageOnly
                    )
                )
            },
                    colors = ButtonDefaults.buttonColors(Color.Transparent),
            shape = RoundedCornerShape(12.dp),
            border = BorderStroke(1.dp, Color.Green),

        ) {
            Text("Select Image")
        }


        if (photoUri != null) {
            //Use Coil to display the selected image
            val painter = rememberAsyncImagePainter(
                ImageRequest
                    .Builder(LocalContext.current)
                    .data(data = photoUri)
                    .build()
            )

            Image(
                painter = painter,
                contentDescription = null,
                modifier = Modifier
                    .padding(5.dp)
                    .size(150.dp)
                    .fillMaxWidth()
                    .border(1.dp, Color.Gray),
                contentScale = ContentScale.Crop,

                )
        }


        OutlinedButton(onClick = {
            photoUri?.let {
                uploadImageToFirebaseStorage(
                    it,
                    studentName,
                    studentClass,
                    studentCourse
                )
            }
            navController.navigate(ROUTE_VIEW_STUDENTS){
                popUpTo(    ROUTE_ADD_STUDENTS) { inclusive = true }
            }

        },
            colors = ButtonDefaults.buttonColors(Color.Transparent),
            shape = RoundedCornerShape(12.dp),
            border = BorderStroke(1.dp, Color.Green),
          ) {

            Text(text = "Submit")


        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_MIT) {
                        popUpTo(ROUTE_ADD_STUDENTS) { inclusive = true }
                    }
                },
            text = "Go back to homepage",
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center,
            color = Color.White
        )


    }
   }
    }

    }
//    }
//}
//}

}



fun uploadImageToFirebaseStorage(imageUri: Uri, studentName: String, studentClass: String, studentCourse: String) {
    val storageRef = FirebaseStorage.getInstance().reference
    val imageRef = storageRef.child("images/${UUID.randomUUID()}")

    val uploadTask = imageRef.putFile(imageUri)
    uploadTask.continueWithTask { task ->
        if (!task.isSuccessful) {
            task.exception?.let {
                throw it
            }
        }
        imageRef.downloadUrl
    }.addOnCompleteListener { task ->
        if (task.isSuccessful) {
            val downloadUri = task.result
            saveToFirestore(downloadUri.toString(), studentName, studentClass, studentCourse)
        } else {


        }
    }
}

fun saveToFirestore(imageUrl: String, studentName: String, studentClass: String, studentCourse: String) {
    val db = Firebase.firestore
    val imageInfo = hashMapOf(
        "imageUrl" to imageUrl,
        "studentName" to studentName,
        "studentClass" to studentClass,
        "studentCourse" to studentCourse,

       
    )
    



    db.collection("Students")
        .add(imageInfo)
        .addOnSuccessListener {
          


        }
        .addOnFailureListener {
            // Handle error
        }
}







@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewLight() {
    AddStudents(rememberNavController())
}




