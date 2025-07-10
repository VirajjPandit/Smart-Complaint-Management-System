
package com.complaintapp.gui;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.sql.*;

public class ComplaintFormController {

    @FXML
    private TextField nameField, categoryField;
    @FXML
    private TextArea descriptionArea;
    @FXML
    private Label statusLabel;

    private final String DB_URL = "jdbc:mysql://localhost:3306/smart_complaint_db";
    private final String USER = "root";
    private final String PASS = "password";

    @FXML
    protected void submitComplaint() {
        String name = nameField.getText();
        String category = categoryField.getText();
        String description = descriptionArea.getText();

        String sql = "INSERT INTO complaints (name, category, description, status) VALUES (?, ?, ?, 'Pending')";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setString(2, category);
            stmt.setString(3, description);
            stmt.executeUpdate();
            statusLabel.setText("Complaint submitted successfully!");
        } catch (SQLException e) {
            statusLabel.setText("Error: " + e.getMessage());
        }
    }
}
