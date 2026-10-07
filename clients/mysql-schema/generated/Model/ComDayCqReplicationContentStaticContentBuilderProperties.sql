--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReplicationContentStaticContentBuilderProperties' definition.
--


--
-- SELECT template for table `comDayCqReplicationContentStaticContentBuilderProperties`
--
SELECT `host`, `port` FROM `comDayCqReplicationContentStaticContentBuilderProperties` WHERE 1;

--
-- INSERT template for table `comDayCqReplicationContentStaticContentBuilderProperties`
--
INSERT INTO `comDayCqReplicationContentStaticContentBuilderProperties`(`host`, `port`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqReplicationContentStaticContentBuilderProperties`
--
UPDATE `comDayCqReplicationContentStaticContentBuilderProperties` SET `host` = ?, `port` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReplicationContentStaticContentBuilderProperties`
--
DELETE FROM `comDayCqReplicationContentStaticContentBuilderProperties` WHERE 0;

