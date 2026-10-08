--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixSystemreadyImplServletSystemAliveServletInfo' definition.
--


--
-- SELECT template for table `orgApacheFelixSystemreadyImplServletSystemAliveServletInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheFelixSystemreadyImplServletSystemAliveServletInfo` WHERE 1;

--
-- INSERT template for table `orgApacheFelixSystemreadyImplServletSystemAliveServletInfo`
--
INSERT INTO `orgApacheFelixSystemreadyImplServletSystemAliveServletInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheFelixSystemreadyImplServletSystemAliveServletInfo`
--
UPDATE `orgApacheFelixSystemreadyImplServletSystemAliveServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixSystemreadyImplServletSystemAliveServletInfo`
--
DELETE FROM `orgApacheFelixSystemreadyImplServletSystemAliveServletInfo` WHERE 0;

