# recommender

### * Building a Recommender with Apache Spark & Elasticsearch
### * This repo contains demo Jupyter notebooks illustrating the basics of how to use Apache Spark for generating ALS models from ratings data stored in Elasticsearch, saving the model factors to ES, and then using ES to serve real-time recommendations using the user and item factors.

Requirements

* 1.elasticsearch-spark JAR (version 5.3.0) on the classpath (https://www.elastic.co/downloads/past-releases/elasticsearch-apache-hadoop-5-3-0).
* 2.Spark 2.1.x (http://spark.apache.org/downloads.html).
* 3.Running instance of Elasticsearch 5.3.0 (https://www.elastic.co/downloads/past-releases/elasticsearch-5-3-0).
* 4.Elasticsearch vector scoring plugin installed (https://github.com/MLnick/elasticsearch-vector-scoring).
* 5.Jupyter (pip install jupyter).
