package com.max.foodies.screens.catalogueScreen.composeItems

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.max.foodies.ui.theme.ComposeIcon
import com.max.foodies.ui.theme.ComposeIcons
import com.max.foodies.ui.theme.Orange

@Composable
fun CatalogueTopBar(
    onSearch: () -> Unit,
    modifier: Modifier
) {
    var onShowSearchBar by rememberSaveable {
        mutableStateOf(false)
    }

    Column {
        Row() {
            IconButton(
                modifier = modifier.padding(8.dp),
                onClick = { /*TODO*/ }
            ) {
                ComposeIcon(resourceId = ComposeIcons.filter, annotation = "filter")
            }
            if (onShowSearchBar) {

            } else {
                ComposeIcon(
                    modifier = modifier
                        .weight(1f)
                        .fillMaxHeight(),
                    resourceId = ComposeIcons.logo,
                    annotation = "logo",
                    tint = Orange
                )
            }


            IconButton(
                modifier = modifier.padding(8.dp),
                onClick = { onSearch }
            ) {
                ComposeIcon(resourceId = ComposeIcons.search, annotation = "search")
            }

        }

    }


}


//@Preview(showBackground = true, widthDp = 320, heightDp = 64)
//@Composable
//fun CatalogueTopBarPreview() {
//    CatalogueTopBar(Modifier)
//}