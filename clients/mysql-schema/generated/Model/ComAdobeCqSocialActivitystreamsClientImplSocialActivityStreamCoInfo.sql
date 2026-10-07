--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoI`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoI` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoI`
--
INSERT INTO `comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoI`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoI`
--
UPDATE `comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoI` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoI`
--
DELETE FROM `comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoI` WHERE 0;

