package com.wsw.springboot.k8s.istio.api.facade.response;

/**
 * @Author WangSongWen
 * @Date: Created in 15:04 2020/11/11
 * @Description: 枚举一些常用的API操作码
 */
public enum ResultStatusEnums {
    //系统级
    SUCCESS(200, "操作成功", 0),
    FAILED(500, "操作失败", 0),
    UNAUTHORIZED(401, "非法访问", 0),
    FORBIDDEN(403, "没有权限", 0),
    VALIDATE_FAILED(404, "请求资源不存在", 0),
    SYSTEM_EXCEPTION(405, "系统异常", 0),
    SQL_ERROR_EXCEPTION(406, "SQL语法异常", 0),
    MICRO_SERVICE_EXCEPTION(407, "微服务异常", 0),
    CLICK_FREQUENT(408, "请勿频繁点击", 0),
    TOKEN_INVALID(409, "token已过期", 0),

    //参数校验级
    PARAMS_EXCEPTION(5000, "参数校验异常", 0),

    //业务级
    OP_LOG_SAVE_FAILD(6000, "操作日志插入失败", 0),
    TASK_RECORD_INSERT_FAILD(6001, "新增任务记录失败", 0),
    USER_NOT_FOUND(6002, "用户不存在", 0),
    USER_INFORMATION_ERROR(6003, "用户名或密码错误", 0),
    USER_IS_EXIST(6004, "用户名已存在", 0),
    ;

    private final Integer status;
    private final String msg;
    private final Integer alert; //alert: 1 告警 0 不告警

    ResultStatusEnums(Integer status, String msg, Integer alert) {
        this.status = status;
        this.msg = msg;
        this.alert = alert;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public Integer getAlert() {
        return alert;
    }

    public static ResultStatusEnums getByStatus(Integer status) {
        for (ResultStatusEnums result : ResultStatusEnums.values()) {
            if (result.getStatus().equals(status)) {
                return result;
            }
        }
        return null;
    }
}
