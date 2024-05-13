package net.ezra.ui.auth


import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import net.ezra.R
import net.ezra.navigation.ROUTE_DASHBOARD
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_REGISTER

@Composable
fun LoginScreen(navController: NavController, onLoginSuccess: () -> Unit) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var error by remember { mutableStateOf<String?>(null) }
    var isLoading by remember { mutableStateOf(false) }

    BackHandler {
        navController.popBackStack()

    }

    LazyColumn {
        item {
            Box {
                Image(painter = painterResource(id = R.drawable.wallpape), contentDescription = "" )

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    AuthHeader()
                    Text("Login", style = TextStyle(textDecoration = TextDecoration.Underline), color = Color.White, fontSize = 24.sp)
                    Spacer(modifier = Modifier.height(16.dp))

                    OutlinedTextField(
                        value = email,
                        onValueChange = { email = it },
                        label = { Text("Email") },
                        modifier = Modifier.fillMaxWidth(),

                        keyboardOptions = KeyboardOptions(
                            capitalization = KeyboardCapitalization.None,
                            autoCorrect = false,
                            keyboardType = KeyboardType.Email,
                            imeAction = ImeAction.Next
                        ),
                        leadingIcon = {Icon(imageVector = Icons.Default.Email, contentDescription = "")},
                        textStyle = TextStyle(Color.White),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = Color.White,
                            unfocusedBorderColor = Color.Green,
                            focusedLabelColor = Color.White,
                            unfocusedLabelColor = Color.White,
                            cursorColor = Color.White,



                            )
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        label = { Text("Password") },
                        visualTransformation = PasswordVisualTransformation(),
                        modifier = Modifier.fillMaxWidth(),

                        keyboardOptions = KeyboardOptions(
                            capitalization = KeyboardCapitalization.None,
                            autoCorrect = false,
                            keyboardType = KeyboardType.Email,
                            imeAction = ImeAction.Next
                        ),
                        leadingIcon = {Icon(imageVector = Icons.Default.Email, contentDescription = "")},
                        textStyle = TextStyle(Color.White),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = Color.White,
                            unfocusedBorderColor = Color.Green,
                            focusedLabelColor = Color.White,
                            unfocusedLabelColor = Color.White,
                            cursorColor = Color.White,



                            )
                    )
                    Spacer(modifier = Modifier.height(16.dp))

                    if (isLoading) {
                        CircularProgressIndicator(modifier = Modifier.size(48.dp))
                    } else {



                        Button(
                            border = BorderStroke(1.dp, Color.Green),
                            colors = ButtonDefaults.buttonColors(Color.Transparent),
                            onClick = {
                                if (email.isBlank() || password.isBlank()) {
                                    error = "Please fill in all fields"
                                } else {
                                    isLoading = true
                                    FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                                        .addOnCompleteListener { task ->
                                            isLoading = false
                                            if (task.isSuccessful) {
                                                navController.navigate(ROUTE_MIT)
                                            } else {
                                                error = task.exception?.message ?: "Login failed"
                                            }
                                        }
                                }
                            },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("Login", color = Color.White)
                        }

                        androidx.compose.material3.Text(
                            modifier = Modifier

                                .clickable {
                                    navController.navigate(ROUTE_REGISTER) {
                                        popUpTo(ROUTE_LOGIN) { inclusive = true }
                                    }
                                },
                            text = "go to register",
                            textAlign = TextAlign.Center,
                            color = androidx.compose.material3.MaterialTheme.colorScheme.onSurface
                        )



                    }

                    error?.let {
                        Text(
                            text = it,
                            color = MaterialTheme.colors.error,
                            modifier = Modifier.padding(top = 8.dp)
                        )
                    }
                }
            }
        }
    }



}
