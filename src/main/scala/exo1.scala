object exo1 extends App{
  /*
  Créer une variable mutable nommée « profession » et renseigner la
valeur : Data Engineer
  Vous avez été muté et vous êtes maintenant « scrum master ». Changer
votre profession.
  Créer en une seule commande les variable nom, prenom et age. Pour des
raisons de fraudes sur l’identité de la personnes, personne ne doit
pouvoir modifier les valeurs de ces variables.
  Afficher les variables à l’aide de la fonction println(" ")
  */
  var profession : String = "Data Engineer"
  profession = "Scrum Master"
  val (nom, prenom, age) = ("diop", "astou", 23)
  println(s"Mon age est $age")
  println("Et mon nom complet est %s %s".format(nom,prenom))

}
