--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWidgetImplWidgetExtensionProviderImplProperties' definition.
--


--
-- SELECT template for table `comDayCqWidgetImplWidgetExtensionProviderImplProperties`
--
SELECT `extendable.widgets`, `widgetextensionprovider.debug` FROM `comDayCqWidgetImplWidgetExtensionProviderImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWidgetImplWidgetExtensionProviderImplProperties`
--
INSERT INTO `comDayCqWidgetImplWidgetExtensionProviderImplProperties`(`extendable.widgets`, `widgetextensionprovider.debug`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqWidgetImplWidgetExtensionProviderImplProperties`
--
UPDATE `comDayCqWidgetImplWidgetExtensionProviderImplProperties` SET `extendable.widgets` = ?, `widgetextensionprovider.debug` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWidgetImplWidgetExtensionProviderImplProperties`
--
DELETE FROM `comDayCqWidgetImplWidgetExtensionProviderImplProperties` WHERE 0;

