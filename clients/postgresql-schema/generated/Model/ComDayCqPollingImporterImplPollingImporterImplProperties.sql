--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqPollingImporterImplPollingImporterImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_polling_importer_impl_polling_importer_impl_properti'
--
SELECT importer/min/interval, importer/user, exclude/paths, include/paths FROM com_day_cq_polling_importer_impl_polling_importer_impl_properti WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_polling_importer_impl_polling_importer_impl_properti'
--
INSERT INTO com_day_cq_polling_importer_impl_polling_importer_impl_properti (importer/min/interval, importer/user, exclude/paths, include/paths) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_polling_importer_impl_polling_importer_impl_properti'
--
UPDATE com_day_cq_polling_importer_impl_polling_importer_impl_properti SET importer/min/interval = ?, importer/user = ?, exclude/paths = ?, include/paths = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_polling_importer_impl_polling_importer_impl_properti'
--
DELETE FROM com_day_cq_polling_importer_impl_polling_importer_impl_properti WHERE 1=2;

