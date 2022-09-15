-- ============================================================
-- 系统用户信息表：sys_admin
-- ============================================================
drop table if exists sys_admin;
create table sys_admin(
    id varchar(100) not null comment '主键',
    name varchar(100) comment '姓名',
    cellphone varchar(100) comment '手机号码',
    password varchar(500) comment '登录密码，采用 MD5 加密算法',
    role varchar(100) comment '系统角色',
    identity varchar(100) comment '人员身份',
    techTitle varchar(100) comment '服务者专业技术职务',
    education varchar(100) comment '服务者学历',
    major varchar(100) comment '服务者所学专业',
    techRank varchar(100) comment '服务者专业技术职务等级',
    status varchar(10) not null default '1' comment '系统状态：0-禁用，1-启用',
    createBy varchar(100) comment '创建人',
    createTime timestamp not null default current_timestamp comment '创建时间',
    modifiedBy varchar(100) comment '修改人',
    modifiedTime timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key(id)
)Engine=InnoDB charset=utf8mb4 comment='系统用户信息表';

-- ============================================================
-- 系统角色信息表：sys_role
-- ============================================================
drop table if exists sys_role;
create table sys_role(
    id int(10) not null auto_increment comment '主键',
    name varchar(100) comment '角色名称',
    code varchar(100) comment '角色编码',
    status varchar(10) not null default '1' comment '系统状态：0-禁用，1-启用',
    createBy varchar(100) comment '创建人',
    createTime timestamp not null default current_timestamp comment '创建时间',
    modifiedBy varchar(100) comment '修改人',
    modifiedTime timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key(id)
)Engine=InnoDB charset=utf8mb4 comment='系统角色信息表';

-- ============================================================
-- 系统功能菜单信息表：sys_menu
-- ============================================================
drop table if exists sys_menu;
create table sys_menu(
    id int(10) not null auto_increment comment '主键',
    parent varchar(100) comment '上级功能菜单',
    text varchar(100) comment '菜单文本',
    code varchar(100) comment '菜单编码',
    url varchar(100) comment '链接地址',
    icon varchar(100) comment '菜单图标',
    sort int(10) comment '排序',
    status varchar(10) not null default '1' comment '系统状态：0-禁用，1-启用',
    createBy varchar(100) comment '创建人',
    createTime timestamp not null default current_timestamp comment '创建时间',
    modifiedBy varchar(100) comment '修改人',
    modifiedTime timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key(id)
)Engine=InnoDB charset=utf8mb4 comment='系统功能菜单信息表';

-- ============================================================
-- 系统角色功能菜单中间表：sys_role_menu
-- ============================================================
drop table if exists sys_role_menu;
create table sys_role_menu(
    role varchar(100) comment '角色信息',
    menu varchar(100) comment '菜单信息'
)Engine=InnoDB charset=utf8mb4 comment='系统功能菜单信息表';