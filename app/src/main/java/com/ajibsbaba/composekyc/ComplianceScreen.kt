package com.ajibsbaba.composekyc

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ajibsbaba.composekyc.ui.theme.Blue30
import com.ajibsbaba.composekyc.ui.theme.Blue40
import com.ajibsbaba.composekyc.ui.theme.DarkGrey
import com.ajibsbaba.composekyc.ui.theme.Purple
import com.ajibsbaba.composekyc.ui.theme.Typography

@Composable
fun ComplianceScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkGrey), verticalArrangement = Arrangement.Bottom
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, bottom = 40.dp)
                .background(Color.White, shape = RoundedCornerShape(size = 24.dp))
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Bottom),
            ) {
                Image(
                    painter = painterResource(id = R.drawable._04),
                    contentDescription = "Vector Asset"
                )
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                )
                {
                    Text(
                        text = stringResource(id = R.string.one_more_thing),
                        style = Typography.titleLarge
                    )
                    Text(
                        text = stringResource(id = R.string.cbn_policy),
                        style = TextStyle(
                            fontSize = 15.sp,
                            lineHeight = 22.5.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xFFA3A3A3),
                        )
                    )
                }
                Column(
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFFD9ECF7),
                            shape = RoundedCornerShape(size = 8.dp)
                        )
                        .width(321.dp)
                        .background(
                            color = Color(0xFFECF5FB),
                            shape = RoundedCornerShape(size = 8.dp)
                        )
                        .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
                )
                {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 16.dp)
                    ) {
                        Icon(
                            modifier = Modifier
                                .width(24.dp)
                                .height(24.dp),
                            painter = painterResource(id = R.drawable.bank),
                            tint = Blue40,
                            contentDescription = "Bank Vector"
                        )
                        Column(
                            verticalArrangement = Arrangement.spacedBy(
                                6.dp,
                                Alignment.CenterVertically
                            )
                        ) {
                            Text(
                                text = stringResource(id = R.string.bvn),
                                style = TextStyle(
                                    fontSize = 15.sp,
                                    lineHeight = 24.sp,
                                    fontWeight = FontWeight(500),
                                    color = Blue40,
                                )
                            )
                            Text(
                                text = stringResource(id = R.string.bvn_code),
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    lineHeight = 24.sp,
                                    fontWeight = FontWeight(500),
                                    color = Blue40,
                                )
                            )
                        }
                    }
                    Divider(color = Color(0xFFD9ECF7), thickness = 1.dp)
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 16.dp, top = 16.dp)
                    ) {
                        Icon(
                            modifier = Modifier
                                .width(24.dp)
                                .height(24.dp),
                            painter = painterResource(id = R.drawable.iris_scan),
                            tint = Blue40,
                            contentDescription = "Bank Vector"
                        )
                        Column(
                            verticalArrangement = Arrangement.spacedBy(
                                6.dp,
                                Alignment.CenterVertically
                            )
                        ) {
                            Text(
                                text = stringResource(id = R.string.face_verification),
                                style = TextStyle(
                                    fontSize = 15.sp,
                                    lineHeight = 24.sp,
                                    fontWeight = FontWeight(500),
                                    color = Blue40,
                                )
                            )
                            Text(
                                text = stringResource(id = R.string.camera_background_copy),
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    lineHeight = 24.sp,
                                    fontWeight = FontWeight(500),
                                    color = Color(0xFF66B3E0),
                                )
                            )
                        }
                    }
                    Divider(color = Color(0xFFD9ECF7), thickness = 1.dp)
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(top = 16.dp)
                    ) {
                        Icon(
                            modifier = Modifier
                                .width(24.dp)
                                .height(24.dp),
                            painter = painterResource(id = R.drawable.location_09),
                            tint = Blue40,
                            contentDescription = "Bank Vector"
                        )
                        Column(
                            verticalArrangement = Arrangement.spacedBy(
                                6.dp,
                                Alignment.CenterVertically
                            )
                        ) {
                            Text(
                                text = stringResource(id = R.string.residential_address),
                                style = TextStyle(
                                    fontSize = 15.sp,
                                    lineHeight = 24.sp,
                                    fontWeight = FontWeight(500),
                                    color = Color(0xFF40A0D8),
                                )
                            )
                            Text(
                                text = stringResource(id = R.string.document_upload),
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    lineHeight = 24.sp,
                                    fontWeight = FontWeight(500),
                                    color = Color(0xFF66B3E0),
                                )
                            )
                        }
                    }
                }
                Row(
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFFD9ECF7),
                            shape = RoundedCornerShape(size = 24.dp)
                        )
                        .fillMaxWidth()
                        .height(40.dp)
                        .padding(start = 16.dp, top = 4.dp, bottom = 4.dp, end = 4.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = stringResource(id = R.string.estimated_completion_time),
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xFF949494),
                        )
                    )
                    Row(
                        modifier = Modifier
                            .background(
                                color = Color(0xFFECF5FB),
                                shape = RoundedCornerShape(size = 24.dp)
                            )
                            .padding(start = 8.dp, top = 4.dp, end = 8.dp, bottom = 4.dp)
                            .fillMaxHeight(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(9.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.time_quarter_pass),
                            tint = Color(0xFF40A0D8),
                            contentDescription = "Image Vector"
                        )
                        Text(
                            text = stringResource(id = R.string.ten_mins),
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF40A0D8),
                            )
                        )
                    }
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(24.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Button(modifier = Modifier
                        .height(56.dp)
                        .fillMaxWidth(0.3f),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4F5F7)),
                        onClick = { /*TODO*/ }) {
                        Text(
                            text = stringResource(id = R.string.later),
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFF777777),
                                letterSpacing = 0.18.sp,
                            )
                        )
                    }
                    Button(modifier = Modifier
                        .height(56.dp)
                        .fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(containerColor = Purple),
                        onClick = { /*TODO*/ }) {
                        Text(
                            text = stringResource(id = R.string.start),
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight(500),
                                color = Color.White,
                                letterSpacing = 0.18.sp,
                            )
                        )
                    }
                }
            }

        }
    }
}

@Composable
fun CustomerRequirementScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkGrey), verticalArrangement = Arrangement.Bottom
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, bottom = 40.dp)
                .background(Color.White, shape = RoundedCornerShape(size = 24.dp))
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Bottom),
            ) {
                Image(
                    painter = painterResource(id = R.drawable._02),
                    contentDescription = "Vector Asset"
                )
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                )
                {
                    Text(
                        text = stringResource(id = R.string.kyc_requirement),
                        style = Typography.titleLarge
                    )
                    Text(
                        text = stringResource(id = R.string.cbn_description_long),
                        style = TextStyle(
                            fontSize = 15.sp,
                            lineHeight = 22.5.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xFFA3A3A3),
                        )
                    )
                }
                Button(modifier = Modifier
                    .height(56.dp)
                    .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = Purple),
                    onClick = { /*TODO*/ }) {
                    Text(
                        text = stringResource(id = R.string.continue_verification),
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight(500),
                            color = Color.White,
                            letterSpacing = 0.18.sp,
                        )
                    )

                }
            }
        }

    }
}

@Composable
fun VerificationSubmittedScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkGrey), verticalArrangement = Arrangement.Bottom
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, bottom = 40.dp)
                .background(Color.White, shape = RoundedCornerShape(size = 24.dp))
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Bottom),
            ) {
                Image(
                    painter = painterResource(id = R.drawable._01),
                    contentDescription = "Image Asset"
                )
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                )
                {
                    Text(
                        text = stringResource(id = R.string.verification_submitted),
                        style = Typography.titleLarge
                    )
                    Text(
                        text = stringResource(id = R.string.verification_body),
                        style = TextStyle(
                            fontSize = 15.sp,
                            lineHeight = 22.5.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xFFA3A3A3),
                        )
                    )
                }
                Row(
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFFD9ECF7),
                            shape = RoundedCornerShape(size = 24.dp)
                        )
                        .fillMaxWidth()
                        .height(40.dp)
                        .padding(start = 16.dp, top = 4.dp, bottom = 4.dp, end = 4.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = stringResource(id = R.string.we_usually_take),
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xFF949494),
                        )
                    )
                    Row(
                        modifier = Modifier
                            .background(
                                color = Color(0xFFECF5FB),
                                shape = RoundedCornerShape(size = 24.dp)
                            )
                            .padding(start = 8.dp, top = 4.dp, end = 8.dp, bottom = 4.dp)
                            .fillMaxHeight(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(9.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.calendar_icon),
                            tint = Color(0xFF40A0D8),
                            contentDescription = "Image Vector"
                        )
                        Text(
                            text = stringResource(id = R.string.day_count),
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF40A0D8),
                            )
                        )
                    }
                }
                Button(modifier = Modifier
                    .height(56.dp)
                    .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF796CF7)),
                    onClick = { /*TODO*/ }) {
                    Text(
                        text = stringResource(id = R.string.done),
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xFFFFFFFF),
                            letterSpacing = 0.18.sp,
                        )
                    )
                }
            }

        }
    }
}

@Composable
fun VerificationCompleteScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkGrey), verticalArrangement = Arrangement.Bottom
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, bottom = 40.dp)
                .background(Color.White, shape = RoundedCornerShape(size = 24.dp))
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Bottom),
            ) {
                Image(
                    painter = painterResource(id = R.drawable._03),
                    contentDescription = "Image Asset"
                )
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                )
                {
                    Text(
                        text = stringResource(id = R.string.verification_completed),
                        style = Typography.titleLarge
                    )
                    Text(
                        text = "You are set to enjoy the full experience of the app. Fund, invest and transfer without limit. We designed this for you!",
                        style = TextStyle(
                            fontSize = 15.sp,
                            lineHeight = 22.5.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xFFA3A3A3),
                        )
                    )
                }
                Column(
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFFD9ECF7),
                            shape = RoundedCornerShape(size = 8.dp)
                        )
                        .width(321.dp)
                        .background(
                            color = Color(0xFFECF5FB),
                            shape = RoundedCornerShape(size = 8.dp)
                        )
                        .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
                )
                {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 16.dp)
                    ) {
                        Icon(
                            modifier = Modifier
                                .width(24.dp)
                                .height(24.dp),
                            painter = painterResource(id = R.drawable.bank),
                            tint = Blue40,
                            contentDescription = "Bank Vector"
                        )
                        Column(
                            verticalArrangement = Arrangement.spacedBy(
                                6.dp,
                                Alignment.CenterVertically
                            )
                        ) {
                            Text(
                                text = stringResource(id = R.string.deposit_limit),
                                style = TextStyle(
                                    fontSize = 15.sp,
                                    lineHeight = 24.sp,
                                    fontWeight = FontWeight(500),
                                    color = Blue40,
                                )
                            )
                            Text(
                                text = stringResource(id = R.string.unlimited),
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    lineHeight = 24.sp,
                                    fontWeight = FontWeight(500),
                                    color = Blue30,
                                )
                            )
                        }
                    }
                    Divider(color = Color(0xFFD9ECF7), thickness = 1.dp)
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(top = 16.dp)
                    ) {
                        Icon(
                            modifier = Modifier
                                .width(24.dp)
                                .height(24.dp),
                            painter = painterResource(id = R.drawable.iris_scan),
                            tint = Blue40,
                            contentDescription = "Vector Asset"
                        )
                        Column(
                            verticalArrangement = Arrangement.spacedBy(
                                6.dp,
                                Alignment.CenterVertically
                            )
                        ) {
                            Text(
                                text = stringResource(id = R.string.transfer_limit),
                                style = TextStyle(
                                    fontSize = 15.sp,
                                    lineHeight = 24.sp,
                                    fontWeight = FontWeight(500),
                                    color = Blue40,
                                )
                            )
                            Text(
                                text = stringResource(id = R.string.unlimited),
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    lineHeight = 24.sp,
                                    fontWeight = FontWeight(500),
                                    color = Blue30,
                                )
                            )
                        }
                    }
                }

                Row(
                    horizontalArrangement = Arrangement.spacedBy(24.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Button(modifier = Modifier
                        .height(56.dp)
                        .fillMaxWidth(0.3f),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4F5F7)),
                        onClick = { /*TODO*/ }) {
                        Text(
                            text = stringResource(id = R.string.later),
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFF777777),
                                letterSpacing = 0.18.sp,
                            )
                        )
                    }
                    Button(modifier = Modifier
                        .height(56.dp)
                        .fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(containerColor = Purple),
                        onClick = { /*TODO*/ }) {
                        Text(
                            text = stringResource(id = R.string.fund),
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight(500),
                                color = Color.White),
                                letterSpacing = 0.18.sp,
                            )
                    }
                }
            }

        }
    }
}


@Preview
@Composable
fun ComplianceScreenPreview() {
    ComplianceScreen()
}

@Preview
@Composable
fun CustomerScreenPreview() {
    CustomerRequirementScreen()
}

@Preview
@Composable
fun VerificationSubmittedPreview() {
    VerificationSubmittedScreen()
}

@Preview
@Composable
fun VerificationCompletePreview() {
    VerificationCompleteScreen()
}