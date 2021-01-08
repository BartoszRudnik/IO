package testyJUnit;

import obsluga.TestEntity;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({AplikacjaPracownikTest.class, FabrykaWydarzenTest.class, WydarzenieTest.class, WyszukiwaczWydarzenTest.class})
@RunWith(Categories.class)
@Categories.ExcludeCategory(TestEntity.class)
public class TestSuiteEntity {
}
