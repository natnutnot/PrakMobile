package com.example.gracemanhwa_picks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.*
import androidx.navigation.navArgument
import com.example.gracemanhwa_picks.ui.theme.GracemanhwaPicksTheme

data class Manhwa(
    val id: Int,
    val title: String,
    val author: String,
    val description: String,
    val imageRes: Int,
    val url: String
)

val manhwaList = listOf(
    Manhwa(
        1,
        "Solo Leveling",
        "Chu-Gong",
        "In a world where hunters — human warriors who possess supernatural abilities — must battle deadly monsters to protect all mankind from certain annihilation, a notoriously weak hunter named Sung Jin-woo finds himself in a seemingly endless struggle for survival. "
                + "One day, after narrowly surviving an overwhelmingly powerful double dungeon that nearly wipes out his entire party, a mysterious program called the System chooses him as its sole player and in turn, gives him the unique ability to level up in strength. "
                + "This is something no other hunter is able to do, as a hunter's abilities are set once they awaken. Jinwoo then sets out on a journey as he fights against all kinds of enemies, both man and monster, to discover the secrets of the dungeons and the true source of his powers. "
                + "He soon discovers that he has been chosen to inherit the position of Shadow Monarch, essentially turning him into an immortal necromancer who has absolute rule over the dead. "
                + "He is the only Monarch who fights to save humanity, as the other Monarchs are all trying to kill him and wipe out the humans.",
        R.drawable.solo_leveling,
        "https://www.tappytoon.com/en/book/solo-leveling-official"
    ),
    Manhwa(
        2,
        "Omniscient Reader",
        "SingNSong",
        "Kim Dokja is a young man leading a simple life, who has been the sole reader of a novel \"Three Ways to Survive in a Ruined World\" for 13 years of his life. "
                + "As he was reading the novel's final chapter, reality and the world of fiction started to merge, allowing him to appear at the beginning point of the story. "
                + "Being the only person who knew how the world could end, Kim Dokja is determined to create a different ending by solving and conquering various challenges, known as scenarios, which are operated by dokkaebi.",
        R.drawable.omniscient_reader,
        "https://www.webtoons.com/en/action/omniscient-reader/list?title_no=2154"
    ),
    Manhwa(
        3,
        "The Beginning After the End",
        "TurtleMe",
        "It follows the life of the late King Grey after his untimely and mysterious death. Reborn as Arthur Leywin, he seeks to correct his past mistakes in the vibrant new continent of Dicathen, a world of magic and fantastical creatures. "
                + "Equipped with the knowledge of a powerful king in his mid-thirties, Arthur navigates his new life as the magic-wielding child of two retired adventurers and gains purpose through each of his new experiences—something he lacked in his previous life. "
                + "When a kind dragon sacrifices her life to protect him, Arthur resolves to live a sincere, kind, and courageous life with those he loves. With the help of a lost elf princess and the Elven Kingdom of Elenoir, Arthur begins his long journey to find his true place in the world.\n\n"
                + "As the years pass, Arthur becomes more and more comfortable in this world, positioning himself as a young, but respected figure. However, deja-vu strikes as a war brews between Dicathen and the Vritra, a clan of banished deities now ruling over a faraway continent. "
                + "Arthur must rise as a leader, despite his fear of becoming the war-hardened monster he once was in his past life. "
                + "As the war rages on, Arthur discovers that he was not reborn to this world by chance...nor was he the only one.",
        R.drawable.tbate,
        "https://tapas.io/series/tbate-comic/info"
    ),
    Manhwa(
        4,
        "Eleceed",
        "Jeho Son",
        "Jiwoo is a kind-hearted young man who harnesses the lightning-quick reflexes of a cat to secretly make the world a better place – one saved little child or foster pet at a time. "
                + "Kayden is a secret agent on the run, who finds himself stuck in the body of a…um…decidedly fat old fluffy cat. "
                + "Together, armed with Jiwoo’s superpowers and Kayden’s uber-smarts, they’re out to fight those forces who would let evil rule this world. "
                + "That is, if they can stand each other long enough to get the job done.",
        R.drawable.eleceed,
        "https://www.webtoons.com/en/action/eleceed/list?title_no=1571"
    ),
    Manhwa(
        5,
        "Killer Peter",
        "Kim Junghyun",
        "On the surface, Glory Hound is a simple human rights organization. In reality, the organization has some of the best assassins in the world, in charge of performing legendary.\n\n"
                + "One of their best members was simply known as Apostle Peter, and he retired in protest of the new leader, Raphael. However, resignations were not accepted, and Peter was soon ambushed. Despite his best efforts, he dies.\n\n"
                + "Instead of dying, though, Peter miraculously found himself back in his teenage body. He doesn't know why, but he knows one thing: he will destroy Glory Hound.",
        R.drawable.killer_peter,
        "https://www.webtoons.com/en/action/killer-peter/list?title_no=5816"
    ),
    Manhwa(
        6,
        "Player Who Can't Level Up",
        "GaVinGe",
        "When Kim Kigyu received his invitation to become a player (a unique-ability player, at that), he thought his struggles were over. But no matter how hard he tries, he just can’t seem to get past level 1! "
                + "After five years of working as a guide on the lower floors of the tower, he’s finally discovered his ability to link with “Egos” and raise his stats. "
                + "As his new skills unlock adventures in unexplored gates, Kigyu gets his chance to defy expectations and show the world that rank isn’t everything.",
        R.drawable.player_cant_level_up,
        "https://tapas.io/episode/2414063"
    ),
    Manhwa(
        7,
        "SSS-Class Revival Hunter",
        "Shinnoa",
        "After the Tower suddenly appeared, individuals who wished to pursue their personal values began to inhabit it, coming to be called \"hunters.\" "
                + "Everyone had their own goals, but only a chosen few were acknowledged and given powerful skills by the mysterious structure. "
                + "Kim Gong-Ja, a weak F-Class hunter without any skills, is envious of those who were blessed by the Tower. "
                + "Letting his jealousy overcome him one day, Gong-Ja abruptly receives a S-Class skill that allows him to copy a skill from someone else—after they kill him.\n\n"
                + "Sooner than he likes, Gong-Ja gets to test his newly acquired ability on the legendary hunter known as the Flame Emperor. "
                + "As he is dying, Gong-Ja learns the evil truth about the man he once admired the most. "
                + "Receiving another potent skill that allows him to revive and go back in time by 24 hours, Gong-Ja devises a plan to travel 11 years into the past to eliminate the Flame Emperor and cement himself as the world's best hunter.",
        R.drawable.sss_class_hunter,
        "https://www.mangaread.org/manga/sss-class-suicide-hunter/"
    )
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GracemanhwaPicksTheme {
                val navController = rememberNavController()
                NavHost(navController, startDestination = "list") {
                    composable("list") {
                        ListScreen(navController)
                    }
                    composable(
                        "detail/{id}",
                        arguments = listOf(navArgument("id") { type = NavType.IntType })
                    ) { backStackEntry ->
                        val id = backStackEntry.arguments?.getInt("id") ?: 0
                        val item = manhwaList.first { it.id == id }
                        DetailScreen(item)
                    }
                }
            }
        }
    }
}