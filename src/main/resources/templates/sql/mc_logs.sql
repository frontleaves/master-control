create table mc_logs
(
    log_uuid   varchar(32)             not null
        constraint mc_logs_pk
            primary key,
    type       smallint  default 0     not null,
    business   varchar(16)             not null,
    "user"     varchar(36),
    value      varchar                 not null,
    created_at timestamp default now() not null
);

comment on table mc_logs is '日志数据表';
comment on column mc_logs.log_uuid is '日志表主键';
comment on column mc_logs.type is '日志类型';
comment on column mc_logs.business is '业务类型';
comment on column mc_logs."user" is '执行用户（可为空）';
comment on column mc_logs.value is '日志内容';
comment on column mc_logs.created_at is '日志创建时间';