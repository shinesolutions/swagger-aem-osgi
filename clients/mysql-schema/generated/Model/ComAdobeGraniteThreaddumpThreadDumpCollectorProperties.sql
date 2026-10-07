--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteThreaddumpThreadDumpCollectorProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteThreaddumpThreadDumpCollectorProperties`
--
SELECT `scheduler.period`, `scheduler.runOn`, `granite.threaddump.enabled`, `granite.threaddump.dumpsPerFile`, `granite.threaddump.enableGzipCompression`, `granite.threaddump.enableDirectoriesCompression`, `granite.threaddump.enableJStack`, `granite.threaddump.maxBackupDays`, `granite.threaddump.backupCleanTrigger` FROM `comAdobeGraniteThreaddumpThreadDumpCollectorProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteThreaddumpThreadDumpCollectorProperties`
--
INSERT INTO `comAdobeGraniteThreaddumpThreadDumpCollectorProperties`(`scheduler.period`, `scheduler.runOn`, `granite.threaddump.enabled`, `granite.threaddump.dumpsPerFile`, `granite.threaddump.enableGzipCompression`, `granite.threaddump.enableDirectoriesCompression`, `granite.threaddump.enableJStack`, `granite.threaddump.maxBackupDays`, `granite.threaddump.backupCleanTrigger`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteThreaddumpThreadDumpCollectorProperties`
--
UPDATE `comAdobeGraniteThreaddumpThreadDumpCollectorProperties` SET `scheduler.period` = ?, `scheduler.runOn` = ?, `granite.threaddump.enabled` = ?, `granite.threaddump.dumpsPerFile` = ?, `granite.threaddump.enableGzipCompression` = ?, `granite.threaddump.enableDirectoriesCompression` = ?, `granite.threaddump.enableJStack` = ?, `granite.threaddump.maxBackupDays` = ?, `granite.threaddump.backupCleanTrigger` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteThreaddumpThreadDumpCollectorProperties`
--
DELETE FROM `comAdobeGraniteThreaddumpThreadDumpCollectorProperties` WHERE 0;

