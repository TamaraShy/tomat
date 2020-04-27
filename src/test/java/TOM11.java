public class TOM11
package MyCustomTestListener;

        import org.testng.ISuite;
        import org.testng.ITestNGListener;

public class MyCustomTestListener implements ITestNGListener {

    @Override
    public void onStart (ISuite suite) {
        System.out.println("Start Suite name: " + suite.getName());
    }

    @Override
    public void onFinished (ISuite suite) {
        System.out.println("Finish Suite name: " + suite.getName());
        '
    ;l'
    }

}
{
}
