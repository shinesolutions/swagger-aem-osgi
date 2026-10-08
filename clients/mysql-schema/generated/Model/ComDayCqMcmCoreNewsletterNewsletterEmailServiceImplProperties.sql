--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties' definition.
--


--
-- SELECT template for table `comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties`
--
SELECT `from.address`, `sender.host`, `max.bounce.count` FROM `comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties`
--
INSERT INTO `comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties`(`from.address`, `sender.host`, `max.bounce.count`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties`
--
UPDATE `comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties` SET `from.address` = ?, `sender.host` = ?, `max.bounce.count` = ? WHERE 1;

--
-- DELETE template for table `comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties`
--
DELETE FROM `comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties` WHERE 0;

