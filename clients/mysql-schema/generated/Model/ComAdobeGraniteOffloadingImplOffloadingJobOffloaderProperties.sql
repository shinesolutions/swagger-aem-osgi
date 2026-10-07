--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties`
--
SELECT `offloading.offloader.enabled` FROM `comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties`
--
INSERT INTO `comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties`(`offloading.offloader.enabled`) VALUES (?);

--
-- UPDATE template for table `comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties`
--
UPDATE `comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties` SET `offloading.offloader.enabled` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties`
--
DELETE FROM `comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties` WHERE 0;

