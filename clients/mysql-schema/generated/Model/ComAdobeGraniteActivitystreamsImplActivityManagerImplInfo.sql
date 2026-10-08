--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteActivitystreamsImplActivityManagerImplInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteActivitystreamsImplActivityManagerImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteActivitystreamsImplActivityManagerImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteActivitystreamsImplActivityManagerImplInfo`
--
INSERT INTO `comAdobeGraniteActivitystreamsImplActivityManagerImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteActivitystreamsImplActivityManagerImplInfo`
--
UPDATE `comAdobeGraniteActivitystreamsImplActivityManagerImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteActivitystreamsImplActivityManagerImplInfo`
--
DELETE FROM `comAdobeGraniteActivitystreamsImplActivityManagerImplInfo` WHERE 0;

