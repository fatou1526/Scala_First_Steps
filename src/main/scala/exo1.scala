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
  // manipulation des String
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

}
