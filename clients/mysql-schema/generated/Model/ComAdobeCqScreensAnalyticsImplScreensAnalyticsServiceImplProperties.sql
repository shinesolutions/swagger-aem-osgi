--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropert`
--
SELECT `com.adobe.cq.screens.analytics.impl.url`, `com.adobe.cq.screens.analytics.impl.apikey`, `com.adobe.cq.screens.analytics.impl.project`, `com.adobe.cq.screens.analytics.impl.environment`, `com.adobe.cq.screens.analytics.impl.sendFrequency` FROM `comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropert` WHERE 1;

--
-- INSERT template for table `comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropert`
--
INSERT INTO `comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropert`(`com.adobe.cq.screens.analytics.impl.url`, `com.adobe.cq.screens.analytics.impl.apikey`, `com.adobe.cq.screens.analytics.impl.project`, `com.adobe.cq.screens.analytics.impl.environment`, `com.adobe.cq.screens.analytics.impl.sendFrequency`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropert`
--
UPDATE `comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropert` SET `com.adobe.cq.screens.analytics.impl.url` = ?, `com.adobe.cq.screens.analytics.impl.apikey` = ?, `com.adobe.cq.screens.analytics.impl.project` = ?, `com.adobe.cq.screens.analytics.impl.environment` = ?, `com.adobe.cq.screens.analytics.impl.sendFrequency` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropert`
--
DELETE FROM `comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropert` WHERE 0;

