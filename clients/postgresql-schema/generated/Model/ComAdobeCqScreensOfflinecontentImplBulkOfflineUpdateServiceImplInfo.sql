--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_se'
--
SELECT pid, title, description, properties FROM com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_se WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_se'
--
INSERT INTO com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_se (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_se'
--
UPDATE com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_se SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_se'
--
DELETE FROM com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_se WHERE 1=2;

