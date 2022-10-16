create table public.users (
                              id integer primary key not null default nextval('users_id_seq'::regclass),
                              name character varying,
                              country character varying,
                              email character varying,
                              age integer,
                              is_adult boolean,
                              is_deleted boolean,
                              employee_id integer,
                              foreign key (employee_id) references public.cards (id)
                                  match simple on update no action on delete no action
);

create table public.addresses (
                                  id bigint primary key not null default nextval('addresses_id_seq'::regclass),
                                  address_has_active boolean,
                                  city character varying(255),
                                  postal_code character varying(255),
                                  street character varying(255),
                                  employee_id integer,
                                  foreign key (employee_id) references public.users (id)
                                      match simple on update no action on delete no action
);

create table public.cards (
                              id integer primary key not null default nextval('security_cards_id_seq'::regclass),
                              card_has_active boolean,
                              date timestamp without time zone,
                              number character varying(255)
);

