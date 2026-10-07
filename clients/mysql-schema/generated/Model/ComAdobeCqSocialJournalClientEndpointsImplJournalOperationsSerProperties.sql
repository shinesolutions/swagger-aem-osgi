--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPr`
--
SELECT `fieldWhitelist`, `attachmentTypeBlacklist` FROM `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPr` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPr`
--
INSERT INTO `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPr`(`fieldWhitelist`, `attachmentTypeBlacklist`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPr`
--
UPDATE `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPr` SET `fieldWhitelist` = ?, `attachmentTypeBlacklist` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPr`
--
DELETE FROM `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPr` WHERE 0;

