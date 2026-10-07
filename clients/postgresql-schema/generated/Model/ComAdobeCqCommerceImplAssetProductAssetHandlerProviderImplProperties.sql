--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_commerce_impl_asset_product_asset_handler_provider'
--
SELECT cq/commerce/asset/handler/fallback FROM com_adobe_cq_commerce_impl_asset_product_asset_handler_provider WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_commerce_impl_asset_product_asset_handler_provider'
--
INSERT INTO com_adobe_cq_commerce_impl_asset_product_asset_handler_provider (cq/commerce/asset/handler/fallback) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_commerce_impl_asset_product_asset_handler_provider'
--
UPDATE com_adobe_cq_commerce_impl_asset_product_asset_handler_provider SET cq/commerce/asset/handler/fallback = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_commerce_impl_asset_product_asset_handler_provider'
--
DELETE FROM com_adobe_cq_commerce_impl_asset_product_asset_handler_provider WHERE 1=2;

