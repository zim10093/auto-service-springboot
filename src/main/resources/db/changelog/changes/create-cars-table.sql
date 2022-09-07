--liquibase formatted sql
--changeset <ibondar>:<create-car-table>
CREATE TABLE IF NOT EXISTS public.cars
(
    id bigint NOT NULL,
    license_number varchar(255) DEFAULT NULL,
    manufacturer varchar(255) DEFAULT NULL,
    model varchar(255) DEFAULT NULL,
    year int NOT NULL,
    car_owner_id bigint DEFAULT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_car_owner
        FOREIGN KEY(id)
            REFERENCES car_owners(id)

);

--rollback DROP TABLE cars;
