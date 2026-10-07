--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqMailerDefaultMailServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_mailer_default_mail_service_properties'
--
SELECT smtp/host, smtp/port, smtp/user, smtp/password, from/address, smtp/ssl, smtp/starttls, debug/email FROM com_day_cq_mailer_default_mail_service_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_mailer_default_mail_service_properties'
--
INSERT INTO com_day_cq_mailer_default_mail_service_properties (smtp/host, smtp/port, smtp/user, smtp/password, from/address, smtp/ssl, smtp/starttls, debug/email) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_mailer_default_mail_service_properties'
--
UPDATE com_day_cq_mailer_default_mail_service_properties SET smtp/host = ?, smtp/port = ?, smtp/user = ?, smtp/password = ?, from/address = ?, smtp/ssl = ?, smtp/starttls = ?, debug/email = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_mailer_default_mail_service_properties'
--
DELETE FROM com_day_cq_mailer_default_mail_service_properties WHERE 1=2;

