--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties' definition.
--


--
-- SELECT template for table `orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoP`
--
SELECT `felix.memoryusage.dump.threshold`, `felix.memoryusage.dump.interval`, `felix.memoryusage.dump.location` FROM `orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoP` WHERE 1;

--
-- INSERT template for table `orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoP`
--
INSERT INTO `orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoP`(`felix.memoryusage.dump.threshold`, `felix.memoryusage.dump.interval`, `felix.memoryusage.dump.location`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoP`
--
UPDATE `orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoP` SET `felix.memoryusage.dump.threshold` = ?, `felix.memoryusage.dump.interval` = ?, `felix.memoryusage.dump.location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoP`
--
DELETE FROM `orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoP` WHERE 0;

