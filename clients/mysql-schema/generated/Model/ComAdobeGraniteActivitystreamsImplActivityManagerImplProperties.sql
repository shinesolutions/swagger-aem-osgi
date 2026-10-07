--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteActivitystreamsImplActivityManagerImplProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteActivitystreamsImplActivityManagerImplProperties`
--
SELECT `aggregate.relationships`, `aggregate.descend.virtual` FROM `comAdobeGraniteActivitystreamsImplActivityManagerImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteActivitystreamsImplActivityManagerImplProperties`
--
INSERT INTO `comAdobeGraniteActivitystreamsImplActivityManagerImplProperties`(`aggregate.relationships`, `aggregate.descend.virtual`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteActivitystreamsImplActivityManagerImplProperties`
--
UPDATE `comAdobeGraniteActivitystreamsImplActivityManagerImplProperties` SET `aggregate.relationships` = ?, `aggregate.descend.virtual` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteActivitystreamsImplActivityManagerImplProperties`
--
DELETE FROM `comAdobeGraniteActivitystreamsImplActivityManagerImplProperties` WHERE 0;

