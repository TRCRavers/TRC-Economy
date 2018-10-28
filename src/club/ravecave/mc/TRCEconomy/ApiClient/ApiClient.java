package club.ravecave.mc.TRCEconomy.ApiClient;

import org.bukkit.entity.Player;

public class ApiClient {
	private String url;
	private String apiKey;
	
	public ApiClient(String url, String apiKey) {
		this.url = url;
		this.apiKey = apiKey;
	}
	
	public double getBalance(Player player) {
		return 0;
	}
}
