package weatherAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * jsonファイルのweather要素の入れ子クラス
 * @author niwanatsuki
 *
 */

public class Weather1 {
	@JsonProperty("id")
	public String id;

	@JsonProperty("main")
	public String main;

	@JsonProperty("description")
	public String description;

	@JsonProperty("icon")
	public String icon;
}
