--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties`
--
SELECT `hc.tags`, `minimum.code.cache.size` FROM `comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties`
--
INSERT INTO `comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties`(`hc.tags`, `minimum.code.cache.size`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties`
--
UPDATE `comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties` SET `hc.tags` = ?, `minimum.code.cache.size` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties`
--
DELETE FROM `comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties` WHERE 0;

