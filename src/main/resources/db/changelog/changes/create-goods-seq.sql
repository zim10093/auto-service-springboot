--liquibase formatted sql
--changeset <ibondar>:<create-goods-sequence-id>
CREATE SEQUENCE IF NOT EXISTS public.goods_id_seq INCREMENT 1 START 1 MINVALUE 1;

--rollback DROP SEQUENCE public.goods_id_seq;
