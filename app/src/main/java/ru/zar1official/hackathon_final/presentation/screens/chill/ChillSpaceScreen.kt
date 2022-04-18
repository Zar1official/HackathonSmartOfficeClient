package ru.zar1official.hackathon_final.presentation.screens

//@Composable
//@Preview
//fun ChillSpaceScreen() {
//    Box(
//        modifier = Modifier
//            .fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ) {
//        LazyColumn(
//            verticalArrangement = Arrangement.Center,
//            contentPadding = PaddingValues(
//                top = 5.dp,
//                bottom = 5.dp,
//                start = 10.dp,
//                end = 10.dp
//            ),
//            content = {
//                item {
//                    Card(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(200.dp)
//                            .background(color = Color.White),
//                        shape = RoundedCornerShape(10.dp),
//                        elevation = 2.dp
//                    ) {
//                        Row(
//                            verticalAlignment = Alignment.CenterVertically
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.ic_chair),
//                                contentDescription = ""
//                            )
//
//                            DropDownMenu(
//                                suggestions = listOf(
//                                    MassageMode.None,
//                                    MassageMode.Vibration,
//                                    MassageMode.AirCompression
//                                ),
//                                modifier = Modifier.padding(20.dp)
//                            )
//
//                        }
//                    }
//                }
//            }
//        )
//    }
//}