--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_commerce_impl_asset_product_asset_handler_provider'
--
SELECT pid, title, description, properties FROM com_adobe_cq_commerce_impl_asset_product_asset_handler_provider WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_commerce_impl_asset_product_asset_handler_provider'
--
INSERT INTO com_adobe_cq_commerce_impl_asset_product_asset_handler_provider (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_commerce_impl_asset_product_asset_handler_provider'
--
UPDATE com_adobe_cq_commerce_impl_asset_product_asset_handler_provider SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_commerce_impl_asset_product_asset_handler_provider'
--
DELETE FROM com_adobe_cq_commerce_impl_asset_product_asset_handler_provider WHERE 1=2;

