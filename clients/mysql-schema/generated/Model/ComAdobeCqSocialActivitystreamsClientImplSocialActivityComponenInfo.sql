--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenI`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenI` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenI`
--
INSERT INTO `comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenI`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenI`
--
UPDATE `comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenI` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenI`
--
DELETE FROM `comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenI` WHERE 0;

