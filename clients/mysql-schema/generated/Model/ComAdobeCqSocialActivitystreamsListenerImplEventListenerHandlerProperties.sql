--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerP`
--
SELECT `event.topics`, `event.filter` FROM `comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerP` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerP`
--
INSERT INTO `comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerP`(`event.topics`, `event.filter`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerP`
--
UPDATE `comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerP` SET `event.topics` = ?, `event.filter` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerP`
--
DELETE FROM `comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerP` WHERE 0;

