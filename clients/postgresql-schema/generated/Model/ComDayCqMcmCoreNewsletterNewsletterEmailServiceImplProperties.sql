--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_pr'
--
SELECT from/address, sender/host, max/bounce/count FROM com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_pr WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_pr'
--
INSERT INTO com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_pr (from/address, sender/host, max/bounce/count) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_pr'
--
UPDATE com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_pr SET from/address = ?, sender/host = ?, max/bounce/count = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_pr'
--
DELETE FROM com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_pr WHERE 1=2;

