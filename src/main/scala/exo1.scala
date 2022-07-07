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

  Un magicien dit que
  • Quand on choisit un nombre premier différent de 2 et 3
  • On l’èleve au carré
  • On lui ajoute 17
  • On divise par 12
  • Alors le reste de la division vaut 6 ?


  val nbPremier = 17
  val isMagicianRight = ((nbPremier * nbPremier) + 17) % 12 == 6
  println(s"Est ce que le magicien a raison pour le nombre $nbPremier? $isMagicianRight")


 Le gouvernement a décidé d'offrir une prime de 300€ à certains fonctionnaires en fonction de leur salaire et de leur ancienneté.
Comme toutes les autres mesures prises par le gouvernement, il est difficile de comprendre à qui cette mesure s'applique.
De ce que vous avez compris, une personne peut toucher à la prime si :
Critère 1 : Elle a de d'ancienneté son salaire est à euros.
Critère 2 : Elle a d'ancienneté son salaire est compris euros.
Critère 3 : Elle a de d'ancienneté son salaire est strictement à euros à euros. C'est à
dire qu'une personne ayant plus de 10 ans d'ancienneté et un salaire entre 1500 et 2300 euros ne peut pas toucher à cette prime.
Bernadette a ans d'ancienneté et un salaire de euros.
Marc a ans d'ancienneté et un salaire de euros.
 */
  val employe = "Bernadette"
  val anciennete = 12
  val salaire = 2400
  val isPrime = (anciennete<5 && salaire<1500)||((anciennete>5 && anciennete<10) && (salaire>=1500 && salaire<2300)) ||(anciennete>=10 && (salaire<1500 || salaire>2300))
  println(s"Est ce que $employe sera primé? $isPrime")


}
