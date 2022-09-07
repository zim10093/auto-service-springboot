--liquibase formatted sql
--changeset <ibondar>:<create-workmans-table>
CREATE TABLE IF NOT EXISTS public.workmans
(
    id bigint NOT NULL,
    name varchar(255) DEFAULT NULL,
    PRIMARY KEY (id)
);

--rollback DROP TABLE workmans;
