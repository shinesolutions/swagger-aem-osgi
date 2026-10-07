--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCorePayloadMapCacheInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteWorkflowCorePayloadMapCacheInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteWorkflowCorePayloadMapCacheInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteWorkflowCorePayloadMapCacheInfo`
--
INSERT INTO `comAdobeGraniteWorkflowCorePayloadMapCacheInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteWorkflowCorePayloadMapCacheInfo`
--
UPDATE `comAdobeGraniteWorkflowCorePayloadMapCacheInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteWorkflowCorePayloadMapCacheInfo`
--
DELETE FROM `comAdobeGraniteWorkflowCorePayloadMapCacheInfo` WHERE 0;

