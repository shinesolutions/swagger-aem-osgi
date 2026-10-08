--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReportingImplConfigServiceImplProperties' definition.
--


--
-- SELECT template for table `comDayCqReportingImplConfigServiceImplProperties`
--
SELECT `repconf.timezone`, `repconf.locale`, `repconf.snapshots`, `repconf.repdir`, `repconf.hourofday`, `repconf.minofhour`, `repconf.maxrows`, `repconf.fakedata`, `repconf.snapshotuser`, `repconf.enforcesnapshotuser` FROM `comDayCqReportingImplConfigServiceImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqReportingImplConfigServiceImplProperties`
--
INSERT INTO `comDayCqReportingImplConfigServiceImplProperties`(`repconf.timezone`, `repconf.locale`, `repconf.snapshots`, `repconf.repdir`, `repconf.hourofday`, `repconf.minofhour`, `repconf.maxrows`, `repconf.fakedata`, `repconf.snapshotuser`, `repconf.enforcesnapshotuser`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqReportingImplConfigServiceImplProperties`
--
UPDATE `comDayCqReportingImplConfigServiceImplProperties` SET `repconf.timezone` = ?, `repconf.locale` = ?, `repconf.snapshots` = ?, `repconf.repdir` = ?, `repconf.hourofday` = ?, `repconf.minofhour` = ?, `repconf.maxrows` = ?, `repconf.fakedata` = ?, `repconf.snapshotuser` = ?, `repconf.enforcesnapshotuser` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReportingImplConfigServiceImplProperties`
--
DELETE FROM `comDayCqReportingImplConfigServiceImplProperties` WHERE 0;

