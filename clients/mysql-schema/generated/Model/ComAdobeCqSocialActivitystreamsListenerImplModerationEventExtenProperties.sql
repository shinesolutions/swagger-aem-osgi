--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenP`
--
SELECT `accepted`, `ranked` FROM `comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenP` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenP`
--
INSERT INTO `comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenP`(`accepted`, `ranked`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenP`
--
UPDATE `comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenP` SET `accepted` = ?, `ranked` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenP`
--
DELETE FROM `comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenP` WHERE 0;

