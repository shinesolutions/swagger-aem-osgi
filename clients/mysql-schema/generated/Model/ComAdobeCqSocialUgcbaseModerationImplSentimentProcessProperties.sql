--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties`
--
SELECT `watchwords.positive`, `watchwords.negative`, `watchwords.path`, `sentiment.path` FROM `comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties`
--
INSERT INTO `comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties`(`watchwords.positive`, `watchwords.negative`, `watchwords.path`, `sentiment.path`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties`
--
UPDATE `comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties` SET `watchwords.positive` = ?, `watchwords.negative` = ?, `watchwords.path` = ?, `sentiment.path` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties`
--
DELETE FROM `comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties` WHERE 0;

