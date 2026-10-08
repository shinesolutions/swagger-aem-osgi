--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo`
--
SELECT `default.transport.agent-to-worker.prefix`, `default.transport.agent-to-master.prefix`, `default.transport.input.package`, `default.transport.output.package`, `default.transport.replication.synchronous`, `default.transport.contentpackage`, `offloading.transporter.default.enabled` FROM `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo`
--
INSERT INTO `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo`(`default.transport.agent-to-worker.prefix`, `default.transport.agent-to-master.prefix`, `default.transport.input.package`, `default.transport.output.package`, `default.transport.replication.synchronous`, `default.transport.contentpackage`, `offloading.transporter.default.enabled`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo`
--
UPDATE `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo` SET `default.transport.agent-to-worker.prefix` = ?, `default.transport.agent-to-master.prefix` = ?, `default.transport.input.package` = ?, `default.transport.output.package` = ?, `default.transport.replication.synchronous` = ?, `default.transport.contentpackage` = ?, `offloading.transporter.default.enabled` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo`
--
DELETE FROM `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo` WHERE 0;

