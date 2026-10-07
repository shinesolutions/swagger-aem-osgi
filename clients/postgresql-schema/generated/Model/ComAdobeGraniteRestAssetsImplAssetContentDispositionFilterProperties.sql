--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_rest_assets_impl_asset_content_disposition_fi'
--
SELECT mime/allow_empty, mime/allowed FROM com_adobe_granite_rest_assets_impl_asset_content_disposition_fi WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_rest_assets_impl_asset_content_disposition_fi'
--
INSERT INTO com_adobe_granite_rest_assets_impl_asset_content_disposition_fi (mime/allow_empty, mime/allowed) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_rest_assets_impl_asset_content_disposition_fi'
--
UPDATE com_adobe_granite_rest_assets_impl_asset_content_disposition_fi SET mime/allow_empty = ?, mime/allowed = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_rest_assets_impl_asset_content_disposition_fi'
--
DELETE FROM com_adobe_granite_rest_assets_impl_asset_content_disposition_fi WHERE 1=2;

