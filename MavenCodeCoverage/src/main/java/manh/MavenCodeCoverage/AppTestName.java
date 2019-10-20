package manh.MavenCodeCoverage;

/**
 * Hello world!
 *
 */
public class AppTestName 
{
	public String getMessage(String name) {

        StringBuilder result = new StringBuilder();

        if (name == null || name.trim().length() == 0) {

            result.append("Please provide a name!");

        } else {

            result.append("Hello " + name);

        }
        return result.toString();
    }
}
