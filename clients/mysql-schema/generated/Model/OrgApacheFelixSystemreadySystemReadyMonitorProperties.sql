--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixSystemreadySystemReadyMonitorProperties' definition.
--


--
-- SELECT template for table `orgApacheFelixSystemreadySystemReadyMonitorProperties`
--
SELECT `poll.interval` FROM `orgApacheFelixSystemreadySystemReadyMonitorProperties` WHERE 1;

--
-- INSERT template for table `orgApacheFelixSystemreadySystemReadyMonitorProperties`
--
INSERT INTO `orgApacheFelixSystemreadySystemReadyMonitorProperties`(`poll.interval`) VALUES (?);

--
-- UPDATE template for table `orgApacheFelixSystemreadySystemReadyMonitorProperties`
--
UPDATE `orgApacheFelixSystemreadySystemReadyMonitorProperties` SET `poll.interval` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixSystemreadySystemReadyMonitorProperties`
--
DELETE FROM `orgApacheFelixSystemreadySystemReadyMonitorProperties` WHERE 0;

