--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixSystemreadySystemReadyMonitorInfo' definition.
--


--
-- SELECT template for table `orgApacheFelixSystemreadySystemReadyMonitorInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheFelixSystemreadySystemReadyMonitorInfo` WHERE 1;

--
-- INSERT template for table `orgApacheFelixSystemreadySystemReadyMonitorInfo`
--
INSERT INTO `orgApacheFelixSystemreadySystemReadyMonitorInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheFelixSystemreadySystemReadyMonitorInfo`
--
UPDATE `orgApacheFelixSystemreadySystemReadyMonitorInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixSystemreadySystemReadyMonitorInfo`
--
DELETE FROM `orgApacheFelixSystemreadySystemReadyMonitorInfo` WHERE 0;

