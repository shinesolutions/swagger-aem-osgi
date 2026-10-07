--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPr`
--
SELECT `hc.tags`, `exclude.search.path` FROM `comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPr` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPr`
--
INSERT INTO `comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPr`(`hc.tags`, `exclude.search.path`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPr`
--
UPDATE `comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPr` SET `hc.tags` = ?, `exclude.search.path` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPr`
--
DELETE FROM `comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPr` WHERE 0;

