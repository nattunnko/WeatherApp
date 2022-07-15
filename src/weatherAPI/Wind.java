package weatherAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * jsonファイルのwind要素の入れ子クラス
 * @author niwanatsuki
 *
 */

public class Wind {

	@JsonProperty("speed")
	public String speed;

	@JsonProperty("deg")
	public String deg;

	@JsonProperty("gust")
	public String gust;

}
