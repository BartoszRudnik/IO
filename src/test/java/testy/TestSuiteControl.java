package testy;

import obsluga.TestControl;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({AplikacjaPracownikTest.class, FabrykaTest.class, WydarzenieTest.class, WyszukiwaczWydarzenTest.class})
@RunWith(Categories.class)
@Categories.IncludeCategory(TestControl.class)
public class TestSuiteControl {
}
