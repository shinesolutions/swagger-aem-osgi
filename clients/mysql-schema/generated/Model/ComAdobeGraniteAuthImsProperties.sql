--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthImsProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthImsProperties`
--
SELECT `configid`, `scope` FROM `comAdobeGraniteAuthImsProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthImsProperties`
--
INSERT INTO `comAdobeGraniteAuthImsProperties`(`configid`, `scope`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthImsProperties`
--
UPDATE `comAdobeGraniteAuthImsProperties` SET `configid` = ?, `scope` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthImsProperties`
--
DELETE FROM `comAdobeGraniteAuthImsProperties` WHERE 0;

