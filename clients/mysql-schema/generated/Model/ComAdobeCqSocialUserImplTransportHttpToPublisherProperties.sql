--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialUserImplTransportHttpToPublisherProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialUserImplTransportHttpToPublisherProperties`
--
SELECT `enable`, `agent.configuration`, `context.path`, `disabled.cipher.suites`, `enabled.cipher.suites` FROM `comAdobeCqSocialUserImplTransportHttpToPublisherProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialUserImplTransportHttpToPublisherProperties`
--
INSERT INTO `comAdobeCqSocialUserImplTransportHttpToPublisherProperties`(`enable`, `agent.configuration`, `context.path`, `disabled.cipher.suites`, `enabled.cipher.suites`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialUserImplTransportHttpToPublisherProperties`
--
UPDATE `comAdobeCqSocialUserImplTransportHttpToPublisherProperties` SET `enable` = ?, `agent.configuration` = ?, `context.path` = ?, `disabled.cipher.suites` = ?, `enabled.cipher.suites` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialUserImplTransportHttpToPublisherProperties`
--
DELETE FROM `comAdobeCqSocialUserImplTransportHttpToPublisherProperties` WHERE 0;

