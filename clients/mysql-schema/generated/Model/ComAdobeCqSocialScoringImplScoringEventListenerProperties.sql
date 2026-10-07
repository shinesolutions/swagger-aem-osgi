--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialScoringImplScoringEventListenerProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialScoringImplScoringEventListenerProperties`
--
SELECT `event.topics`, `event.filter` FROM `comAdobeCqSocialScoringImplScoringEventListenerProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialScoringImplScoringEventListenerProperties`
--
INSERT INTO `comAdobeCqSocialScoringImplScoringEventListenerProperties`(`event.topics`, `event.filter`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialScoringImplScoringEventListenerProperties`
--
UPDATE `comAdobeCqSocialScoringImplScoringEventListenerProperties` SET `event.topics` = ?, `event.filter` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialScoringImplScoringEventListenerProperties`
--
DELETE FROM `comAdobeCqSocialScoringImplScoringEventListenerProperties` WHERE 0;

