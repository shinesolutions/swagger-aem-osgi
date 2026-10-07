--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqSearchImplBuilderQueryBuilderImplInfo' definition.
--


--
-- SELECT template for table `comDayCqSearchImplBuilderQueryBuilderImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqSearchImplBuilderQueryBuilderImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqSearchImplBuilderQueryBuilderImplInfo`
--
INSERT INTO `comDayCqSearchImplBuilderQueryBuilderImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqSearchImplBuilderQueryBuilderImplInfo`
--
UPDATE `comDayCqSearchImplBuilderQueryBuilderImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqSearchImplBuilderQueryBuilderImplInfo`
--
DELETE FROM `comDayCqSearchImplBuilderQueryBuilderImplInfo` WHERE 0;

