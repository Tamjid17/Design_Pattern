package Proxy_DP;

public class CommandExecutorMain implements CommandExecutor{
    @Override
    public void executeCommand(String command) throws Exception {
        System.out.println("Executing command: " + command);
    }
}
