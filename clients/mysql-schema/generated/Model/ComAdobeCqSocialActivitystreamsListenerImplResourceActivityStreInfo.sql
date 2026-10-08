--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreI`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreI` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreI`
--
INSERT INTO `comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreI`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreI`
--
UPDATE `comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreI` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreI`
--
DELETE FROM `comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreI` WHERE 0;

