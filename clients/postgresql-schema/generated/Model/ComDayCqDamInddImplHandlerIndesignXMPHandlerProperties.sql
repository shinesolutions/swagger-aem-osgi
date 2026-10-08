--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamInddImplHandlerIndesignXMPHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_propertie'
--
SELECT process/label, extract/pages FROM com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_propertie WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_propertie'
--
INSERT INTO com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_propertie (process/label, extract/pages) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_propertie'
--
UPDATE com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_propertie SET process/label = ?, extract/pages = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_propertie'
--
DELETE FROM com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_propertie WHERE 1=2;

