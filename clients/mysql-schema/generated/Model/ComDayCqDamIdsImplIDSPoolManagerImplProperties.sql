--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamIdsImplIDSPoolManagerImplProperties' definition.
--


--
-- SELECT template for table `comDayCqDamIdsImplIDSPoolManagerImplProperties`
--
SELECT `max.errors.to.blacklist`, `retry.interval.to.whitelist`, `connect.timeout`, `socket.timeout`, `process.label`, `connection.use.max` FROM `comDayCqDamIdsImplIDSPoolManagerImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamIdsImplIDSPoolManagerImplProperties`
--
INSERT INTO `comDayCqDamIdsImplIDSPoolManagerImplProperties`(`max.errors.to.blacklist`, `retry.interval.to.whitelist`, `connect.timeout`, `socket.timeout`, `process.label`, `connection.use.max`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamIdsImplIDSPoolManagerImplProperties`
--
UPDATE `comDayCqDamIdsImplIDSPoolManagerImplProperties` SET `max.errors.to.blacklist` = ?, `retry.interval.to.whitelist` = ?, `connect.timeout` = ?, `socket.timeout` = ?, `process.label` = ?, `connection.use.max` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamIdsImplIDSPoolManagerImplProperties`
--
DELETE FROM `comDayCqDamIdsImplIDSPoolManagerImplProperties` WHERE 0;

