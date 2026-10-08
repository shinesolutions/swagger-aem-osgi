--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties' definition.
--


--
-- SELECT template for table `comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties`
--
SELECT `maxConnections`, `maxRequests`, `requestTimeout`, `logDir` FROM `comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties` WHERE 1;

--
-- INSERT template for table `comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties`
--
INSERT INTO `comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties`(`maxConnections`, `maxRequests`, `requestTimeout`, `logDir`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties`
--
UPDATE `comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties` SET `maxConnections` = ?, `maxRequests` = ?, `requestTimeout` = ?, `logDir` = ? WHERE 1;

--
-- DELETE template for table `comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties`
--
DELETE FROM `comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties` WHERE 0;

