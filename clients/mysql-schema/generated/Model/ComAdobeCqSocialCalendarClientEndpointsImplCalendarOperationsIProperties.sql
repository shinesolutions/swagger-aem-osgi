--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPr`
--
SELECT `MaxRetry`, `fieldWhitelist`, `attachmentTypeBlacklist` FROM `comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPr` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPr`
--
INSERT INTO `comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPr`(`MaxRetry`, `fieldWhitelist`, `attachmentTypeBlacklist`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPr`
--
UPDATE `comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPr` SET `MaxRetry` = ?, `fieldWhitelist` = ?, `attachmentTypeBlacklist` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPr`
--
DELETE FROM `comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPr` WHERE 0;

