
## Converting POJO into JSON String, Map and List


### Maven Dependencies

		<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core -->
		<dependency>
		    <groupId>com.fasterxml.jackson.core</groupId>
		    <artifactId>jackson-core</artifactId>
		    <version>2.10.2</version>
		</dependency>
		
		<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
		<dependency>
		    <groupId>com.fasterxml.jackson.core</groupId>
		    <artifactId>jackson-databind</artifactId>
		    <version>2.10.2</version>
		</dependency>
				
		<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations -->
		<dependency>
		    <groupId>com.fasterxml.jackson.core</groupId>
		    <artifactId>jackson-annotations</artifactId>
		    <version>2.10.2</version>
		</dependency>

### Maven initial setup

	$ mvn dependency:tree
	$ mvn eclipse:eclipse
	

### Run following java program to test

	TestCustomerVo.java
	
	TestUserVo.java