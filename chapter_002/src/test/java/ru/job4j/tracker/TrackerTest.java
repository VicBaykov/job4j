package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by vicba on 16.08.2018.
 */
public class TrackerTest {
    @Test
    public void whenReplaceItemThenReplace() {
        Tracker tracker = new Tracker();
        Item item = new Item("testName1", "testDescription1");
        tracker.add(item);
        Item itm = new Item("testName2", "testDescription2");
        tracker.replace(item.getId(), itm);
        assertThat(tracker.findAll()[0], is(itm));
    }

    @Test
    public void whenDeleteItemThenDelete() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("testName1", "testDescription1");
        tracker.add(item1);
        Item item2 = new Item("testName2", "testDescription2");
        tracker.add(item2);
        Item item3 = new Item("testName3", "testDescription3");
        tracker.add(item3);

        Item[] itms = {item1, item3};
        tracker.delete(item2.getId());
        assertThat(tracker.findAll(), is(itms));
    }

    @Test
    public void whenFindByNameItemThenTrackerFindByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("testName1", "testDescription1");
        tracker.add(item1);
        Item item2 = new Item("testName2", "testDescription2");
        tracker.add(item2);
        Item item3 = new Item("testName3", "testDescription3");
        tracker.add(item3);
        Item[] expect = {item2};
        assertThat(tracker.findByName("testName2"), is(expect));
    }
}
