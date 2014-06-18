drop table if exists public.user;
drop sequence if exists user_id_seq;

create sequence user_id_seq;
CREATE TABLE public.user(
   user_id INT NOT NULL default nextval('user_id_seq'),
   login VARCHAR(20) NOT NULL,
   name VARCHAR(20),
   CONSTRAINT "user_id_PK" PRIMARY KEY ("user_id")
);
ALTER SEQUENCE user_id_seq OWNED BY public.user.user_id;