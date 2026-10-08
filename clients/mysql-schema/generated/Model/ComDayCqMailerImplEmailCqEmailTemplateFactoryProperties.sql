--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqMailerImplEmailCqEmailTemplateFactoryProperties' definition.
--


--
-- SELECT template for table `comDayCqMailerImplEmailCqEmailTemplateFactoryProperties`
--
SELECT `mailer.email.charset` FROM `comDayCqMailerImplEmailCqEmailTemplateFactoryProperties` WHERE 1;

--
-- INSERT template for table `comDayCqMailerImplEmailCqEmailTemplateFactoryProperties`
--
INSERT INTO `comDayCqMailerImplEmailCqEmailTemplateFactoryProperties`(`mailer.email.charset`) VALUES (?);

--
-- UPDATE template for table `comDayCqMailerImplEmailCqEmailTemplateFactoryProperties`
--
UPDATE `comDayCqMailerImplEmailCqEmailTemplateFactoryProperties` SET `mailer.email.charset` = ? WHERE 1;

--
-- DELETE template for table `comDayCqMailerImplEmailCqEmailTemplateFactoryProperties`
--
DELETE FROM `comDayCqMailerImplEmailCqEmailTemplateFactoryProperties` WHERE 0;

