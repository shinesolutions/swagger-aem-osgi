--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqCommerceImplAssetStaticImageHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_commerce_impl_asset_static_image_handler_propertie'
--
SELECT cq/commerce/asset/handler/active, cq/commerce/asset/handler/name FROM com_adobe_cq_commerce_impl_asset_static_image_handler_propertie WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_commerce_impl_asset_static_image_handler_propertie'
--
INSERT INTO com_adobe_cq_commerce_impl_asset_static_image_handler_propertie (cq/commerce/asset/handler/active, cq/commerce/asset/handler/name) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_commerce_impl_asset_static_image_handler_propertie'
--
UPDATE com_adobe_cq_commerce_impl_asset_static_image_handler_propertie SET cq/commerce/asset/handler/active = ?, cq/commerce/asset/handler/name = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_commerce_impl_asset_static_image_handler_propertie'
--
DELETE FROM com_adobe_cq_commerce_impl_asset_static_image_handler_propertie WHERE 1=2;

