create table mc_info
(
    info_uuid  varchar(36)             not null
        constraint mc_info_pk
            primary key,
    key        varchar(128)            not null,
    value      varchar,
    updated_at timestamp default now() not null
);

comment on table mc_info is '信息表';
comment on column mc_info.info_uuid is '信息表主键';
comment on column mc_info.key is '键值对-键';
comment on column mc_info.value is '键值对-值';
comment on column mc_info.updated_at is '修改时间';

create unique index mc_info_key_uindex
    on mc_info (key);