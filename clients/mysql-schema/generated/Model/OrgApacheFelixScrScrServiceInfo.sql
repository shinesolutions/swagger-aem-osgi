--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixScrScrServiceInfo' definition.
--


--
-- SELECT template for table `orgApacheFelixScrScrServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheFelixScrScrServiceInfo` WHERE 1;

--
-- INSERT template for table `orgApacheFelixScrScrServiceInfo`
--
INSERT INTO `orgApacheFelixScrScrServiceInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheFelixScrScrServiceInfo`
--
UPDATE `orgApacheFelixScrScrServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixScrScrServiceInfo`
--
DELETE FROM `orgApacheFelixScrScrServiceInfo` WHERE 0;

