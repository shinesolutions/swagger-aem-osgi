--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderI`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderI` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderI`
--
INSERT INTO `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderI`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderI`
--
UPDATE `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderI` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderI`
--
DELETE FROM `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderI` WHERE 0;

