--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo' definition.
--


--
-- SELECT template for table `comDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo` WHERE 1;

--
-- INSERT template for table `comDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo`
--
INSERT INTO `comDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo`
--
UPDATE `comDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo`
--
DELETE FROM `comDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo` WHERE 0;

