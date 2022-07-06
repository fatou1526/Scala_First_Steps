object exo1 extends App{
  /* Exercice sur les variables
  Créer une variable mutable nommée « profession » et renseigner la
valeur : Data Engineer
  Vous avez été muté et vous êtes maintenant « scrum master ». Changer
votre profession.
  Créer en une seule commande les variable nom, prenom et age. Pour des
raisons de fraudes sur l’identité de la personnes, personne ne doit
pouvoir modifier les valeurs de ces variables.
  Afficher les variables à l’aide de la fonction println(" ")

  var profession : String = "Data Engineer"
  profession = "Scrum Master"
  val (nom, prenom, age) = ("diop", "astou", 23)
  println(s"Mon age est $age")
  println("Et mon nom complet est %s %s".format(nom,prenom))
*/
  /* manipulation des String
  val proverb: String = "apprendre à positiver ses emotions pour etre en harmonie avec soi-meme et avec les autres"
  val zero_index: Char = proverb(0)
  println(zero_index)
  val proverb_length: Int = proverb.length
  println(proverb_length)
  val capital: String = proverb.capitalize
  println(capital)
  val upper: String = proverb.toUpperCase
  println(upper)
  val slice: String = proverb.substring(0,9)
  println(slice)
  proverb.contains('a')

  val occurence: Int = proverb.count(lettre=>lettre=='p')
  println(occurence)
  val change_char: String = proverb.replace("e","a")
  println(change_char)
  val concatenate: String = proverb.concat("c'est toujours une motivation")
  println(concatenate)
  val delete_char: String = proverb.filter(lettre=>lettre!='a')
  println(delete_char)
*/
/* Exercice Strings
Créer une variable noel avec le contenu suivant: "Petit papa Noël Quand
tu descendras du ciel Avec des jouets par milliers N’oublie pas mon petit soulier.
Mais avant de partir Il faudra bien te couvrir Dehors tu vas avoir si froid
C’est un peu a cause de moi."
 Créer la variable nbPhrase, contenant le nombre de phrase dans noel
 Créer la variable nbA, contenant le nombre d'occurence de 'a' dans noel
 Découper le texte en phrase et metter le dans la variable phrasesNoel
 Récupérer la dernière phrase de phraseNoel dans la variable lastPhrase
 Afficher le contenu de lastPhrase avec un effet mirroir c'est à dire de la fin au début.

  val noel: String = "Petit papa Noël Quand tu descendras du ciel Avec des jouets par milliers N’oublie pas mon petit soulier. Mais avant de partir Il faudra bien te couvrir Dehors tu vas avoir si froid C’est un peu a cause de moi."
  var nbPhrase: Int = noel.count(x=>x=='.')
  println(nbPhrase)
  var nbA: Int = noel.count(x=>x=='a')
  println(nbA)
  var phrasesNoel: Array[String] = noel.split('.')

Combien de temps (en Jours et en Heure) il faut à un marcheur pour parcourir une distance de 750km à une vitesse de
4.8km/h


  val temps = 750/4.8
  println(temps)
  val jour: Int = (temps/24).toInt
  val heure = temps-(jour*24)
  println(s"Il va marcher $jour jours et $heure heures")
  */

}
