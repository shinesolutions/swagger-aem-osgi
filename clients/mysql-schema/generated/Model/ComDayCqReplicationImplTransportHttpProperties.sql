--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReplicationImplTransportHttpProperties' definition.
--


--
-- SELECT template for table `comDayCqReplicationImplTransportHttpProperties`
--
SELECT `disabled.cipher.suites`, `enabled.cipher.suites` FROM `comDayCqReplicationImplTransportHttpProperties` WHERE 1;

--
-- INSERT template for table `comDayCqReplicationImplTransportHttpProperties`
--
INSERT INTO `comDayCqReplicationImplTransportHttpProperties`(`disabled.cipher.suites`, `enabled.cipher.suites`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqReplicationImplTransportHttpProperties`
--
UPDATE `comDayCqReplicationImplTransportHttpProperties` SET `disabled.cipher.suites` = ?, `enabled.cipher.suites` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReplicationImplTransportHttpProperties`
--
DELETE FROM `comDayCqReplicationImplTransportHttpProperties` WHERE 0;

