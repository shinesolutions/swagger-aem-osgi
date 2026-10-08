--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOffloadingImplOffloadingConfiguratorProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteOffloadingImplOffloadingConfiguratorProperties`
--
SELECT `offloading.transporter`, `offloading.cleanup.payload` FROM `comAdobeGraniteOffloadingImplOffloadingConfiguratorProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOffloadingImplOffloadingConfiguratorProperties`
--
INSERT INTO `comAdobeGraniteOffloadingImplOffloadingConfiguratorProperties`(`offloading.transporter`, `offloading.cleanup.payload`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteOffloadingImplOffloadingConfiguratorProperties`
--
UPDATE `comAdobeGraniteOffloadingImplOffloadingConfiguratorProperties` SET `offloading.transporter` = ?, `offloading.cleanup.payload` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOffloadingImplOffloadingConfiguratorProperties`
--
DELETE FROM `comAdobeGraniteOffloadingImplOffloadingConfiguratorProperties` WHERE 0;

