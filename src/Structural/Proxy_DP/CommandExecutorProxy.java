package Proxy_DP;

public class CommandExecutorProxy implements CommandExecutor{
    private boolean isAdmin;
    private CommandExecutorMain executor;

    public CommandExecutorProxy(String user, String password) {
        if ("admin".equals(user) && "admin123".equals(password)) {
            isAdmin = true;
        }
        executor = new CommandExecutorMain();
    }
    @Override
    public void executeCommand(String command) throws Exception {
        if (isAdmin) {
            executor.executeCommand(command);
        } else {
            throw new Exception("Unauthorized access. Only admin can execute commands.");
        }
    }
}
