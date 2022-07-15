package weatherAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * jsonファイルの内容のmain要素の入れ子クラス
 * @author niwanatsuki
 *
 */

public class Main {

	@JsonProperty("temp")
	public String temp;

	@JsonProperty("feels_like")
	public String feels_like;

	@JsonProperty("temp_min")
	public String temp_min;

	@JsonProperty("temp_max")
	public String temp_max;

	@JsonProperty("pressure")
	public String pressure;

	@JsonProperty("humidity")
	public String humidity;

	@JsonProperty("sea_level")
	public String sea_level;

	@JsonProperty("grnd_level")
	public String grnd_level;


}
