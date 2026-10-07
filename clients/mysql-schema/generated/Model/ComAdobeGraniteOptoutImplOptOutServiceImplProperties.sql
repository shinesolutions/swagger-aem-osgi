--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOptoutImplOptOutServiceImplProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteOptoutImplOptOutServiceImplProperties`
--
SELECT `optout.cookies`, `optout.headers`, `optout.whitelist.cookies` FROM `comAdobeGraniteOptoutImplOptOutServiceImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOptoutImplOptOutServiceImplProperties`
--
INSERT INTO `comAdobeGraniteOptoutImplOptOutServiceImplProperties`(`optout.cookies`, `optout.headers`, `optout.whitelist.cookies`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteOptoutImplOptOutServiceImplProperties`
--
UPDATE `comAdobeGraniteOptoutImplOptOutServiceImplProperties` SET `optout.cookies` = ?, `optout.headers` = ?, `optout.whitelist.cookies` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOptoutImplOptOutServiceImplProperties`
--
DELETE FROM `comAdobeGraniteOptoutImplOptOutServiceImplProperties` WHERE 0;

