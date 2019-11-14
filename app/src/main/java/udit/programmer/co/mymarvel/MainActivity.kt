package udit.programmer.co.mymarvel

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.par_item.*

class MainActivity : AppCompatActivity() {


    val moviename = arrayOf(
        "Captain America(Serial)",
        "Howard The Duck",
        "The Puniser",
        "Captain America(Movie)",
        "The Fantistic Four",
        "Blade",
        "X-Men",
        "Blade II",
        "Spider Man",
        "Daredevil",
        "X2",
        "Hulk",
        "The Puniser(Movie)",
        "SpiderMan 2",
        "Blade: Trinity",
        "Elektra",
        "Fantastic Four",
        "X-Men : The Last Stand",
        "Ghost Rider",
        "SpiderMan 3",
        "Fantastic Four: Rise of the Silver Surfer",
        "Iron Man",
        "The Incredible Hulk",
        "Iron Man 2",
        "Thor",
        "Captain America: The First Avenger",
        "The Avengers",
        "Iron Man 3",
        "Thor: The Dark World",
        "Captain America: The Winter Soldier",
        "Guardians of the Galaxy",
        "Avengers: Age of Ultron",
        "Ant-Man",
        "Captain America: Civil War",
        "Doctor Strange",
        "Guardians of the Galaxy Vol. 2",
        "Spider-Man: Homecoming",
        "Thor: Ragnarok",
        "Black Panther",
        "Avengers: Infinity War",
        "Ant-Man and the Wasp",
        "Captain Marvel",
        "Avengers: Endgame",
        "Spider-Man: Far From Home"
    )
    val year = arrayOf(
        "1944", "1986", "1989", "1990",
        "1994", "1998", "2000", "2002",
        "2002", "2003", "2003", "2003",
        "2004", "2004", "2004", "2005",
        "2005", "2006", "2007", "2007",
        "2007",
        "2008", "2008", "2010", "2011",
        "2011", "2012", "2013", "2013",
        "2014", "2014", "2015", "2015",
        "2016", "2016", "2017", "2017",
        "2017", "2018", "2018", "2018",
        "2019", "2019", "2019"
    )
    val image = arrayOf(

        R.drawable.captainamericaserial,
        R.drawable.howard,
        R.drawable.thepuniser,
        R.drawable.captainamericaserial2,
        R.drawable.fantastic,
        R.drawable.blade,
        R.drawable.xmen,
        R.drawable.blade2,
        R.drawable.spiderman,
        R.drawable.daredevil,
        R.drawable.x2,
        R.drawable.hulk001,
        R.drawable.puniser,
        R.drawable.spiderman2,
        R.drawable.blade3,
        R.drawable.elektra,
        R.drawable.fantastic2,
        R.drawable.xmen2,
        R.drawable.ghost,
        R.drawable.spiderman3,
        R.drawable.fantastic3,
        R.drawable.ironman,
        R.drawable.hulk,
        R.drawable.ironman2,
        R.drawable.thor,
        R.drawable.captainamerica,
        R.drawable.avengers,
        R.drawable.ironman3,
        R.drawable.thorthedarkworld,
        R.drawable.captainamericathewintersoldier,
        R.drawable.guardiansofthegalaxy,
        R.drawable.avengersageofultron,
        R.drawable.antman,
        R.drawable.captainamericacivilwar,
        R.drawable.doctorstrange,
        R.drawable.guardiansofthegalaxyvol2,
        R.drawable.spidermanhomecoming,
        R.drawable.thorrangnrock,
        R.drawable.blackpanther,
        R.drawable.avengersinfinitywar,
        R.drawable.antmanandthewasp,
        R.drawable.captainmarvel,
        R.drawable.avengersendgame,
        R.drawable.spidermanfarfromhome
    )

    val links = arrayOf(
        "en.wikipedia.org/wiki/Captain_America_(serial)",
        "en.wikipedia.org/wiki/Howard_the_Duck_(film)",
        "en.wikipedia.org/wiki/The_Punisher_(1989_film)",
        "en.wikipedia.org/wiki/Captain_America_(1990_film)",
        "en.wikipedia.org/wiki/The_Fantastic_Four_(unreleased_film)",
        "en.wikipedia.org/wiki/Blade_(film)",
        "en.wikipedia.org/wiki/X-Men_(film)",
        "en.wikipedia.org/wiki/Blade_II",
        "en.wikipedia.org/wiki/Spider-Man_(2002_film)",
        "en.wikipedia.org/wiki/Daredevil_(film)",
        "en.wikipedia.org/wiki/X2_(film)",
        "en.wikipedia.org/wiki/Hulk_(film)",
        "en.wikipedia.org/wiki/The_Punisher_(2004_film)",
        "en.wikipedia.org/wiki/Spider-Man_2",
        "en.wikipedia.org/wiki/Blade:_Trinity",
        "en.wikipedia.org/wiki/Elektra_(2005_film)",
        "en.wikipedia.org/wiki/Fantastic_Four_(2005_film)",
        "en.wikipedia.org/wiki/X-Men:_The_Last_Stand",
        "en.wikipedia.org/wiki/Ghost_Rider_(2007_film)",
        "en.wikipedia.org/wiki/Spider-Man_3",
        "en.wikipedia.org/wiki/Fantastic_Four:_Rise_of_the_Silver_Surfer",
        "en.wikipedia.org/wiki/Iron_Man_(2008_film)",
        "en.wikipedia.org/wiki/The_Incredible_Hulk_(film)",
        "en.wikipedia.org/wiki/Iron_Man_2",
        "en.wikipedia.org/wiki/Thor_(film)",
        "en.wikipedia.org/wiki/Captain_America:_The_First_Avenger",
        "en.wikipedia.org/wiki/The_Avengers_(2012_film)",
        "en.wikipedia.org/wiki/Iron_Man_3",
        "en.wikipedia.org/wiki/Thor:_The_Dark_World",
        "en.wikipedia.org/wiki/Captain_America:_The_Winter_Soldier",
        "en.wikipedia.org/wiki/Guardians_of_the_Galaxy_(film)",
        "en.wikipedia.org/wiki/Avengers:_Age_of_Ultron",
        "en.wikipedia.org/wiki/Ant-Man_(film)",
        "en.wikipedia.org/wiki/Captain_America:_Civil_War",
        "en.wikipedia.org/wiki/Doctor_Strange_(2016_film)",
        "en.wikipedia.org/wiki/Guardians_of_the_Galaxy_Vol._2",
        "en.wikipedia.org/wiki/Spider-Man:_Homecoming",
        "en.wikipedia.org/wiki/Thor:_Ragnarok",
        "en.wikipedia.org/wiki/Black_Panther_(film)",
        "en.wikipedia.org/wiki/Avengers:_Infinity_War",
        "en.wikipedia.org/wiki/Ant-Man_and_the_Wasp",
        "en.wikipedia.org/wiki/Captain_Marvel_(film)",
        "en.wikipedia.org/wiki/Avengers:_Endgame",
        "en.wikipedia.org/wiki/Spider-Man:_Far_From_Home"
    )

    val list: ArrayList<Movie> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        for (i in 0..43) {
            list.add(
                Movie(
                    moviename[i],
                    year[i],
                    image[i],
                    links[i]
                )
            )
        }

        val adapter = MovieAdapter(list)
        adapter.onItemClickListener = object : MovieOnItemClickListener {
            override fun onClick(movie: Movie) {
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://${movie.link}"))
                startActivity(Intent.createChooser(i, "Select Browser"))
            }
        }
        lv.adapter = adapter

    }
}
