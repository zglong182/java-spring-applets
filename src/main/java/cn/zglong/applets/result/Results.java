package cn.zglong.applets.result;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Slf4j
public class Results {

	public static final String RET_CODE = "000000";

	public static final String RET_MSG = "Success";

	public static final String ERR_CODE = "999999";

	public static final String ERR_MSG = "Error";

	private String retCode;

	private String retMsg;

	private Object element;

	private Results() {
	}

	public static Results error() {
		return error(ERR_CODE, ERR_MSG);
	}

	public static Results error(String retMsg) {
		return error(ERR_CODE, retMsg);
	}

	public static Results error(String retCode, String retMsg) {
		Results result = new Results();
		result.setRetCode(retCode);
		result.setRetMsg(retMsg);
		return result;
	}

	public static Results error(Errors e) {
		Results result = new Results();
		result.setRetCode(e.code());
		result.setRetMsg(e.msg());
		return result;
	}

	public static Results success() {
		Results result = new Results();
		result.setRetCode(RET_CODE);
		result.setRetMsg(RET_MSG);
		return result;
	}

	public static Results ok() {
		return Results.success();
	}

	public static Results ok(Object value) {
		return Results.success().render(value);
	}

	public Results code(String retCode) {
		this.retCode = retCode;
		return this;
	}

	public Results msg(String retMsg) {
		this.retMsg = retMsg;
		return this;
	}

	public <T> T getElement(Class<T> clazz) {
		if (this.element instanceof Map) {
			JSONObject object = (JSONObject) JSON.toJSON(this.element);
			return JSON.toJavaObject(object, clazz);
		}
		if (this.element instanceof List) {
			JSONArray array = (JSONArray) JSON.toJSON(this.element);
			return JSON.toJavaObject(array, clazz);
		}
		return (T) this.element;
	}

	public Results render(Object el) {
		this.element = el;
		return this;
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	public Results render(String key, Object value) {
		if (this.element == null) {
			this.element = new HashMap<String, Object>();
		}
		if (this.element instanceof Map) {
			Map map = (Map) this.element;
			map.put(key, value);
		} else {
			log.error("The type of element should be Map");
		}
		return this;
	}
}
