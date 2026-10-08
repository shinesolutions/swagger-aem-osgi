--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqPollingImporterImplManagedPollConfigImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_polling_importer_impl_managed_poll_config_impl_prope'
--
SELECT "id", enabled, reference, "interval", "expression", "source", "target", login, "password" FROM com_day_cq_polling_importer_impl_managed_poll_config_impl_prope WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_polling_importer_impl_managed_poll_config_impl_prope'
--
INSERT INTO com_day_cq_polling_importer_impl_managed_poll_config_impl_prope ("id", enabled, reference, "interval", "expression", "source", "target", login, "password") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_polling_importer_impl_managed_poll_config_impl_prope'
--
UPDATE com_day_cq_polling_importer_impl_managed_poll_config_impl_prope SET "id" = ?, enabled = ?, reference = ?, "interval" = ?, "expression" = ?, "source" = ?, "target" = ?, login = ?, "password" = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_polling_importer_impl_managed_poll_config_impl_prope'
--
DELETE FROM com_day_cq_polling_importer_impl_managed_poll_config_impl_prope WHERE 1=2;

