--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixSystemreadyImplServletSystemReadyServletInfo' definition.
--


--
-- SELECT template for table `orgApacheFelixSystemreadyImplServletSystemReadyServletInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheFelixSystemreadyImplServletSystemReadyServletInfo` WHERE 1;

--
-- INSERT template for table `orgApacheFelixSystemreadyImplServletSystemReadyServletInfo`
--
INSERT INTO `orgApacheFelixSystemreadyImplServletSystemReadyServletInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheFelixSystemreadyImplServletSystemReadyServletInfo`
--
UPDATE `orgApacheFelixSystemreadyImplServletSystemReadyServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixSystemreadyImplServletSystemReadyServletInfo`
--
DELETE FROM `orgApacheFelixSystemreadyImplServletSystemReadyServletInfo` WHERE 0;

