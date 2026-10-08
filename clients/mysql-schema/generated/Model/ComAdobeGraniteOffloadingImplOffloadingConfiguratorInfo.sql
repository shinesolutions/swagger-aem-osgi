--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOffloadingImplOffloadingConfiguratorInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteOffloadingImplOffloadingConfiguratorInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteOffloadingImplOffloadingConfiguratorInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOffloadingImplOffloadingConfiguratorInfo`
--
INSERT INTO `comAdobeGraniteOffloadingImplOffloadingConfiguratorInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteOffloadingImplOffloadingConfiguratorInfo`
--
UPDATE `comAdobeGraniteOffloadingImplOffloadingConfiguratorInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOffloadingImplOffloadingConfiguratorInfo`
--
DELETE FROM `comAdobeGraniteOffloadingImplOffloadingConfiguratorInfo` WHERE 0;

