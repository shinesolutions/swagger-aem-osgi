--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacP`
--
SELECT `includedPaths`, `enableAsyncObserver`, `observerQueueSize` FROM `orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacP` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacP`
--
INSERT INTO `orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacP`(`includedPaths`, `enableAsyncObserver`, `observerQueueSize`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacP`
--
UPDATE `orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacP` SET `includedPaths` = ?, `enableAsyncObserver` = ?, `observerQueueSize` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacP`
--
DELETE FROM `orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacP` WHERE 0;

