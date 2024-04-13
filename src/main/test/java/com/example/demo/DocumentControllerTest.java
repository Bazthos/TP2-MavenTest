package com.example.demo;

import com.example.demo.controller.DocumentController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DocumentControllerTest {

    @Test
    void testDocumentAddAndGet() {
        DocumentController controller = new DocumentController();
        String responseAdd = controller.addDocument("1", "Test Document");
        assertEquals("Document added successfully", responseAdd);

        String responseGet = controller.getDocument("1");
        assertEquals("Test Document", responseGet);
    }
}
