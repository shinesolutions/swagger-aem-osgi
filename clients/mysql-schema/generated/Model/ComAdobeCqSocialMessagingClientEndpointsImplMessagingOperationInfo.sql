--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationIn` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationIn`
--
INSERT INTO `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationIn`
--
UPDATE `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationIn`
--
DELETE FROM `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationIn` WHERE 0;

