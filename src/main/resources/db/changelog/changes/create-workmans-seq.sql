--liquibase formatted sql
--changeset <ibondar>:<create-workmans-sequence-id>
CREATE SEQUENCE IF NOT EXISTS public.workmans_id_seq INCREMENT 1 START 1 MINVALUE 1;

--rollback DROP SEQUENCE public.workmans_id_seq;
