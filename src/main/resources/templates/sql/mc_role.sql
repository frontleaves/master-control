create table mc_role
(
    role_uuid    varchar(36)             not null
        constraint mc_role_pk
            primary key,
    name         varchar(36)             not null,
    display_name varchar(36)             not null,
    role_desc    varchar(256)            not null,
    created_at   timestamp default now() not null
);

comment on table mc_role is '用户角色表';
comment on column mc_role.role_uuid is '角色主键';
comment on column mc_role.name is '角色名字';
comment on column mc_role.display_name is '角色名字展示';
comment on column mc_role.role_desc is '角色信息描述';
comment on column mc_role.created_at is '创建时间';

create unique index mc_role_name_uindex
    on mc_role (name);