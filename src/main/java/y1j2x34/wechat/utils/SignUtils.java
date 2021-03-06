package y1j2x34.wechat.utils;

import java.util.Arrays;

import y1j2x34.utils.DigestUtils;

/**
 * 请求校验工具类
 * @author yangjianxin
 */
public class SignUtils {
	public static SignUtils getInstance(){
		return new SignUtils();
	}
	private SignUtils() {
	}
	/**
	 * 验证签名
	 * <pr/>
	 * <pre>
	 * 加密/校验流程：
	 *	1. 将token、timestamp、nonce三个参数进行字典序排序
	 *	2. 将三个参数字符串拼接成一个字符串进行sha1加密
	 *	3. 开发者获得加密后的字符串可与signature对比，标识该请求来源于微信
	 * </pre>
	 * 
	 * @param signature 微信加密签名
	 * @param timestamp 时间戳
	 * @param nonce 随机数
	 * @return
	 */
	public boolean checkSignature(String token,String signature, String timestamp, String nonce) {
		String[] arr = new String[] { token, timestamp, nonce };
		// 将token、timestamp、nonce三个参数进行字典序排序
		Arrays.sort(arr);
		StringBuilder content = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			content.append(arr[i]);
		}
		// 将三个参数字符串拼接成一个字符串进行sha1加密
		String tmpStr = DigestUtils.sha1(content.toString());
		content = null;
		// 将sha1加密后的字符串可与signature对比，标识该请求来源于微信
		return tmpStr != null ? tmpStr.equals(signature.toUpperCase()) : false;
	}
}
