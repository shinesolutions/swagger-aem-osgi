--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWidgetImplWidgetExtensionProviderImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_widget_impl_widget_extension_provider_impl_propertie'
--
SELECT extendable/widgets, widgetextensionprovider/debug FROM com_day_cq_widget_impl_widget_extension_provider_impl_propertie WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_widget_impl_widget_extension_provider_impl_propertie'
--
INSERT INTO com_day_cq_widget_impl_widget_extension_provider_impl_propertie (extendable/widgets, widgetextensionprovider/debug) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_widget_impl_widget_extension_provider_impl_propertie'
--
UPDATE com_day_cq_widget_impl_widget_extension_provider_impl_propertie SET extendable/widgets = ?, widgetextensionprovider/debug = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_widget_impl_widget_extension_provider_impl_propertie'
--
DELETE FROM com_day_cq_widget_impl_widget_extension_provider_impl_propertie WHERE 1=2;

