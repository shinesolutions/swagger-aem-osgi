--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties`
--
SELECT `cors.enabling` FROM `comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties`
--
INSERT INTO `comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties`(`cors.enabling`) VALUES (?);

--
-- UPDATE template for table `comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties`
--
UPDATE `comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties` SET `cors.enabling` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties`
--
DELETE FROM `comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties` WHERE 0;

