--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo' definition.
--


--
-- SELECT template for table `comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo` WHERE 1;

--
-- INSERT template for table `comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo`
--
INSERT INTO `comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo`
--
UPDATE `comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo`
--
DELETE FROM `comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo` WHERE 0;

