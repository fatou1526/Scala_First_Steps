import org.apache.spark.sql.SparkSession
val spark:SparkSession = SparkSession.builder()
  .master("local[*]")
  .appName("mon application")
  .getOrCreate()
object ExoSpark extends App {
  val col: Seq[Array[Any]] = Seq(
    Array("Ibou", "h", "2016-04-22", "A", "citron", 1, 50.00),
    Array("Ibou", "h", "2016-05-03", "B", "Lamp", null, 38.00),
    Array("Ibou", "h", "2016-05-03", "D", "portable", 1, 29.00),
    Array("Ibou", "h", "2016-05-03", "A", "citron", 3, 50.00),
    Array("Ibou", "h", "2016-05-03", "C", "riz", 5, 15.00),
    Array("Ibou", "h", "2016-06-05", "A", "citron", 5, 50.00),
    Array("Ibou", "h", "2016-06-05", "A", "bananes", 5, 55.00),
    Array("Ibou", "h", "2016-06-15", "Y", "pc", 7, 68.00),
    Array("Ibou", "h", "2016-06-15", "E", "livre", 1, 125.00),
    Array("Fatou", "f", "2016-04-22", "B", "Lamp", 1, 38.00),
    Array("Fatou", "f", "2016-05-03", "Y", "pc", 1, 68.00),
    Array("Fatou", "f", "2016-05-03", "D", "lunette", 5, 27.00),
    Array("Fatou", "f", "2016-05-03", "C", "riz", 15, 15.00),
    Array("Fatou", "f", "2016-04-02", "A", "bananes", 3, 55.00),
    Array("Fatou", "f", "2016-04-02", "B", "Lamp", 2, 38.00),
    Array("Fatou", "f", "2016-04-03", "E", "voiture", 5, 100.00),
    Array("Fatou", "f", "2016-04-13", "E", "livre", 5, 125.00),
    Array("Fatou", "f", "2016-04-27", "D", "portable", 5, 29.00),
    Array("Fatou", "f", "2016-05-27", "D", "lunette", 5, 27.00),
    Array("Fatou", "f", "2016-05-27", "A", "bananes", 3, 55.00),
    Array("Fatou", "f", "2016-05-01", "Y", "pc", null, 68.00),
    Array("Fatou", "f", "2016-06-07", "Z", "pommes", 1, 227.00),
    Array("Mareme", "f", "2016-02-07", "Z", "pommes", 2, 227.00),
    Array("Mareme", "f", "2016-02-14", "A", "bananes", 9, 55.00),
    Array("Mareme", "f", "2016-02-14", "B", "Lamp", 2, 38.00),
    Array("Mareme", "f", "2016-02-14", "A", "citron", 10, 55.00),
    Array("Mareme", "f", "2016-03-07", "Z", "pommes", 5, 227.00),
    Array("Mareme", "f", "2016-04-07", "Y", "pc", 4, 68.00),
    Array("Mareme", "f", "2016-04-07", "D", "lunette", 5, 27.00),
    Array("Mareme", "f", "2016-04-07", "C", "riz", 5, 15.00),
    Array("Mareme", "f", "2016-04-07", "A", "bananes", 9, 55.00),
    Array("Babs", "h", "2016-05-01", "Z", "pommes", null, 227.00),
    Array("Babs", "h", "2016-05-01", "A", "bananes", 5, 55.00),
    Array("Babs", "h", "2016-05-08", "A", "bananes", 5, 55.00),
    Array("Babs", "h", "2016-05-08", "Y", "pc", 1, 68.00),
    Array("Babs", "h", "2016-06-05", "A", "bananes", 5, 55.00),
    Array("Babs", "h", "2016-06-05", "C", "riz", 5, 15.00),
    Array("Babs", "h", "2016-06-05", "Y", "pc", 2, 68.00),
    Array("Babs", "h", "2016-06-05", "D", "lunette", 5, 27.00))



}
