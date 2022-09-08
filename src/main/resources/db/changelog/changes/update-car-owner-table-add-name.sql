--liquibase formatted sql
--changeset <ibondar>:<update-car-owners-table-add-name-column>

    ALTER TABLE car_owners
    ADD COLUMN name varchar(255) DEFAULT NULL;

--rollback ALTER TABLE car_owners DROP COLUMN name;
