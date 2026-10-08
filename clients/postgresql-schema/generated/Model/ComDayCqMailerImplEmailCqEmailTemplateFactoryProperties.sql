--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqMailerImplEmailCqEmailTemplateFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_mailer_impl_email_cq_email_template_factory_properti'
--
SELECT mailer/email/charset FROM com_day_cq_mailer_impl_email_cq_email_template_factory_properti WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_mailer_impl_email_cq_email_template_factory_properti'
--
INSERT INTO com_day_cq_mailer_impl_email_cq_email_template_factory_properti (mailer/email/charset) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_mailer_impl_email_cq_email_template_factory_properti'
--
UPDATE com_day_cq_mailer_impl_email_cq_email_template_factory_properti SET mailer/email/charset = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_mailer_impl_email_cq_email_template_factory_properti'
--
DELETE FROM com_day_cq_mailer_impl_email_cq_email_template_factory_properti WHERE 1=2;

