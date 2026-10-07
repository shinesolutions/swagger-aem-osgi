--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqCommerceImplAssetDynamicImageHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properti'
--
SELECT cq/commerce/asset/handler/active, cq/commerce/asset/handler/name FROM com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properti WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properti'
--
INSERT INTO com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properti (cq/commerce/asset/handler/active, cq/commerce/asset/handler/name) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properti'
--
UPDATE com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properti SET cq/commerce/asset/handler/active = ?, cq/commerce/asset/handler/name = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properti'
--
DELETE FROM com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properti WHERE 1=2;

