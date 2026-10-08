--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOffloadingImplOffloadingJobClonerInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteOffloadingImplOffloadingJobClonerInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeGraniteOffloadingImplOffloadingJobClonerInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOffloadingImplOffloadingJobClonerInfo`
--
INSERT INTO `comAdobeGraniteOffloadingImplOffloadingJobClonerInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteOffloadingImplOffloadingJobClonerInfo`
--
UPDATE `comAdobeGraniteOffloadingImplOffloadingJobClonerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOffloadingImplOffloadingJobClonerInfo`
--
DELETE FROM `comAdobeGraniteOffloadingImplOffloadingJobClonerInfo` WHERE 0;

