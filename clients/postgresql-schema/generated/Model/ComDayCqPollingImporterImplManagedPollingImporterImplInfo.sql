--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqPollingImporterImplManagedPollingImporterImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_polling_importer_impl_managed_polling_importer_impl_'
--
SELECT pid, title, description, properties FROM com_day_cq_polling_importer_impl_managed_polling_importer_impl_ WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_polling_importer_impl_managed_polling_importer_impl_'
--
INSERT INTO com_day_cq_polling_importer_impl_managed_polling_importer_impl_ (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_polling_importer_impl_managed_polling_importer_impl_'
--
UPDATE com_day_cq_polling_importer_impl_managed_polling_importer_impl_ SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_polling_importer_impl_managed_polling_importer_impl_'
--
DELETE FROM com_day_cq_polling_importer_impl_managed_polling_importer_impl_ WHERE 1=2;

