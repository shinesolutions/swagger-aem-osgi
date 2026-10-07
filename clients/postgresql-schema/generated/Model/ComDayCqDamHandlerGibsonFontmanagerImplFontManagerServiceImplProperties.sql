--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_ser'
--
SELECT event/filter, fontmgr/system/font/dir, fontmgr/adobe/font/dir, fontmgr/customer/font/dir FROM com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_ser WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_ser'
--
INSERT INTO com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_ser (event/filter, fontmgr/system/font/dir, fontmgr/adobe/font/dir, fontmgr/customer/font/dir) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_ser'
--
UPDATE com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_ser SET event/filter = ?, fontmgr/system/font/dir = ?, fontmgr/adobe/font/dir = ?, fontmgr/customer/font/dir = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_ser'
--
DELETE FROM com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_ser WHERE 1=2;

