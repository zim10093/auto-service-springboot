--liquibase formatted sql
--changeset <ibondar>:<create-orders-table>
CREATE TABLE IF NOT EXISTS public.orders
(
    id bigint NOT NULL,
    accepted_date date DEFAULT NULL,
    finish_date date DEFAULT NULL,
    order_status varchar(30) DEFAULT NULL,
    problem varchar(255) DEFAULT NULL,
    total_cost decimal(19,2) DEFAULT NULL,
    car_id bigint DEFAULT NULL,
    workman_id bigint DEFAULT NULL,
    car_owner_id bigint DEFAULT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_car
        FOREIGN KEY(id)
            REFERENCES cars(id),
    CONSTRAINT fk_workman
        FOREIGN KEY(id)
            REFERENCES workmans(id),
    CONSTRAINT fk_car_owner
        FOREIGN KEY(id)
            REFERENCES car_owners(id)
);

--rollback DROP TABLE orders;
