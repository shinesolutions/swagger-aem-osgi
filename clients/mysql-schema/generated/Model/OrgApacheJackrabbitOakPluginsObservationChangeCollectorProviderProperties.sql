--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderP`
--
SELECT `maxItems`, `maxPathDepth`, `enabled` FROM `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderP` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderP`
--
INSERT INTO `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderP`(`maxItems`, `maxPathDepth`, `enabled`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderP`
--
UPDATE `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderP` SET `maxItems` = ?, `maxPathDepth` = ?, `enabled` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderP`
--
DELETE FROM `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderP` WHERE 0;

