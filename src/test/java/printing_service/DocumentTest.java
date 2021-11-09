package printing_service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DocumentTest { // Solution to Document class mutation tests

    @Test
    public void testCompareToEqual() {
        Document doc = new Document(1, 3, 4);
        Assertions.assertEquals(0, doc.compareTo(doc));
    }

    @Test
    public void testCompareToDifferent() {
        Document doc1 = new Document(1, 3, 4);
        Document doc2 = new Document(2, 3, 4);

        Assertions.assertEquals(-1, doc1.compareTo(doc2));
    }
}
