package com.klobot.animerecommendation;

import java.util.ArrayList;

public class AnimeData {
    private static String[] animeName = {
            "Gintama",
            "Kimi no Na Wa",
            "One Piece",
            "Shigatsu wa Kimi no Uso",
            "Kimetsu no Yaiba",
            "Violet Evergarden",
            "Fate/Zero",
            "Shingeki no Kyojin",
            "Yahari Ore no Seishun Love Comedy wa Machigatteiru.",
            "Saenai Heroine no Sodatekata",
            "Kono Subarashii Sekai ni Shukufuku wo!"
    };

    private static String[] animeDetail ={
            "Gintoki, Shinpachi, and Kagura return as the fun-loving but broke members of the Yorozuya team! Living in an alternate-reality Edo, where swords are prohibited and alien overlords have conquered Japan, they try to thrive on doing whatever work they can get their hands on. However, Shinpachi and Kagura still haven't been paid... Does Gin-chan really spend all that cash playing pachinko?\n" +
                    "\n" +
                    "Meanwhile, when Gintoki drunkenly staggers home one night, an alien spaceship crashes nearby. A fatally injured crew member emerges from the ship and gives Gintoki a strange, clock-shaped device, warning him that it is incredibly powerful and must be safeguarded. Mistaking it for his alarm clock, Gintoki proceeds to smash the device the next morning and suddenly discovers that the world outside his apartment has come to a standstill. With Kagura and Shinpachi at his side, he sets off to get the device fixed; though, as usual, nothing is ever that simple for the Yorozuya team.\n" +
                    "\n" +
                    "Filled with tongue-in-cheek humor and moments of heartfelt emotion, Gintama's fourth season finds Gintoki and his friends facing both their most hilarious misadventures and most dangerous crises yet.",
            "Mitsuha Miyamizu, a high school girl, yearns to live the life of a boy in the bustling city of Tokyo—a dream that stands in stark contrast to her present life in the countryside. Meanwhile in the city, Taki Tachibana lives a busy life as a high school student while juggling his part-time job and hopes for a future in architecture.\n" +
                    "\n" +
                    "One day, Mitsuha awakens in a room that is not her own and suddenly finds herself living the dream life in Tokyo—but in Taki's body! Elsewhere, Taki finds himself living Mitsuha's life in the humble countryside. In pursuit of an answer to this strange phenomenon, they begin to search for one another.\n" +
                    "\n" +
                    "Kimi no Na wa. revolves around Mitsuha and Taki's actions, which begin to have a dramatic impact on each other's lives, weaving them into a fabric held together by fate and circumstance.",
            "Gol D. Roger was known as the \"Pirate King,\" the strongest and most infamous being to have sailed the Grand Line. The capture and execution of Roger by the World Government brought a change throughout the world. His last words before his death revealed the existence of the greatest treasure in the world, One Piece. It was this revelation that brought about the Grand Age of Pirates, men who dreamed of finding One Piece—which promises an unlimited amount of riches and fame—and quite possibly the pinnacle of glory and the title of the Pirate King.\n" +
                    "\n" +
                    "Enter Monkey D. Luffy, a 17-year-old boy who defies your standard definition of a pirate. Rather than the popular persona of a wicked, hardened, toothless pirate ransacking villages for fun, Luffy’s reason for being a pirate is one of pure wonder: the thought of an exciting adventure that leads him to intriguing people and ultimately, the promised treasure. Following in the footsteps of his childhood hero, Luffy and his crew travel across the Grand Line, experiencing crazy adventures, unveiling dark mysteries and battling strong enemies, all in order to reach the most coveted of all fortunes—One Piece.",
            "Music accompanies the path of the human metronome, the prodigious pianist Kousei Arima. But after the passing of his mother, Saki Arima, Kousei falls into a downward spiral, rendering him unable to hear the sound of his own piano.\n" +
                    "\n" +
                    "Two years later, Kousei still avoids the piano, leaving behind his admirers and rivals, and lives a colorless life alongside his friends Tsubaki Sawabe and Ryouta Watari. However, everything changes when he meets a beautiful violinist, Kaori Miyazono, who stirs up his world and sets him on a journey to face music again.\n" +
                    "\n" +
                    "Based on the manga series of the same name, Shigatsu wa Kimi no Uso approaches the story of Kousei's recovery as he discovers that music is more than playing each note perfectly, and a single melody can bring in the fresh spring air of April.",
            "Ever since the death of his father, the burden of supporting the family has fallen upon Tanjirou Kamado's shoulders. Though living impoverished on a remote mountain, the Kamado family are able to enjoy a relatively peaceful and happy life. One day, Tanjirou decides to go down to the local village to make a little money selling charcoal. On his way back, night falls, forcing Tanjirou to take shelter in the house of a strange man, who warns him of the existence of flesh-eating demons that lurk in the woods at night.\n" +
                    "\n" +
                    "When he finally arrives back home the next day, he is met with a horrifying sight—his whole family has been slaughtered. Worse still, the sole survivor is his sister Nezuko, who has been turned into a bloodthirsty demon. Consumed by rage and hatred, Tanjirou swears to avenge his family and stay by his only remaining sibling. Alongside the mysterious group calling themselves the Demon Slayer Corps, Tanjirou will do whatever it takes to slay the demons and protect the remnants of his beloved sister's humanity.",
            "The Great War finally came to an end after four long years of conflict; fractured in two, the continent of Telesis slowly began to flourish once again. Caught up in the bloodshed was Violet Evergarden, a young girl raised for the sole purpose of decimating enemy lines. Hospitalized and maimed in a bloody skirmish during the War's final leg, she was left with only words from the person she held dearest, but with no understanding of their meaning.\n" +
                    "\n" +
                    "Recovering from her wounds, Violet starts a new life working at CH Postal Services after a falling out with her new intended guardian family. There, she witnesses by pure chance the work of an \"Auto Memory Doll,\" amanuenses that transcribe people's thoughts and feelings into words on paper. Moved by the notion, Violet begins work as an Auto Memory Doll, a trade that will take her on an adventure, one that will reshape the lives of her clients and hopefully lead to self-discovery.",
            "As the Fourth Holy Grail War rages on with no clear victor in sight, the remaining Servants and their Masters are called upon by Church supervisor Risei Kotomine, in order to band together and confront an impending threat that could unravel the Grail War and bring about the destruction of Fuyuki City. The uneasy truce soon collapses as Masters demonstrate that they will do anything in their power, no matter how despicable, to win.\n" +
                    "\n" +
                    "Seeds of doubt are sown between Kiritsugu Emiya and Saber, his Servant, as their conflicting ideologies on heroism and chivalry clash. Meanwhile, an ominous bond forms between Kirei Kotomine, who still seeks to find his purpose in life, and one of the remaining Servants. As the countdown to the end of the war reaches zero, the cost of winning begins to blur the line between victory and defeat.",
            "Hundreds of years ago, horrifying creatures which resembled humans appeared. These mindless, towering giants, called \"titans,\" proved to be an existential threat, as they preyed on whatever humans they could find in order to satisfy a seemingly unending appetite. Unable to effectively combat the titans, mankind was forced to barricade themselves within large walls surrounding what may very well be humanity's last safe haven in the world.\n" +
                    "\n" +
                    "In the present day, life within the walls has finally found peace, since the residents have not dealt with titans for many years. Eren Yeager, Mikasa Ackerman, and Armin Arlert are three young children who dream of experiencing all that the world has to offer, having grown up hearing stories of the wonders beyond the walls. But when the state of tranquility is suddenly shattered by the attack of a massive 60-meter titan, they quickly learn just how cruel the world can be. On that day, Eren makes a promise to himself that he will do whatever it takes to eradicate every single titan off the face of the Earth, with the hope that one day, humanity will once again be able to live outside the walls without fear.",
            "Hachiman Hikigaya, a student in Soubu High School, is a cynical loner due to his traumatic past experiences in his social life. This eventually led to him developing a set of \"dead fish eyes\" and a twisted personality similar to that of a petty criminal. Believing that the concept of youth is a lie made up by youngsters who face their failures in denial, he turns in an essay that criticizes this exact mentality of youths. Irritated by the submission, his homeroom teacher, Shizuka Hiratsuka forces him to join the Volunteer Service Club—a club that assists students to solve their problems in life, hoping that helping other people would change his personality.\n" +
                    "\n" +
                    "However, Yukino Yukinoshita, the most beautiful girl in school, is surprisingly the sole member of the club and a loner, albeit colder and smarter than Hikigaya. Their club soon expands when Yui Yuigahama joins them after being helped with her plight, and they begin to accept more requests.\n" +
                    "\n" +
                    "With his status quo as a recluse, Hikigaya attempts to solve problems in his own way, but his methods may prove to be a double-edged sword.",
            "The life of Tomoya Aki, a high school otaku working part-time to support his BD hoarding. With remarkable luck, he bumps head-first into, Megumi Katou, the most beautiful girl he has ever seen. Naturally, the meeting twists his life into a complicated torrent of relationships. Eriri Spencer Sawamura, his half-foreigner childhood friend who's always valued her relationship with MC. Kasumigaoka Utaha, a cold, composed renowned literary genius who shoves everyone aside from our protagonist. What is this? An eroge introduction?\n" +
                    "\n" +
                    "The tale of a small not quite doujin circle, but not quite indie studio's journey through the tough territory of Comiket and beyond.",
            "After dying a laughable and pathetic death on his way back from buying a game, high school student and recluse Kazuma Satou finds himself sitting before a beautiful but obnoxious goddess named Aqua. She provides the NEET with two options: continue on to heaven or reincarnate in every gamer's dream—a real fantasy world! Choosing to start a new life, Kazuma is quickly tasked with defeating a Demon King who is terrorizing villages. But before he goes, he can choose one item of any kind to aid him in his quest, and the future hero selects Aqua. But Kazuma has made a grave mistake—Aqua is completely useless!\n" +
                    "\n" +
                    "Unfortunately, their troubles don't end here; it turns out that living in such a world is far different from how it plays out in a game. Instead of going on a thrilling adventure, the duo must first work to pay for their living expenses. Indeed, their misfortunes have only just begun!"
    };

    private static int[] animeImages = {
            R.drawable.gintama,
            R.drawable.kimi_no_nawa,
            R.drawable.one_piece,
            R.drawable.shigatsu_wa,
            R.drawable.kimetsu_no_yaiba,
            R.drawable.violet,
            R.drawable.fate_zero,
            R.drawable.shingeki_kyojin,
            R.drawable.oregairu,
            R.drawable.saenai_heroine,
            R.drawable.kono_suba
    };

    static ArrayList<Anime> getListData(){
        ArrayList<Anime> list = new ArrayList<>();
        for (int position = 0; position < animeName.length;position++){
           Anime anime = new Anime();
            anime.setName(animeName[position]);
            anime.setDetail(animeDetail[position]);
            anime.setPhoto(animeImages[position]);
            list.add(anime);
        }
        return list;
    }

}
