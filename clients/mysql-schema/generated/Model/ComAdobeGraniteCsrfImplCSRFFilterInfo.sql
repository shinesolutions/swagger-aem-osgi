--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteCsrfImplCSRFFilterInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteCsrfImplCSRFFilterInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeGraniteCsrfImplCSRFFilterInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteCsrfImplCSRFFilterInfo`
--
INSERT INTO `comAdobeGraniteCsrfImplCSRFFilterInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteCsrfImplCSRFFilterInfo`
--
UPDATE `comAdobeGraniteCsrfImplCSRFFilterInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteCsrfImplCSRFFilterInfo`
--
DELETE FROM `comAdobeGraniteCsrfImplCSRFFilterInfo` WHERE 0;

