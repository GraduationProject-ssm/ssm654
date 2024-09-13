package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 奶茶
 *
 * @author 
 * @email
 */
@TableName("naicha")
public class NaichaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public NaichaEntity() {

	}

	public NaichaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 奶茶编号
     */
    @TableField(value = "naicha_uuid_number")

    private String naichaUuidNumber;


    /**
     * 奶茶名称
     */
    @TableField(value = "naicha_name")

    private String naichaName;


    /**
     * 奶茶照片
     */
    @TableField(value = "naicha_photo")

    private String naichaPhoto;


    /**
     * 特点
     */
    @TableField(value = "naicha_tedian")

    private String naichaTedian;


    /**
     * 奶茶类型
     */
    @TableField(value = "naicha_types")

    private Integer naichaTypes;


    /**
     * 奶茶库存
     */
    @TableField(value = "naicha_kucun_number")

    private Integer naichaKucunNumber;


    /**
     * 购买获得积分
     */
    @TableField(value = "naicha_price")

    private Integer naichaPrice;


    /**
     * 奶茶原价
     */
    @TableField(value = "naicha_old_money")

    private Double naichaOldMoney;


    /**
     * 现价
     */
    @TableField(value = "naicha_new_money")

    private Double naichaNewMoney;


    /**
     * 热度
     */
    @TableField(value = "naicha_clicknum")

    private Integer naichaClicknum;


    /**
     * 奶茶介绍
     */
    @TableField(value = "naicha_content")

    private String naichaContent;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "naicha_delete")

    private Integer naichaDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：奶茶编号
	 */
    public String getNaichaUuidNumber() {
        return naichaUuidNumber;
    }
    /**
	 * 获取：奶茶编号
	 */

    public void setNaichaUuidNumber(String naichaUuidNumber) {
        this.naichaUuidNumber = naichaUuidNumber;
    }
    /**
	 * 设置：奶茶名称
	 */
    public String getNaichaName() {
        return naichaName;
    }
    /**
	 * 获取：奶茶名称
	 */

    public void setNaichaName(String naichaName) {
        this.naichaName = naichaName;
    }
    /**
	 * 设置：奶茶照片
	 */
    public String getNaichaPhoto() {
        return naichaPhoto;
    }
    /**
	 * 获取：奶茶照片
	 */

    public void setNaichaPhoto(String naichaPhoto) {
        this.naichaPhoto = naichaPhoto;
    }
    /**
	 * 设置：特点
	 */
    public String getNaichaTedian() {
        return naichaTedian;
    }
    /**
	 * 获取：特点
	 */

    public void setNaichaTedian(String naichaTedian) {
        this.naichaTedian = naichaTedian;
    }
    /**
	 * 设置：奶茶类型
	 */
    public Integer getNaichaTypes() {
        return naichaTypes;
    }
    /**
	 * 获取：奶茶类型
	 */

    public void setNaichaTypes(Integer naichaTypes) {
        this.naichaTypes = naichaTypes;
    }
    /**
	 * 设置：奶茶库存
	 */
    public Integer getNaichaKucunNumber() {
        return naichaKucunNumber;
    }
    /**
	 * 获取：奶茶库存
	 */

    public void setNaichaKucunNumber(Integer naichaKucunNumber) {
        this.naichaKucunNumber = naichaKucunNumber;
    }
    /**
	 * 设置：购买获得积分
	 */
    public Integer getNaichaPrice() {
        return naichaPrice;
    }
    /**
	 * 获取：购买获得积分
	 */

    public void setNaichaPrice(Integer naichaPrice) {
        this.naichaPrice = naichaPrice;
    }
    /**
	 * 设置：奶茶原价
	 */
    public Double getNaichaOldMoney() {
        return naichaOldMoney;
    }
    /**
	 * 获取：奶茶原价
	 */

    public void setNaichaOldMoney(Double naichaOldMoney) {
        this.naichaOldMoney = naichaOldMoney;
    }
    /**
	 * 设置：现价
	 */
    public Double getNaichaNewMoney() {
        return naichaNewMoney;
    }
    /**
	 * 获取：现价
	 */

    public void setNaichaNewMoney(Double naichaNewMoney) {
        this.naichaNewMoney = naichaNewMoney;
    }
    /**
	 * 设置：热度
	 */
    public Integer getNaichaClicknum() {
        return naichaClicknum;
    }
    /**
	 * 获取：热度
	 */

    public void setNaichaClicknum(Integer naichaClicknum) {
        this.naichaClicknum = naichaClicknum;
    }
    /**
	 * 设置：奶茶介绍
	 */
    public String getNaichaContent() {
        return naichaContent;
    }
    /**
	 * 获取：奶茶介绍
	 */

    public void setNaichaContent(String naichaContent) {
        this.naichaContent = naichaContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getNaichaDelete() {
        return naichaDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setNaichaDelete(Integer naichaDelete) {
        this.naichaDelete = naichaDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Naicha{" +
            "id=" + id +
            ", naichaUuidNumber=" + naichaUuidNumber +
            ", naichaName=" + naichaName +
            ", naichaPhoto=" + naichaPhoto +
            ", naichaTedian=" + naichaTedian +
            ", naichaTypes=" + naichaTypes +
            ", naichaKucunNumber=" + naichaKucunNumber +
            ", naichaPrice=" + naichaPrice +
            ", naichaOldMoney=" + naichaOldMoney +
            ", naichaNewMoney=" + naichaNewMoney +
            ", naichaClicknum=" + naichaClicknum +
            ", naichaContent=" + naichaContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", naichaDelete=" + naichaDelete +
            ", createTime=" + createTime +
        "}";
    }
}
