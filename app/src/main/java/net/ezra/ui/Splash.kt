package net.ezra.ui


import android.content.res.Configuration
import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import kotlinx.coroutines.delay
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_REGISTER
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.navigation.ROUTE_SPLASH


@Composable
fun SplashScreen(navController: NavHostController) {

    val scale = remember {
        androidx.compose.animation.core.Animatable(0f)
    }

    // Animation
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.7f,
            // tween Animation
            animationSpec = tween(
                durationMillis = 800,
                easing = {
                    OvershootInterpolator(4f).getInterpolation(it)
                })
        )
        // Customize the delay time
        delay(2000L)
        navController.navigate(ROUTE_REGISTER)
    }



            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xff1D8348 ))
                    .padding(12.dp),

                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Image(
                    painter = painterResource(id = R.drawable.landicon2),
                    contentDescription = "Logo",
                    modifier = Modifier.scale(scale.value)
                )



                Text(
                    "OrangeAcre Realty",
                    color = Color(0xffFF7F50),
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp
                )


                Text(
                    "Invest in a bright future",
//            color = Color(0xffFF7F50),
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(100.dp))





                //Lottie Animation
                val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.land))
                val progress by animateLottieCompositionAsState(composition)
                LottieAnimation(composition, progress,
                    modifier = Modifier.size(300.dp)
                )


                Spacer(modifier = Modifier.height(100.dp))

                Text(
                    text = "for more info",
                    color = Color.Black,
                    fontSize = 13.sp
                )

                Text(
                    text = "visit www.orangeacre.com",
                    color = Color.Black,
                    fontSize = 13.sp
                )
            }

//        Button(onClick = { navController.navigate(ROUTE_HOME)
//        {popUpTo(ROUTE_SPLASH) {inclusive = true}
//        }
//
//        },
//            colors = ButtonDefaults.buttonColors(Color.Transparent)
//
//        ) {
//            Text(text = "LEARN MORE",
//                color = Color.Black,
//                fontFamily = FontFamily.Serif,
//                fontWeight = FontWeight.Bold,
//                fontSize = 25.sp)
//        }
//

    }


//}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    SplashScreen(rememberNavController())
}

