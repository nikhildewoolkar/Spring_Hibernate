package MongoDB;
//
//public class MongoDB {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
//
import com.mongodb.*;
import java.net.UnknownHostException; import java.util.Scanner;

public class MongoDB {
public static MongoClient mongoClient; public static DB database;
public static DBCollection dbCollection;
static Scanner scanner = new Scanner(System.in); TestObject object;

public MongoDB() {
object = new TestObject(); }

public static DBObject convert(TestObject testObject) {
return new BasicDBObject("ID", testObject.getS_id()).append("Name", testObject.getS_name()).append("Marks", testObject.getS_marks());
}

public static void createDatabase(String dbName) {
database = mongoClient.getDB(dbName); //get or create System.out.println("Changed to Database named " + dbName);
}

public static void createCollection(String collectionName) { dbCollection = database.getCollection(collectionName); System.out.println("Referencing to collection " + collectionName);
}

public void insertData() { System.out.print("Enter Student ID: "); object.setS_id(scanner.nextLine()); System.out.print("Enter Student Name: "); object.setS_name(scanner.nextLine()); System.out.print("Enter Student Marks: "); object.setS_marks(scanner.nextLine());

dbCollection.insert(convert(object)); System.out.println("Data added in the collection " +
dbCollection.getName());
}

public void updateData() {
System.out.print("Enter ID of student whose data you want to change: "); String id = scanner.nextLine(); System.out.print("Name: ");
String name = scanner.nextLine(); System.out.print("Marks: "); String marks = scanner.nextLine();

TestObject modified = new TestObject(); modified.setS_id(id); modified.setS_name(name); modified.setS_marks(marks);

dbCollection.findAndModify(new BasicDBObject("ID", id),
convert(modified)); System.out.println("Data has been modified");
}


public void deleteData() {
System.out.print("Enter ID of student whose data you want to delete: "); String id = scanner.nextLine();
DBObject query = new BasicDBObject("ID", id);
dbCollection.findAndRemove(query);
System.out.println("Student detail with ID " + id + " has been deleted");
}

public static void showData() {
DBObject query = new BasicDBObject(); DBCursor cursor = dbCollection.find(query); while ((cursor.hasNext())) {
DBObject next = cursor.next(); System.out.println(next);
}
}

public static void main(String[] args) throws UnknownHostException {
mongoClient = new MongoClient(new
MongoClientURI("mongodb://localhost:27017")); MongoDB mongoDB = new MongoDB();

createDatabase("Student"); createCollection("Student Data"); mongoDB.insertData();
showData(); mongoDB.updateData();
System.out.println("----AFTER UPDATE	");
showData(); mongoDB.deleteData();
System.out.println("----AFTER DELETE	");
showData();
}
}
