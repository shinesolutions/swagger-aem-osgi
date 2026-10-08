--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteSecurityUserUserPropertiesServiceProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteSecurityUserUserPropertiesServiceProperties`
--
SELECT `adapter.condition`, `granite.userproperties.nodetypes`, `granite.userproperties.resourcetypes` FROM `comAdobeGraniteSecurityUserUserPropertiesServiceProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteSecurityUserUserPropertiesServiceProperties`
--
INSERT INTO `comAdobeGraniteSecurityUserUserPropertiesServiceProperties`(`adapter.condition`, `granite.userproperties.nodetypes`, `granite.userproperties.resourcetypes`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteSecurityUserUserPropertiesServiceProperties`
--
UPDATE `comAdobeGraniteSecurityUserUserPropertiesServiceProperties` SET `adapter.condition` = ?, `granite.userproperties.nodetypes` = ?, `granite.userproperties.resourcetypes` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteSecurityUserUserPropertiesServiceProperties`
--
DELETE FROM `comAdobeGraniteSecurityUserUserPropertiesServiceProperties` WHERE 0;

