--liquibase formatted sql
--changeset <ibondar>:<create-car-owners-sequence-id>
CREATE SEQUENCE IF NOT EXISTS public.car_owners_id_seq INCREMENT 1 START 1 MINVALUE 1;

--rollback DROP SEQUENCE public.car_owners_id_seq;
