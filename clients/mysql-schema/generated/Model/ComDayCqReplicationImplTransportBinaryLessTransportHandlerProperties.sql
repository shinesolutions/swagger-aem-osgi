--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties' definition.
--


--
-- SELECT template for table `comDayCqReplicationImplTransportBinaryLessTransportHandlerProper`
--
SELECT `disabled.cipher.suites`, `enabled.cipher.suites` FROM `comDayCqReplicationImplTransportBinaryLessTransportHandlerProper` WHERE 1;

--
-- INSERT template for table `comDayCqReplicationImplTransportBinaryLessTransportHandlerProper`
--
INSERT INTO `comDayCqReplicationImplTransportBinaryLessTransportHandlerProper`(`disabled.cipher.suites`, `enabled.cipher.suites`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqReplicationImplTransportBinaryLessTransportHandlerProper`
--
UPDATE `comDayCqReplicationImplTransportBinaryLessTransportHandlerProper` SET `disabled.cipher.suites` = ?, `enabled.cipher.suites` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReplicationImplTransportBinaryLessTransportHandlerProper`
--
DELETE FROM `comDayCqReplicationImplTransportBinaryLessTransportHandlerProper` WHERE 0;

