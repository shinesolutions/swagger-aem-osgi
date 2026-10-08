--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpP`
--
SELECT `pattern.time`, `pattern.newline`, `pattern.dayOfMonth`, `pattern.month`, `pattern.year`, `pattern.date`, `pattern.dateTime`, `pattern.email` FROM `comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpP` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpP`
--
INSERT INTO `comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpP`(`pattern.time`, `pattern.newline`, `pattern.dayOfMonth`, `pattern.month`, `pattern.year`, `pattern.date`, `pattern.dateTime`, `pattern.email`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpP`
--
UPDATE `comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpP` SET `pattern.time` = ?, `pattern.newline` = ?, `pattern.dayOfMonth` = ?, `pattern.month` = ?, `pattern.year` = ?, `pattern.date` = ?, `pattern.dateTime` = ?, `pattern.email` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpP`
--
DELETE FROM `comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpP` WHERE 0;

