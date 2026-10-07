--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteContexthubImplContextHubImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_contexthub_impl_context_hub_impl_properties'
--
SELECT com/adobe/granite/contexthub/silent_mode, com/adobe/granite/contexthub/show_ui FROM com_adobe_granite_contexthub_impl_context_hub_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_contexthub_impl_context_hub_impl_properties'
--
INSERT INTO com_adobe_granite_contexthub_impl_context_hub_impl_properties (com/adobe/granite/contexthub/silent_mode, com/adobe/granite/contexthub/show_ui) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_contexthub_impl_context_hub_impl_properties'
--
UPDATE com_adobe_granite_contexthub_impl_context_hub_impl_properties SET com/adobe/granite/contexthub/silent_mode = ?, com/adobe/granite/contexthub/show_ui = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_contexthub_impl_context_hub_impl_properties'
--
DELETE FROM com_adobe_granite_contexthub_impl_context_hub_impl_properties WHERE 1=2;

