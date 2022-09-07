--liquibase formatted sql
--changeset <ibondar>:<create-services-table>
CREATE TABLE IF NOT EXISTS public.services
(
    id bigint NOT NULL,
    price decimal(19,2) DEFAULT NULL,
    service_status varchar(20) DEFAULT NULL,
    order_id bigint DEFAULT NULL,
    workman_id bigint DEFAULT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_order
        FOREIGN KEY(id)
            REFERENCES orders(id),
    CONSTRAINT fk_workman
        FOREIGN KEY(id)
            REFERENCES workmans(id)
);

--rollback DROP TABLE services;
