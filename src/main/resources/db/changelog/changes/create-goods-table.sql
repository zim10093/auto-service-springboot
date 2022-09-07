--liquibase formatted sql
--changeset <ibondar>:<create-goods-table>
CREATE TABLE IF NOT EXISTS public.goods
(
    id bigint NOT NULL,
    name varchar(255) DEFAULT NULL,
    price decimal(19,2) DEFAULT NULL,
    order_id bigint DEFAULT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_order
        FOREIGN KEY(id)
            REFERENCES orders(id)
);

--rollback DROP TABLE goods;
