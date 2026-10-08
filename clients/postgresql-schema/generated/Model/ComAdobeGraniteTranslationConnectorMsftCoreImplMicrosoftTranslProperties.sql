--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_translation_connector_msft_core_impl_microsof'
--
SELECT translation_factory, default_connector_label, default_connector_attribution, default_connector_workspace_id, default_connector_subscription_key, language_map_location, category_map_location, retry_attempts, timeout_count FROM com_adobe_granite_translation_connector_msft_core_impl_microsof WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_translation_connector_msft_core_impl_microsof'
--
INSERT INTO com_adobe_granite_translation_connector_msft_core_impl_microsof (translation_factory, default_connector_label, default_connector_attribution, default_connector_workspace_id, default_connector_subscription_key, language_map_location, category_map_location, retry_attempts, timeout_count) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_translation_connector_msft_core_impl_microsof'
--
UPDATE com_adobe_granite_translation_connector_msft_core_impl_microsof SET translation_factory = ?, default_connector_label = ?, default_connector_attribution = ?, default_connector_workspace_id = ?, default_connector_subscription_key = ?, language_map_location = ?, category_map_location = ?, retry_attempts = ?, timeout_count = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_translation_connector_msft_core_impl_microsof'
--
DELETE FROM com_adobe_granite_translation_connector_msft_core_impl_microsof WHERE 1=2;

