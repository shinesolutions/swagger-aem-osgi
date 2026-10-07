--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo`
--
INSERT INTO `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo`
--
UPDATE `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo`
--
DELETE FROM `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo` WHERE 0;

