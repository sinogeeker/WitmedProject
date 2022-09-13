-- ============================================================
-- 医院信息表：sys_hospital
-- ============================================================
drop table if exists sys_hospital;
create table sys_hospital(
    id int(10) not null auto_increment comment '主键',
    name varchar(100) comment '名称',
    orgCode varchar(100) comment '组织机构代码',
    charge varchar(100) comment '负责人',
    addrCat varchar(100) comment '地址类别',
    province varchar(100) comment '地址-省（自治区、直辖市）',
    city varchar(100) comment '地址-市（地区）',
    district varchar(100) comment '地址-县（区）',
    subDistrict varchar(100) comment '地址-乡（镇、街道办事处）',
    street varchar(100) comment '地址-村（街、路、弄等）',
    doorNo varchar(100) comment '地址-门牌号码',
    zipcode varchar(100) comment '邮政编码',
    divisionCode varchar(100) comment '行政区划代码',
    phoneCat varchar(100) comment '联系电话-类别',
    phoneNo varchar(100) comment '联系电话-号码',
    email varchar(100) comment '电子邮件地址',
    status varchar(10) not null default '1' comment '系统状态：0-禁用，1-启用',
    createBy varchar(100) comment '创建人',
    createTime timestamp not null default current_timestamp comment '创建时间',
    modifiedBy varchar(100) comment '修改人',
    modifiedTime timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key(id)
)Engine=InnoDB charset=utf8mb4 comment='医院信息表';