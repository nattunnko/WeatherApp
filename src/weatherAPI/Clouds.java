package weatherAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * jsonファイルのclouds要素の入れ子ファイル
 * @author niwanatsuki
 *
 */

public class Clouds {
	@JsonProperty("all")
	public String all;
}
