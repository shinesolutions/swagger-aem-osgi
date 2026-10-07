--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteHttpcacheFileFileCacheStoreProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteHttpcacheFileFileCacheStoreProperties`
--
SELECT `com.adobe.granite.httpcache.file.documentRoot`, `com.adobe.granite.httpcache.file.includeHost` FROM `comAdobeGraniteHttpcacheFileFileCacheStoreProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteHttpcacheFileFileCacheStoreProperties`
--
INSERT INTO `comAdobeGraniteHttpcacheFileFileCacheStoreProperties`(`com.adobe.granite.httpcache.file.documentRoot`, `com.adobe.granite.httpcache.file.includeHost`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteHttpcacheFileFileCacheStoreProperties`
--
UPDATE `comAdobeGraniteHttpcacheFileFileCacheStoreProperties` SET `com.adobe.granite.httpcache.file.documentRoot` = ?, `com.adobe.granite.httpcache.file.includeHost` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteHttpcacheFileFileCacheStoreProperties`
--
DELETE FROM `comAdobeGraniteHttpcacheFileFileCacheStoreProperties` WHERE 0;

