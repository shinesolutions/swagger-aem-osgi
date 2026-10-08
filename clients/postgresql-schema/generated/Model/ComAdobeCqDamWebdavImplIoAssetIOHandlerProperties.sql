--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqDamWebdavImplIoAssetIOHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties'
--
SELECT service/ranking, path_prefix, create_version FROM com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties'
--
INSERT INTO com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties (service/ranking, path_prefix, create_version) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties'
--
UPDATE com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties SET service/ranking = ?, path_prefix = ?, create_version = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties'
--
DELETE FROM com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties WHERE 1=2;

