--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPr`
--
SELECT `cq.social.console.analytics.sites.mapping`, `priority` FROM `comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPr` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPr`
--
INSERT INTO `comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPr`(`cq.social.console.analytics.sites.mapping`, `priority`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPr`
--
UPDATE `comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPr` SET `cq.social.console.analytics.sites.mapping` = ?, `priority` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPr`
--
DELETE FROM `comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPr` WHERE 0;

