package com.example.arte

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.arte.ui.theme.ArteTheme
import com.example.arte.model.Obras
import androidx.compose.material3.Card
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.ui.unit.dp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import com.example.arte.data.Datasource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArteTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ObrasApp()
                }
            }
        }
    }
}

@Composable
fun ObrasApp() {
    ObrasList(
        ObrasList = Datasource().loadObras(),
    )
}

@Composable
fun ObrasCard(obras: Obras, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            Image(
                painter = painterResource(obras.imagenPorId),
                contentDescription = stringResource(obras.textoPorId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = LocalContext.current.getString(obras.textoTitulo),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.titleLarge
            )

            Text(
                text = LocalContext.current.getString(obras.textoPorId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}

@Preview
@Composable
private fun ObrasCardPreview() {
    ObrasCard(Obras(R.string.titulo1, R.string.obra1, R.drawable.la_mona_lisa))
}

@Composable
fun ObrasList(ObrasList: List<Obras>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(ObrasList) { obras ->
            ObrasCard(
                obras = obras,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}