--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderP`
--
SELECT `replyEmailPatterns`, `priorityOrder` FROM `comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderP` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderP`
--
INSERT INTO `comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderP`(`replyEmailPatterns`, `priorityOrder`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderP`
--
UPDATE `comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderP` SET `replyEmailPatterns` = ?, `priorityOrder` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderP`
--
DELETE FROM `comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderP` WHERE 0;

