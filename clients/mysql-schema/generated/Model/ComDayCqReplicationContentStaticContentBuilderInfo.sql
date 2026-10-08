--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReplicationContentStaticContentBuilderInfo' definition.
--


--
-- SELECT template for table `comDayCqReplicationContentStaticContentBuilderInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqReplicationContentStaticContentBuilderInfo` WHERE 1;

--
-- INSERT template for table `comDayCqReplicationContentStaticContentBuilderInfo`
--
INSERT INTO `comDayCqReplicationContentStaticContentBuilderInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqReplicationContentStaticContentBuilderInfo`
--
UPDATE `comDayCqReplicationContentStaticContentBuilderInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReplicationContentStaticContentBuilderInfo`
--
DELETE FROM `comDayCqReplicationContentStaticContentBuilderInfo` WHERE 0;

