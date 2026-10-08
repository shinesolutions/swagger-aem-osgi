--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties`
--
SELECT `archiving.enabled`, `scheduler.expression`, `archive.since.days.completed` FROM `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties`
--
INSERT INTO `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties`(`archiving.enabled`, `scheduler.expression`, `archive.since.days.completed`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties`
--
UPDATE `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties` SET `archiving.enabled` = ?, `scheduler.expression` = ?, `archive.since.days.completed` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties`
--
DELETE FROM `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties` WHERE 0;

