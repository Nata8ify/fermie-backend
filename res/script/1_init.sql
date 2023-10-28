create table mas_category (
                              cate_id bigint generated always as identity
                                  constraint mas_category_pk primary key,
                              cate_title varchar(255) not null,
                              cate_description varchar(1000)
);

create table data_owner (
                            ownr_id bigint generated always as identity
                                constraint data_owner_pk primary key,
                            ownr_username varchar(100) not null,
                            ownr_password varchar(255) not null,
                            ownr_active boolean,
                            ownr_create_datetime timestamp not null,
                            ownr_update_datetime timestamp
);

create table data_ferment (
                              ferm_id bigint generated always as identity
                                  constraint data_ferment_pk primary key,
                              ferm_category bigint not null
                                  constraint mas_category_fk references mas_category(cate_id),
                              ferm_ferment_owner_id bigint not null,
                              ferm_title varchar(255) not null,
                              ferm_description text,
                              ferm_note text,
                              ferm_image_url varchar(1000) not null,
                              ferm_generation int,
                              ferm_parent_generation_id bigint,
                              ferm_status varchar(10) not null,
                              ferm_is_favorite boolean not null default false,
                              ferm_start_fermented_datetime timestamp,
                              ferm_end_fermented_datetime timestamp,
                              ferm_create_datetime timestamp not null,
                              ferm_update_datetime timestamp
);