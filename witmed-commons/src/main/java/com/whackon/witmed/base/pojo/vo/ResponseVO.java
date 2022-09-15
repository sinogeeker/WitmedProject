package com.whackon.witmed.base.pojo.vo;

import com.whackon.witmed.base.pojo.enums.ResponseEnum;
import lombok.Data;
import org.springframework.validation.FieldError;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <b>系统响应视图信息</b>
 * <p>
 *     本项目所有和前端交互返回数据都必须以本响应视图信息对象返回。
 * </p>
 * @author Arthur
 * @date 2022/8/24
 */
@Data
public class ResponseVO<E> implements Serializable {
	private static final long serialVersionUID = -1243700449847575050L;
	private Integer code;                       // 响应编码
	private String message;                     // 响应信息
	private E data;                             // 响应数据

	public ResponseVO(ResponseEnum responseEnum, String message, E data) {
		this.code = responseEnum.getCode();
		this.message = message;
		this.data = data;
	}

	/**
	 * <b>获得系统业务处理和响应成功视图信息</b>
	 * @param message
	 * @return
	 */
	public static ResponseVO createSuccessResponseVO(String message) {
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS, message, new String(""));
	}

	/**
	 * <b>获得系统业务处理和响应成功视图信息</b>
	 * @param message
	 * @param data
	 * @return
	 */
	public static ResponseVO createSuccessResponseVO(String message, Object data) {
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS, message, data);
	}

	/**
	 * <b>获得用户未进行系统认证视图信息</b>
	 * @return
	 */
	public static ResponseVO createUnAuthResponseVO() {
		return new ResponseVO(ResponseEnum.RESPONSE_UNAUTH, ResponseEnum.RESPONSE_UNAUTH.getRemark(), new String(""));
	}

	/**
	 * <b>获得系统业务处理错误视图信息</b>
	 * @param errorMessage
	 * @return
	 */
	public static ResponseVO createFailureResponseVO(String errorMessage) {
		return new ResponseVO(ResponseEnum.RESPONSE_FAILURE, errorMessage, new String(""));
	}

	public static ResponseVO createFailureResponseVO(List<FieldError> fieldErrorList) {
		List<String> errorMessagesList = new ArrayList<String>();
		// 使用 JDK 8 所提供的循环方式依次从 fieldErrorList 中提取数据，存入 errorMessagesList
		fieldErrorList.forEach(fieldError -> errorMessagesList.add(fieldError.getDefaultMessage()));
		return new ResponseVO(ResponseEnum.RESPONSE_FAILURE, "校验失败", errorMessagesList);
	}

	/**
	 * <b>获得系统响应异常视图信息</b>
	 * @param exception
	 * @return
	 */
	public static ResponseVO createExceptionResponseVO(Exception exception) {
		return new ResponseVO(ResponseEnum.RESPONSE_EXCEPTION, exception.getMessage(), exception);
	}
}
