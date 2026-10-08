--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties`
--
SELECT `feature.name`, `feature.description`, `http.header.name`, `http.header.valuepattern` FROM `comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties`
--
INSERT INTO `comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties`(`feature.name`, `feature.description`, `http.header.name`, `http.header.valuepattern`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties`
--
UPDATE `comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties` SET `feature.name` = ?, `feature.description` = ?, `http.header.name` = ?, `http.header.valuepattern` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties`
--
DELETE FROM `comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties` WHERE 0;

