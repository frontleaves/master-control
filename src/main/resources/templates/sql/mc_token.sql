create table mc_token
(
    token_uuid        varchar(36)             not null
        constraint mc_token_pk
            primary key,
    user_uuid         varchar(36)             not null
        constraint mc_token_mc_user_uuid_fk
            references mc_user
            on update cascade on delete cascade,
    created_at        timestamp default now() not null,
    expired_at        timestamp               not null,
    client_ip         varchar(39)             not null,
    client_referer    varchar(1024),
    client_user_agent varchar                 not null
);

comment on table mc_token is '令牌';
comment on column mc_token.token_uuid is '令牌';
comment on column mc_token.user_uuid is '用户主键';
comment on column mc_token.created_at is '创建时间';
comment on column mc_token.expired_at is '过期时间';
comment on column mc_token.client_ip is '客户端登录时 IP';
comment on column mc_token.client_referer is '客户端 Referer';
comment on column mc_token.client_user_agent is '客户端用户信息';