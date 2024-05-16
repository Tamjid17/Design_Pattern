package Proxy_DP;

public class Client {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("admin", "secretadmin");
        try {
            // Admin executes command
            executor.executeCommand("ls -l");

            // Non-admin tries to execute command
            executor = new CommandExecutorProxy("user", "password");
            executor.executeCommand("rm -rf /");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
