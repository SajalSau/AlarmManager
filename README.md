# AlarmManager

-- Steps to build the maven projects (alarmManager and alarmProcessor)

1. In terminal Go to the directory yourDirectory/Projects/alarmProcessor and run 
   a. mvn --settings ../settings.xml  clean install -DskipTests
   b. docker build -t alarm-processor .

2. In terminal Go to the directory yourDirectory/Projects/alarmManager and run
   a. mvn --settings ../settings.xml  clean install
   b. docker build -t alarm-manager .

-- Steps to run docker-compose
1. In terminal Go to the directory yourDirectory/Projects
2. to start the containers :  docker-compose -f Kafka.yml up -d
3. If containers needs to be stopped for some reason then please run : docker-compose -f Kafka.yml down

-- Need to wait for some time to get the containers ready

-- Steps to create the Topic via Kafka control-center
1. open browser and go to the below link : http://localhost:9021/clusters
2. from the left panel click Topics and create a new topic with default configuration  vnoc-alarms
   a. type the name as : vnoc-alarms
   b. other configurations keep in default
   c. create the topic

-- Accessing the rest endpoint in browser to trigger the application
1. Go to the browser and type the link and hit enter : http://localhost:8085/publish/

-- By now the message in package.json is read and sent to the topic and logstash has pushed the data to elastic-search

-- Accessing kibana
1. Create a index pattern via kibana stack management
   a. Go to the browser and type the link and hit enter : http://localhost:5601/app/management/kibana/indexPatterns/create
   b. Type the index pattern name as : logstash-*
   c. Create the index pattern by clicking next button
2. From left Menu go to Discover and the logs and necessary details are available in json format in the selected time range

-- Stopping the containers 
1. In terminal docker-compose -f Kafka.yml down


