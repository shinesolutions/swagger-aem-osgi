--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeAemTransactionCoreImplTransactionRecorderProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_aem_transaction_core_impl_transaction_recorder_proper'
--
SELECT is_transaction_recording_enabled FROM com_adobe_aem_transaction_core_impl_transaction_recorder_proper WHERE 1=1;

--
-- INSERT template for table 'com_adobe_aem_transaction_core_impl_transaction_recorder_proper'
--
INSERT INTO com_adobe_aem_transaction_core_impl_transaction_recorder_proper (is_transaction_recording_enabled) VALUES (?);

--
-- UPDATE template for table 'com_adobe_aem_transaction_core_impl_transaction_recorder_proper'
--
UPDATE com_adobe_aem_transaction_core_impl_transaction_recorder_proper SET is_transaction_recording_enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_aem_transaction_core_impl_transaction_recorder_proper'
--
DELETE FROM com_adobe_aem_transaction_core_impl_transaction_recorder_proper WHERE 1=2;

