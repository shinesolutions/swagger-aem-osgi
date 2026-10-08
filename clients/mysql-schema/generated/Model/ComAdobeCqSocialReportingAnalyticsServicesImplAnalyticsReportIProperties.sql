--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPr`
--
SELECT `cq.social.reporting.analytics.polling.importer.interval`, `cq.social.reporting.analytics.polling.importer.pageSize` FROM `comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPr` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPr`
--
INSERT INTO `comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPr`(`cq.social.reporting.analytics.polling.importer.interval`, `cq.social.reporting.analytics.polling.importer.pageSize`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPr`
--
UPDATE `comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPr` SET `cq.social.reporting.analytics.polling.importer.interval` = ?, `cq.social.reporting.analytics.polling.importer.pageSize` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPr`
--
DELETE FROM `comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPr` WHERE 0;

