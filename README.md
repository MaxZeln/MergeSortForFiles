java version: 17.0.5 (Oracle Corporation 17.0.5+9-LTS-191)

assembly system: Gradle 7.5.1

third party libraries: Spring Boot

    Gradle plugins: id 'org.springframework.boot' version '3.0.2'
                                        id 'io.spring.dependency-management' version '1.1.0'

    Dependencies:   implementation 'org.springframework.boot:spring-boot-starter'
                                        testImplementation 'org.springframework.boot:spring-boot-starter-test'


start instructions: 

first argument: '-a' or '-d' (optional, by default '-a') - type of sorting Ascending for '-a' and Descending for '-d' strategy

second argument: '-i' or '-s' (required) - sorting data type Integer for '-i' and String for '-s'

third argument: 'out.txt' (required) - file name for keeping result of sorting in output file

forth argument: '1.txt' (required) - file name with values for sorting

etc arguments: '2.txt' (optional) - file name with values for sorting
etc arguments: '3.txt' (optional) - file name with values for sorting
etc arguments: '4.txt' (optional) - file name with values for sorting

examples of running compile jar file:

first example: java -jar sort-it-1.0.jar -d -s out.txt 1.txt 2.txt 3.txt

second example: java -jar sort-it-1.0.jar -a -i out.txt 1.txt 2.txt

third example: java -jar sort-it-1.0.jar -i out.txt 1.txt