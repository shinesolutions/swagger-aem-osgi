--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderPr`
--
SELECT `priorityOrder`, `replyEmailPatterns` FROM `comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderPr` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderPr`
--
INSERT INTO `comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderPr`(`priorityOrder`, `replyEmailPatterns`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderPr`
--
UPDATE `comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderPr` SET `priorityOrder` = ?, `replyEmailPatterns` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderPr`
--
DELETE FROM `comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderPr` WHERE 0;

