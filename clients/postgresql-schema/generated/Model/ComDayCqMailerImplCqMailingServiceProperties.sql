--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqMailerImplCqMailingServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_mailer_impl_cq_mailing_service_properties'
--
SELECT max/recipient/count FROM com_day_cq_mailer_impl_cq_mailing_service_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_mailer_impl_cq_mailing_service_properties'
--
INSERT INTO com_day_cq_mailer_impl_cq_mailing_service_properties (max/recipient/count) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_mailer_impl_cq_mailing_service_properties'
--
UPDATE com_day_cq_mailer_impl_cq_mailing_service_properties SET max/recipient/count = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_mailer_impl_cq_mailing_service_properties'
--
DELETE FROM com_day_cq_mailer_impl_cq_mailing_service_properties WHERE 1=2;

