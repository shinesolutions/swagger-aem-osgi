--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqMailerImplEmailCqEmailTemplateFactoryInfo' definition.
--


--
-- SELECT template for table `comDayCqMailerImplEmailCqEmailTemplateFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqMailerImplEmailCqEmailTemplateFactoryInfo` WHERE 1;

--
-- INSERT template for table `comDayCqMailerImplEmailCqEmailTemplateFactoryInfo`
--
INSERT INTO `comDayCqMailerImplEmailCqEmailTemplateFactoryInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqMailerImplEmailCqEmailTemplateFactoryInfo`
--
UPDATE `comDayCqMailerImplEmailCqEmailTemplateFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqMailerImplEmailCqEmailTemplateFactoryInfo`
--
DELETE FROM `comDayCqMailerImplEmailCqEmailTemplateFactoryInfo` WHERE 0;

