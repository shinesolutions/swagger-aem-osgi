--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOffloadingImplOffloadingJobClonerProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteOffloadingImplOffloadingJobClonerProperties`
--
SELECT `offloading.jobcloner.enabled` FROM `comAdobeGraniteOffloadingImplOffloadingJobClonerProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOffloadingImplOffloadingJobClonerProperties`
--
INSERT INTO `comAdobeGraniteOffloadingImplOffloadingJobClonerProperties`(`offloading.jobcloner.enabled`) VALUES (?);

--
-- UPDATE template for table `comAdobeGraniteOffloadingImplOffloadingJobClonerProperties`
--
UPDATE `comAdobeGraniteOffloadingImplOffloadingJobClonerProperties` SET `offloading.jobcloner.enabled` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOffloadingImplOffloadingJobClonerProperties`
--
DELETE FROM `comAdobeGraniteOffloadingImplOffloadingJobClonerProperties` WHERE 0;

