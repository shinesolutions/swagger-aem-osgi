--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo`
--
INSERT INTO `comAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo`
--
UPDATE `comAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo`
--
DELETE FROM `comAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo` WHERE 0;

