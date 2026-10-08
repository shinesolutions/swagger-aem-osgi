--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqCommerceImplAssetVideoHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_commerce_impl_asset_video_handler_properties'
--
SELECT cq/commerce/asset/handler/active, cq/commerce/asset/handler/name FROM com_adobe_cq_commerce_impl_asset_video_handler_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_commerce_impl_asset_video_handler_properties'
--
INSERT INTO com_adobe_cq_commerce_impl_asset_video_handler_properties (cq/commerce/asset/handler/active, cq/commerce/asset/handler/name) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_commerce_impl_asset_video_handler_properties'
--
UPDATE com_adobe_cq_commerce_impl_asset_video_handler_properties SET cq/commerce/asset/handler/active = ?, cq/commerce/asset/handler/name = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_commerce_impl_asset_video_handler_properties'
--
DELETE FROM com_adobe_cq_commerce_impl_asset_video_handler_properties WHERE 1=2;

