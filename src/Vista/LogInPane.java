package Vista;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LogInPane extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public LogInPane() {
        // Crear un JPanel principal
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        // Componentes de la interfaz de usuario
        JLabel userLabel = new JLabel("Usuario:");
        JLabel passwordLabel = new JLabel("Contraseña:");

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        // Agregar componentes al panel
        panel.add(userLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Inicio de Sesión", JOptionPane.OK_CANCEL_OPTION);

        // Manejar eventos del botón de inicio de sesión
        if (result == JOptionPane.OK_OPTION) {
            iniciarSesion();
        }
    }

    private void iniciarSesion() {
        // Obtener valores del usuario y contraseña
        String username = usernameField.getText();
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);

        // Verificar la autenticación (aquí puedes agregar tu lógica de autenticación)
        if (autenticar(username, password)) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");

            // Crear e mostrar la instancia de MenuPrincipalViews
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    MenuPrincipalViews ventanaPrincipal = new MenuPrincipalViews();
                    ventanaPrincipal.setVisible(true);
                }
            });

            // Cerrar la ventana de inicio de sesión si es necesario
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Inicio de sesión fallido. Verifica tu usuario y contraseña.");
        }
    }

    private boolean autenticar(String username, String password) {
        // Aquí debes agregar la lógica de autenticación, por ejemplo, verificar en una base de datos.
        // En este ejemplo, simplemente comparamos con un usuario y contraseña de demostración.
        return username.equals("a") && password.equals("a");
    }

}
