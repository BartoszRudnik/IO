package testy;

import obsluga.TestEntity;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({AplikacjaPracownikTest.class, FabrykaTest.class, WydarzenieTest.class, WyszukiwaczWydarzenTest.class})
@RunWith(Categories.class)
@Categories.IncludeCategory(TestEntity.class)
public class TestSuiteEntity {
}
