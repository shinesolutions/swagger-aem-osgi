--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProper`
--
SELECT `accountName`, `containerName`, `accessKey`, `rootPath`, `connectionURL` FROM `orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProper` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProper`
--
INSERT INTO `orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProper`(`accountName`, `containerName`, `accessKey`, `rootPath`, `connectionURL`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProper`
--
UPDATE `orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProper` SET `accountName` = ?, `containerName` = ?, `accessKey` = ?, `rootPath` = ?, `connectionURL` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProper`
--
DELETE FROM `orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProper` WHERE 0;

