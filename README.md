# Sqooping-data
Sqoop is used in Hadoop to transfer data between RDBMS and HDFS. Inorder to perform sqoop import data must be present in RDBMS.  

This is a java Application which reads data from a csv file and stores data into RDBMS after applying necessary filtering. JDBC Batch processing is used inorder to send all records at once into RDBMS.

Sqoop script is also included as a part of project which is executed in hadoop after data is loaded into RDBMS. 
