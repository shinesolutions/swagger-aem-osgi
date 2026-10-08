--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerIn` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerIn`
--
INSERT INTO `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerIn`
--
UPDATE `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerIn`
--
DELETE FROM `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerIn` WHERE 0;

