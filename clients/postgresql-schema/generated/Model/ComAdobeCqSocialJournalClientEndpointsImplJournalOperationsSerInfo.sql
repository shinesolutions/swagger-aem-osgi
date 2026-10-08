--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_journal_client_endpoints_impl_journal_opera'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_journal_client_endpoints_impl_journal_opera WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_journal_client_endpoints_impl_journal_opera'
--
INSERT INTO com_adobe_cq_social_journal_client_endpoints_impl_journal_opera (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_journal_client_endpoints_impl_journal_opera'
--
UPDATE com_adobe_cq_social_journal_client_endpoints_impl_journal_opera SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_journal_client_endpoints_impl_journal_opera'
--
DELETE FROM com_adobe_cq_social_journal_client_endpoints_impl_journal_opera WHERE 1=2;

