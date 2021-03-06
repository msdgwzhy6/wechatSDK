package y1j2x34.wechat.message.resp;

import java.io.Serializable;
/**
 * 音乐模型
 * @author yangjianxin
 * @see RespMusicMessage
 */
public class Music implements Serializable{
	
	private static final long serialVersionUID = 1910501459418243582L;
	
	private String Title;
	
	private String Description;
	
	private String MusicUrl;
	
	private String HQMusicUrl;
	
	private String ThumbMediaId;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getMusicUrl() {
		return MusicUrl;
	}

	public void setMusicUrl(String musicUrl) {
		MusicUrl = musicUrl;
	}

	public String getHQMusicUrl() {
		return HQMusicUrl;
	}

	public void setHQMusicUrl(String hQMusicUrl) {
		HQMusicUrl = hQMusicUrl;
	}

	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}
}
