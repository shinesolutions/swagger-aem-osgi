--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySP`
--
SELECT `ranking`, `enable` FROM `comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySP` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySP`
--
INSERT INTO `comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySP`(`ranking`, `enable`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySP`
--
UPDATE `comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySP` SET `ranking` = ?, `enable` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySP`
--
DELETE FROM `comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySP` WHERE 0;

