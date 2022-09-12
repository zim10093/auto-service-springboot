--liquibase formatted sql
--changeset <ibondar>:<create-car-owners-table>
CREATE TABLE IF NOT EXISTS public.car_owners
(
    id bigint NOT NULL,
    PRIMARY KEY (id),
    name varchar(255) DEFAULT NULL
);

--rollback DROP TABLE car_owners;
