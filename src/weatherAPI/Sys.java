package weatherAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * jsonファイルのsys要素の入れ子クラス
 * @author niwanatsuki
 *
 */

public class Sys {
	@JsonProperty("type")
	public String type;

	@JsonProperty("id")
	public String id;

	@JsonProperty("country")
	public String country;

	@JsonProperty("sunrise")
	public String sunrise;

	@JsonProperty("sunset")
	public String sunset;
}
