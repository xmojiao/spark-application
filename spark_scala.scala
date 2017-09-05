import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.elasticsearch.spark._
val conf =new SparkConf().setAppName("Recommand").setMaster("spark://zhuoling1.fyre.ibm.com:7077")
conf.set("es.index.auto.create","true")
conf.set("es.nodes","9.30.166.20")
val numbers=Map("one"->1,"two"->2)
val airports=Map("OPT"->"Otopeni","SFO"->"San HranFirst")
val aa=sc.makeRDD(Seq(numbers,airports))
aa.saveToEs("spark1/docs")

val numbers = Map("one" -> 1, "two" -> 2, "three" -> 3)
val airports = Map("arrival" -> "Otopeni", "SFO" -> "San Fran")
sc.makeRDD(Seq(numbers, airports)).saveToEs("spark/docs")
val RDD = sc.esRDD("demo/users")
import org.apache.spark.sql._
val sqlContext = new SQLContext(sc) 
import sqlContext.implicits._


./spark-shell --jars ../lib/elasticsearch-spark-20_2.11-5.3.0.jar
./pyspark --jars ../lib/elasticsearch-spark-20_2.11-5.3.0.jar
./pyspark --driver-memory 2g --driver-class-path ../lib/elasticsearch-spark-20_2.11-5.3.0.jar

0. look state
ps -ef | grep elastic

./spark-shell --jars ../lib/elasticsearch-spark_2.10-2.4.1.jar

ps -ef | grep elastic
1.install dictory
cd /usr/local/elasticsearch/elasticsearch-2.4.1/bin
/usr/local/spark/spark-1.6.0-bin-hadoop2.6/lib
2 user change
su elsearch
3 start
elasticsearch -d


0.user change
su -l
input passward
1.address
cd /usr/local/spark/spark-1.6.0-bin-hadoop2.6/bin
2.run command
./spark-shell --jars ../lib/elasticsearch-spark_2.10-2.4.1.jar   elasticsearch-spark_2.10-2.4.0.jar
./spark-shell --jars ../dist/elasticsearch-hadoop-5.2.0.jar   elasticsearch-spark_2.10-2.4.0.jar
dist/elasticsearch-hadoop-5.2.0.jar
4.result
curl '127.0.0.1:9200/spark/docs/_search?q=*'
curl 'localhost:9200/spark/docs/_search?q=*'
/usr/local/spark/spark-2.0.2-bin-hadoop2.7/dist/elasticsearch-spark-5.2.0.jar
curl 'localhost:9200/_cat/health?v'
curl 'localhost:9200/_cat/nodes?v'
curl 'localhost:9200/_cat/indices?v'
curl -XDELETE 'localhost:9200/customer?pretty'
        




import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.elasticsearch.spark._
    val conf =new SparkConf().setAppName("Recommand").setMaster("spark://9.30.101.71:7077")

    conf.set("es.index.auto.create","true")
    conf.set("es.nodes","127.0.0.1")

    val numbers=Map("one"->1,"two"->2)
    val airports=Map("OPT"->"Otopeni","SFO"->"San HranFirst")
    val aa=sc.makeRDD(Seq(numbers,airports))
     aa.saveToEs("spark/docs")

curl -s -XPUT 'http://localhost:9200/test?pretty' -d '{
    "settings" : {
        "analysis": {
                "analyzer": {
                   "payload_analyzer": {
                      "type": "custom",
                      "tokenizer":"whitespace",
                      "filter":"delimited_payload_filter"
                    }
          }
        }
     }
}'

hadoop jar hadoop-examples-2.7.3.jar wordcount input output

address of jar
cd /root/IBMproject/spam/target/spam-0.0.1-SNAPSHOT.jar


./spark-submit --class SpamDataction.spam.Recommand --master local[*] /root/IBMproject/spam/target/spam-0.0.1-SNAPSHOT.jar 100


package SpamDataction.spam
import org.apache.spark.SparkConf
import org.apache.spark.sql.SQLContext
import org.apache.spark.SparkContext
import com.databricks.spark.csv._
import scala.io.Source
object RecDemo {
  def main(args:Array[String]){
    val conf =new SparkConf().setAppName("RecDemo").setMaster("local[*]")

    val sc=new SparkContext(conf)
    val sqlContext=new SQLContext(sc)
    val source=Source.fromFile("/root/IBMproject/spam/ml-20m/ratings.csv")
    val reader=source.getLines()
    val cols=reader.next()
//    for (l<- reader)    l=

//    println(lineIterator.next())
    println("Hello scala")
 //   import sqlContext._
///   val df=sqlContext.csvFile("/root/IBMproject/spam/ml-20m/ratings.csv").select("userId","movieId").toDF()
 //  println(df.show(5))

  }
}

