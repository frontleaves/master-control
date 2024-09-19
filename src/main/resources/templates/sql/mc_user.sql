create table mc_user
(
    uuid         varchar(36)             not null
        constraint mc_user_pk
            primary key,
    username     varchar(36),
    phone        varchar(11)             not null,
    email        varchar(254),
    password     char(60)                not null,
    old_password char(60),
    role         varchar(36)             not null
        constraint mc_user_role_fk
            references mc_role
            on update restrict on delete restrict,
    created_at   timestamp default now() not null,
    updated_at   timestamp default now() not null,
    enable       boolean   default true  not null,
    banned_at    timestamp
);

comment on table mc_user is '用户表';
comment on column mc_user.uuid is ' 角色主键';
comment on column mc_user.username is '用户名';
comment on column mc_user.phone is '手机号';
comment on column mc_user.email is '用户邮箱';
comment on column mc_user.password is '用户当前密码';
comment on column mc_user.old_password is '用户旧密码';
comment on column mc_user.created_at is '创建时间';
comment on column mc_user.updated_at is '修改时间';
comment on column mc_user.enable is '用户是否开启';
comment on column mc_user.banned_at is '封禁到';

create index mc_user_email_index
    on mc_user (email);

create unique index mc_user_phone_uindex
    on mc_user (phone);

create unique index mc_user_username_uindex
    on mc_user (username);