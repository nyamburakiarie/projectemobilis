package net.ezra.ui.shop


import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.ui.theme.AppTheme



@Composable
fun ShopScreen(navController: NavHostController) {



LazyColumn (modifier = Modifier
    .fillMaxSize()

    .padding(12.dp),
) {
    item {




//    column starts here

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xff1D8348))
                    .padding(12.dp),

                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Image(
                    painter = painterResource(id = R.drawable.landicon2),
                    contentDescription = "Logo",
                    colorFilter = ColorFilter.tint(Color.Gray)
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


            }

            Spacer(modifier = Modifier.height(10.dp))
            LazyRow {
                item {

                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.malindisliding),
                            contentDescription = ""
                        )
                    }

                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.nanyukisliding),
                            contentDescription = ""
                        )
                    }

                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.vipingosliding),
                            contentDescription = ""
                        )
                    }


                }
//            item ends here
            }
            //            lazyrow ends here

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Featured Properties",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                color = Color(0xffC70039),
                modifier = Modifier.padding(start = 80.dp)
            )

//        any value additions not promised by orangeacre realty shall be undertaken at the clients expense

            Spacer(modifier = Modifier.height(5.dp))

//        Text(text = "Coast View Ridge - Vipingo" ,
//modifier = Modifier.padding(start = 40.dp)
//            )

            Spacer(modifier = Modifier.height(5.dp))

            Column(modifier = Modifier.background(Color(0xff1D8348))) {


                Image(painter = painterResource(id = R.drawable.optiven1), contentDescription = "")

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "Coast View Ridge - Vipingo",
                    fontSize = 20.sp,
                    color = Color(0xffFFC300),
                    modifier = Modifier.padding(start = 40.dp)
                )
                Row(modifier = Modifier.padding(start = 70.dp)) {

                    Image(imageVector = Icons.Default.Star, contentDescription = "")
                    Image(imageVector = Icons.Default.Star, contentDescription = "")
                    Image(imageVector = Icons.Default.Star, contentDescription = "",)

                }
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Located 4.5kms from the Indian Ocean",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Just a mile from The Technical University of Mombasa",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Electricity and Water on site",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "1/8th and 1/4th acre properties available from prices as low as 1.75M",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Installments of up to 12 months",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row(modifier = Modifier.padding(start = 70.dp)) {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)

                    Image(painterResource(id = R.drawable.school), contentDescription = "",)

                    Spacer(modifier = Modifier.width(5.dp))

                    Image(painterResource(id = R.drawable.electricity), contentDescription = "",)

                }


            }

//        column1 ends here

            Spacer(modifier = Modifier.height(13.dp))

//        Text(text = "Mukanzi Gardens - Kitale" ,
//            modifier = Modifier.padding(start = 40.dp)
//        )

            Spacer(modifier = Modifier.height(5.dp))

            Column(modifier = Modifier.background(Color(0xff1D8348))) {


                Image(painter = painterResource(id = R.drawable.optiven1), contentDescription = "")

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "Mukanzi Gardens - Kitale",
                    color = Color(0xffFFC300),
                    modifier = Modifier.padding(start = 40.dp)
                )
                Row(modifier = Modifier.padding(start = 70.dp)) {

                    Image(imageVector = Icons.Default.Star, contentDescription = "")
                    Image(imageVector = Icons.Default.Star, contentDescription = "")
                    Image(imageVector = Icons.Default.Star, contentDescription = "",)

                }
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Where else but the esteemed Western Kenya",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "With compacted murram roads",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Electricity and Water on site",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "1/8th acre properties available for as low as 1.9M",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Installments of up to 12 months",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row(modifier = Modifier.padding(start = 70.dp)) {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)

                    Column {
                        Image(painterResource(id = R.drawable.bank), contentDescription = "",)
                        Text(
                            text = "banks",
                            fontFamily = FontFamily.Cursive
                        )
                    }

                    Spacer(modifier = Modifier.width(5.dp))
                    Column {
                        Image(
                            painterResource(id = R.drawable.residential),
                            contentDescription = "",
                        )
                        Text(
                            text = "gated communities",
                            fontFamily = FontFamily.Cursive
                        )
                    }

                }


            }

//        column2 ends here

            Spacer(modifier = Modifier.height(13.dp))

//        Text(text = "Furaha Farms - Kajiado" ,
//            modifier = Modifier.padding(start = 40.dp)
//        )

            Spacer(modifier = Modifier.height(5.dp))

            Column(modifier = Modifier.background(Color(0xff1D8348))) {


                Image(painter = painterResource(id = R.drawable.optiven3), contentDescription = "")

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "Furaha Farms - Kajiado",
                    fontSize = 20.sp,
                    color = Color(0xffFFC300),
                    modifier = Modifier.padding(start = 40.dp)
                )
                Row(modifier = Modifier.padding(start = 70.dp)) {

                    Image(imageVector = Icons.Default.Star, contentDescription = "")
                    Image(imageVector = Icons.Default.Star, contentDescription = "")
                    Image(imageVector = Icons.Default.Star, contentDescription = "",)
                    Image(imageVector = Icons.Default.Star, contentDescription = "",)
                }
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Unlock the full potential of your ranching ambitions with our expansive, fertile lands now available.",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Enjoy ample grasslands and the serene beauty of open skies.",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Reliable water sources",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Properties available for as low as Ksh399000",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Limited plots available.",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row(modifier = Modifier.padding(start = 70.dp)) {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)

                    Column {
                        Image(
                            painterResource(id = R.drawable.electricity),
                            contentDescription = "",
                        )
                        Text(
                            text = "Well lit",
                            fontFamily = FontFamily.Cursive
                        )
                    }

                    Spacer(modifier = Modifier.width(5.dp))
                    Column {
                        Image(
                            painterResource(id = R.drawable.residential),
                            contentDescription = "",
                        )
                        Text(
                            text = "Build or expand",
                            fontFamily = FontFamily.Cursive
                        )
                    }

                }


            }

//        column3 ends here
            Spacer(modifier = Modifier.height(13.dp))
//
//        Text(text = "Global Trade Hub Park" ,
//            modifier = Modifier.padding(start = 40.dp)
//        )

            Spacer(modifier = Modifier.height(5.dp))

            Column(modifier = Modifier.background(Color(0xff1D8348))) {


                Image(painter = painterResource(id = R.drawable.optiven3), contentDescription = "")

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "Global Trade Hub Park",
                    color = Color(0xffFFC300),
                    modifier = Modifier.padding(start = 40.dp)
                )
                Row(modifier = Modifier.padding(start = 70.dp)) {

                    Image(imageVector = Icons.Default.Star, contentDescription = "")
                    Image(imageVector = Icons.Default.Star, contentDescription = "")
                    Image(imageVector = Icons.Default.Star, contentDescription = "",)
                    Image(imageVector = Icons.Default.Star, contentDescription = "",)
                    Image(imageVector = Icons.Default.Star, contentDescription = "",)

                }
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Seize the opportunity to elevate your business at Global Trade Hub Park",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Where industry meets innovation on strategically located land. ",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }


                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Direct connection to major highways,railways and international airports.",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Robust water and sewage systems",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }


                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "State of the art communication systems",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }


                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "High capacity electrical grids ready to support heavy machinery.",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Secure your Business Future today. Plots are available for as low as 3.9M",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Installments of up to 12 months",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row(modifier = Modifier.padding(start = 70.dp)) {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)

                    Column {
                        Image(painterResource(id = R.drawable.bank), contentDescription = "",)
                        Text(
                            text = "banks",
                            fontFamily = FontFamily.Cursive
                        )
                    }

                    Spacer(modifier = Modifier.width(5.dp))
                    Column {
                        Image(
                            painterResource(id = R.drawable.electricity),
                            contentDescription = "",
                        )
                        Text(
                            text = "electricity",
                            fontFamily = FontFamily.Cursive
                        )
                    }

                    Spacer(modifier = Modifier.width(5.dp))
                    Column {
                        Image(painterResource(id = R.drawable.airport), contentDescription = "",)
                        Text(
                            text = "airstrips",
                            fontFamily = FontFamily.Cursive
                        )
                    }

                }


            }
//        column4 ends here

            Spacer(modifier = Modifier.height(13.dp))

//        Text(text = "Furaha Farms - Kajiado" ,
//            modifier = Modifier.padding(start = 40.dp)
//        )

            Spacer(modifier = Modifier.height(5.dp))

            Column(modifier = Modifier.background(Color(0xff1D8348))) {


                Image(painter = painterResource(id = R.drawable.optiven3), contentDescription = "")

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "Furaha Farms - Kajiado",
                    fontSize = 20.sp,
                    color = Color(0xffFFC300),
                    modifier = Modifier.padding(start = 40.dp)
                )
                Row(modifier = Modifier.padding(start = 70.dp)) {

                    Image(imageVector = Icons.Default.Star, contentDescription = "")
                    Image(imageVector = Icons.Default.Star, contentDescription = "")
                    Image(imageVector = Icons.Default.Star, contentDescription = "",)
                    Image(imageVector = Icons.Default.Star, contentDescription = "",)
                }
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "ranching",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "With compacted murram roads",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Electricity and Water on site",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "1/8th acre properties available for as low as 1.9M",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Installments of up to 12 months",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row(modifier = Modifier.padding(start = 70.dp)) {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)

                    Column {
                        Image(painterResource(id = R.drawable.bank), contentDescription = "",)
                        Text(
                            text = "banks",
                            fontFamily = FontFamily.Cursive
                        )
                    }

                    Spacer(modifier = Modifier.width(5.dp))
                    Column {
                        Image(
                            painterResource(id = R.drawable.residential),
                            contentDescription = "",
                        )
                        Text(
                            text = "gated communities",
                            fontFamily = FontFamily.Cursive
                        )
                    }

                }


            }
//        column5 ends here


            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = "Current Offers",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color(0xffC70039),
                modifier = Modifier.padding(start = 80.dp)
            )

//lands on offer


            Spacer(modifier = Modifier.height(10.dp))
//
//        Text(text = "Ushindi Gardens Nakuru" ,
//            modifier = Modifier.padding(start = 40.dp)
//        )

            Spacer(modifier = Modifier.height(5.dp))

            Column(modifier = Modifier.background(Color(0xff1D8348))) {


                Image(painter = painterResource(id = R.drawable.optiven3), contentDescription = "")

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "Ushindi Gardens Nakuru",
                    fontSize = 20.sp,
                    color = Color(0xffFFC300),
                    modifier = Modifier.padding(start = 40.dp)
                )
                Row(modifier = Modifier.padding(start = 70.dp)) {

                    Image(imageVector = Icons.Default.Star, contentDescription = "")
                    Image(imageVector = Icons.Default.Star, contentDescription = "")
                    Image(imageVector = Icons.Default.Star, contentDescription = "",)
                    Image(imageVector = Icons.Default.Star, contentDescription = "",)
                }
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Well selected location within Nakuru metropolis.",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Natural water sources and fertile soil create an optimal environment formlivestock and crop production.",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Easy access to local markets and main roads.",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Plots are available for as low as 1.5M",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)
                    Text(
                        text = "Don't miss out!! These plots are selling fast at these prices ",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }

                Row(modifier = Modifier.padding(start = 70.dp)) {
                    Image(imageVector = Icons.Default.Check, contentDescription = "",)

                    Column {
                        Image(painterResource(id = R.drawable.bank), contentDescription = "",)
                        Text(
                            text = "banks",
                            fontFamily = FontFamily.Cursive
                        )
                    }

                    Spacer(modifier = Modifier.width(5.dp))
                    Column {
                        Image(
                            painterResource(id = R.drawable.residential),
                            contentDescription = "",
                        )
                        Text(
                            text = "gated communities",
                            fontFamily = FontFamily.Cursive
                        )
                    }

                    Column {
                        Image(
                            painterResource(id = R.drawable.electricity),
                            contentDescription = "",
                        )
                        Text(
                            text = "Well lit",
                            fontFamily = FontFamily.Cursive
                        )
                    }

                }


            }

//column offers ends here


            Spacer(modifier = Modifier.height(5.dp))
            Row {
                Image(imageVector = Icons.Default.Call, contentDescription = "",)

                Text(
                    modifier = Modifier
                        .padding(start = 40.dp)
                        .clickable {
                            navController.navigate(ROUTE_CONTACT) {
                                popUpTo(ROUTE_SHOP) { inclusive = true }
                            }

                        },

                    text = "Call us now. Your land, your future, your way!!",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Cursive,

                    )

            }


    }
}


}



@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ShopScreen(rememberNavController())
}

