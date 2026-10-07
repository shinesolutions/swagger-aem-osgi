--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCalendarServletsTimeZoneServletProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCalendarServletsTimeZoneServletProperties`
--
SELECT `timezones.expirytime` FROM `comAdobeCqSocialCalendarServletsTimeZoneServletProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCalendarServletsTimeZoneServletProperties`
--
INSERT INTO `comAdobeCqSocialCalendarServletsTimeZoneServletProperties`(`timezones.expirytime`) VALUES (?);

--
-- UPDATE template for table `comAdobeCqSocialCalendarServletsTimeZoneServletProperties`
--
UPDATE `comAdobeCqSocialCalendarServletsTimeZoneServletProperties` SET `timezones.expirytime` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCalendarServletsTimeZoneServletProperties`
--
DELETE FROM `comAdobeCqSocialCalendarServletsTimeZoneServletProperties` WHERE 0;

