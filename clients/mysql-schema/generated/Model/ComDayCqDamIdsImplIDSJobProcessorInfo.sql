--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamIdsImplIDSJobProcessorInfo' definition.
--


--
-- SELECT template for table `comDayCqDamIdsImplIDSJobProcessorInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamIdsImplIDSJobProcessorInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamIdsImplIDSJobProcessorInfo`
--
INSERT INTO `comDayCqDamIdsImplIDSJobProcessorInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamIdsImplIDSJobProcessorInfo`
--
UPDATE `comDayCqDamIdsImplIDSJobProcessorInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamIdsImplIDSJobProcessorInfo`
--
DELETE FROM `comDayCqDamIdsImplIDSJobProcessorInfo` WHERE 0;

