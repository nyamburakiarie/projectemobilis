
package net.ezra.ui.mit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField

import androidx.compose.material3.TextFieldDefaults

import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.text.input.TextFieldValue

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

//from ai


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextDecoration
import coil.compose.AsyncImagePainter.State.Empty.painter


import com.google.android.material.search.SearchBar
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_REGISTER
import net.ezra.navigation.ROUTE_SIGNUP








@Composable
fun ContactScreen(navController: NavHostController) {

    LazyColumn {
        item {
Box{


    Image(painter = painterResource(id = R.drawable.wallpape), contentDescription = "" )

            Spacer(modifier = Modifier.height(10.dp))


            var name by remember { mutableStateOf("") }
            var email by remember { mutableStateOf("") }
            var message by remember { mutableStateOf("") }

            Column(modifier = Modifier
                .background(Color.Transparent)
                .fillMaxSize()
                .padding(16.dp)
            ,

                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Row {


                    Text(
                        "Contact Us", fontSize = 24.sp, color = Color.White,
                        style = TextStyle(textDecoration = TextDecoration.Underline)
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text("Get in touch with us, if you ", fontSize = 20.sp, color = Color.White,)
                Text("have any inquiries. ", fontSize = 20.sp, color = Color.White,)

                Spacer(modifier = Modifier.height(15.dp))

                Column (modifier = Modifier
                    .background(Color.Transparent)
                    .fillMaxSize()
                    .padding(16.dp)

                    ,
                ) {



//                        Box(modifier = Modifier.padding(1.dp)
//                            .wrapContentWidth()
//                            .fillMaxWidth()
//                        ) {

                            Row {
                                Image(imageVector = Icons.Default.Phone, contentDescription = "",  modifier = Modifier.size(24.dp),
                                    colorFilter = ColorFilter.tint(Color.White))

                                Spacer(modifier = Modifier.width(7.dp))

                                Text(
                                    text = "Phone: +254 745416913",
                                    color = Color.White,
                                    fontSize = 20.sp
                                )
                            }




                    Spacer(modifier = Modifier.height(9.dp))



    Row {
        Image(imageVector = Icons.Default.Email, contentDescription = "",  modifier = Modifier.size(24.dp),
            colorFilter = ColorFilter.tint(Color.White))

        Spacer(modifier = Modifier.width(7.dp))

        Text(
            text = "Email: orangeacre@gmail.com",

            color = Color.White,

            fontSize = 20.sp
        )


                    }

                    Spacer(modifier = Modifier.height(9.dp))


                            Row {
                                Image(
                                    imageVector = Icons.Default.AccountBox,
                                    contentDescription = "",
                                    modifier = Modifier.size(24.dp),
                                    colorFilter = ColorFilter.tint(Color.White)
                                )

                                Spacer(modifier = Modifier.width(7.dp))

                                Text(
                                    text = "Office Address: 123 Business Rd, Business City ",

                                    color = Color.White,
                                    fontSize = 20.sp
                                )

                            }



                    Spacer(modifier = Modifier.height(9.dp))



                            Row {
                                Image(imageVector = Icons.Default.Info, contentDescription = "",  modifier = Modifier.size(24.dp),
                                    colorFilter = ColorFilter.tint(Color.White))

                                Spacer(modifier = Modifier.width(7.dp))

                                Text(
                                    text = "Hours of operation: Monday to Friday, 9:00AM - 5.00PM",
                                    color = Color.White,
                                    fontSize = 20.sp
                                )

                            }


                    Spacer(modifier = Modifier.height(5.dp))

                }

                Spacer(modifier = Modifier.height(10.dp))

//


                Spacer(modifier = Modifier.height(12.dp))


                val underlineWhite = null
                Text(
                    text = "Social Media:",
                    color = Color.White,
                    style = TextStyle(textDecoration = underlineWhite),
                    fontSize = 20.sp // Adjust font size as needed
                )


//                Text(
//                    text = "Social Media:",
//                    color = Color.White,
//                    style = TextStyle(textDecoration = TextDecoration.Underline)
//                )
                Spacer(modifier = Modifier.height(12.dp))

                Column(modifier = Modifier
                    .background(Color.Transparent)
                    .fillMaxSize()
                    .padding(16.dp)

                   ,
                ) {


                    Row {

                        Image(
                            painter = painterResource(id = R.drawable.facebook_icon),
                            contentDescription = "",
                            colorFilter = ColorFilter.tint(Color.White)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Column {
                            Text(
                                text = "Facebook",
                                color = Color.White, fontSize = 20.sp
                            )
                            Text(
                                text = "orangeacre_realty",
                                color = Color.White
                            )
                        }


                    }

                    Spacer(modifier = Modifier.height(15.dp))

                    Row {

                        Image(
                            painter = painterResource(id = R.drawable.ig_icon),
                            contentDescription = "",
                            colorFilter = ColorFilter.tint(Color.White)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Column {
                            Text(
                                text = "Instagram",
                                color = Color.White, fontSize = 20.sp
                            )
                            Text(
                                text = "orangeacre_realty",
                                color = Color.White
                            )
                        }


                    }


                    Spacer(modifier = Modifier.height(15.dp))

                    Row {

                        Image(
                            painter = painterResource(id = R.drawable.whatsapp_icon),
                            contentDescription = "",
                            colorFilter = ColorFilter.tint(Color.White)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Column {
                            Text(
                                text = "Whatsapp",
                                color = Color.White, fontSize = 20.sp
                            )
                            Text(
                                text = "+254 745419613",
                                color = Color.White
                            )
                        }


                    }


                    Spacer(modifier = Modifier.height(15.dp))

                    Row {

                        Image(
                            painter = painterResource(id = R.drawable.x_icon),
                            contentDescription = "",
                            colorFilter = ColorFilter.tint(Color.White)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Column {
                            Text(
                                text = "Twitter",
                                color = Color.White, fontSize = 20.sp
                            )
                            Text(
                                text = "orangeacre_realty",
                                color = Color.White
                            )
                        }


                    }
Row{
                    Button(
                        onClick = {
navController.navigate(ROUTE_ADD_STUDENTS){
    popUpTo(ROUTE_CONTACT) { inclusive = true }
}
                        },
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        shape = RoundedCornerShape(12.dp),
                        border = BorderStroke(1.dp, Color.Green),

                        ) {
                        Text(text = "Book your land")
                    }

    Spacer(modifier = Modifier.width(30.dp))

    Button(
        onClick = {
            navController.navigate(ROUTE_HOME){
                popUpTo(ROUTE_CONTACT) { inclusive = true }
            }

        },
        colors = ButtonDefaults.buttonColors(Color.Transparent),
        shape = RoundedCornerShape(12.dp),
        border = BorderStroke(1.dp, Color.Green),

        ) {
        Text(text = "Home")
    }
                }
                }

                        }



                Spacer(modifier = Modifier.height(12.dp))


            }

//            COLUMN2 ENDS HERE
        }

            }
        }





//                    OutlinedTextField(
//                        value = name,
//                        onValueChange = { name = it },
//                        label = { Text("Name") },
//                        modifier = Modifier.fillMaxWidth()
//                    )
//                    Spacer(modifier = Modifier.height(8.dp))
//
//                    Text(text = "How did you here about us?",  fontSize = 17.sp, color = Color.Black, modifier = Modifier.padding(end = 140.dp) )
//                    OutlinedTextField(
//                        value = email,
//                        onValueChange = { email = it },
//                        label = { Text("Email") },
//                        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
//                        modifier = Modifier.fillMaxWidth()
//                    )
//                    Spacer(modifier = Modifier.height(8.dp))
//
//
//                    Text(text = "How did you here about us?",  fontSize = 17.sp, color = Color.Black, modifier = Modifier.padding(end = 140.dp) )
//
//                    OutlinedTextField(
//                        value = message,
//                        onValueChange = { message = it },
//                        label = { Text("Message") },
//                        modifier = Modifier.fillMaxWidth(),
//                        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
//                        keyboardActions = KeyboardActions(onDone = { /* Handle send action */ })
//                    )
//                    Spacer(modifier = Modifier.height(16.dp))
//                    Button(onClick = {
//                        // Implement the logic to send the information (e.g., via email or to a server)
//                    }) {
//                        Text("Send")
//                    }



@Preview(showBackground = true, )
@Composable
fun HomeScreenPreview() {
    ContactScreen(rememberNavController())
}



