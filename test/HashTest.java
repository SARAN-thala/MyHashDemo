import org.junit.Test;

import static org.junit.Assert.*;

public class HashTest {
    @Test
    public void test_hash_returns_unique_number() throws Exception {
        assertEquals(96355, Hash.hash("abc"));
        assertEquals(109205907, Hash.hash("saran"));
    }

    @Test
    public void test_hash_value_of_two_different_string_is_different() throws Exception {
        assertNotEquals(Hash.hash("abc"), Hash.hash("saran"));
    }

    @Test
    public void test_index_for_returns_an_int_within_the_bound() throws Exception {
        int capacity = 16;
        int index_for_abc = Hash.indexFor(Hash.hash("abc"),capacity);
        int index_for_saran = Hash.indexFor(Hash.hash("saran"),capacity);
        assertEquals(3,index_for_abc);
        assertTrue(index_for_abc >= 0 && index_for_abc <= capacity);
        assertEquals(3,index_for_saran);
    }

    @Test
    public void test_index_of_should_not_collide() throws Exception {
        int capacity = 16;
        int index_for_abc = Hash.indexFor(Hash.hash("abc"),capacity);
        int index_for_abcd = Hash.indexFor(Hash.hash("abcd"),capacity);
        assertNotEquals(index_for_abc,index_for_abcd);
    }
}