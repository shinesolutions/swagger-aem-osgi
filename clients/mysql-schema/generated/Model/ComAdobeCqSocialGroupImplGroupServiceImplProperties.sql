--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialGroupImplGroupServiceImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialGroupImplGroupServiceImplProperties`
--
SELECT `maxWaitTime`, `minWaitBetweenRetries` FROM `comAdobeCqSocialGroupImplGroupServiceImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialGroupImplGroupServiceImplProperties`
--
INSERT INTO `comAdobeCqSocialGroupImplGroupServiceImplProperties`(`maxWaitTime`, `minWaitBetweenRetries`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialGroupImplGroupServiceImplProperties`
--
UPDATE `comAdobeCqSocialGroupImplGroupServiceImplProperties` SET `maxWaitTime` = ?, `minWaitBetweenRetries` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialGroupImplGroupServiceImplProperties`
--
DELETE FROM `comAdobeCqSocialGroupImplGroupServiceImplProperties` WHERE 0;

