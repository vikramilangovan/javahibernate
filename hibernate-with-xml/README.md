# Hibernate with XML

This Hibernate example shows how to connect the MySQL database with the application through hibernate framework.


For creating the hibernate application, we need to follow following steps:

1. Create the Persistent class
2. Create the mapping file for Persistent class
3. Create the Configuration file
4. Create the class that retrieves or stores the persistent object
5. Load the jar file
6. Run the first hibernate application

## 1) Create the Persistent class : ( Employee.java )
	A simple Persistent class should follow some rules:
	
**A no-arg constructor:** It is recommended that you have a default constructor at least package visibility so that hibernate can create the instance of the Persistent class by newInstance() method.

**Provide an identifier property (optional):** It is mapped to the primary key column of the database.

**Declare getter and setter methods (optional):** The Hibernate recognizes the method by getter and setter method names by default.

**Prefer non-final class:** Hibernate uses the concept of proxies, that depends on the persistent class. The application programmer will not be able to use proxies for lazy association fetching.

## 2) Create the mapping file for Persistent class : (employee.hbm.xml)
	The mapping file name conventionally, should be class_name.hbm.xml. There are many elements of the mapping file.
	
**hibernate-mapping:** It is the root element in the mapping file.

**class:** It is the sub-element of the hibernate-mapping element. It specifies the Persistent class.

**id:** It is the subelement of class. It specifies the primary key attribute in the class.

**generator:** It is the subelement of id. It is used to generate the primary key. There are many generator classes such as assigned (It is used if id is specified by the user), increment, hilo, sequence, native etc. We will learn all the generator classes later.

**property:** It is the subelement of class that specifies the property name of the Persistent class.

## 3) Create the Configuration file : (hibernate.cfg.xml)
	The configuration file contains informations about the database and mapping file.
	Conventionally, its name should be **hibernate.cfg.xml**.
	
## 4) Create the class that retrieves or stores the object: (StoreData.java)
	In this class, we are simply storing the employee object to the database.
	
## 5) Load the jar file. click on the link to download the jar files.

Now Run the StoreData class by **java StoreData**

Thus,As the result, the data is stored in the mysql database table.
