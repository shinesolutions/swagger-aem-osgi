--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties' definition.
--


--
-- SELECT template for table `comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties`
--
SELECT `mailer.email.embed`, `mailer.email.charset`, `mailer.email.retrieverUserID`, `mailer.email.retrieverUserPWD` FROM `comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties` WHERE 1;

--
-- INSERT template for table `comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties`
--
INSERT INTO `comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties`(`mailer.email.embed`, `mailer.email.charset`, `mailer.email.retrieverUserID`, `mailer.email.retrieverUserPWD`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties`
--
UPDATE `comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties` SET `mailer.email.embed` = ?, `mailer.email.charset` = ?, `mailer.email.retrieverUserID` = ?, `mailer.email.retrieverUserPWD` = ? WHERE 1;

--
-- DELETE template for table `comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties`
--
DELETE FROM `comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties` WHERE 0;

