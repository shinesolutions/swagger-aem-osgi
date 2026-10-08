--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAcpPlatformPlatformServletInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteAcpPlatformPlatformServletInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteAcpPlatformPlatformServletInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAcpPlatformPlatformServletInfo`
--
INSERT INTO `comAdobeGraniteAcpPlatformPlatformServletInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteAcpPlatformPlatformServletInfo`
--
UPDATE `comAdobeGraniteAcpPlatformPlatformServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAcpPlatformPlatformServletInfo`
--
DELETE FROM `comAdobeGraniteAcpPlatformPlatformServletInfo` WHERE 0;

