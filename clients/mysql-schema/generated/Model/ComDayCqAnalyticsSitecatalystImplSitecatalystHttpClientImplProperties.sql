--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties' definition.
--


--
-- SELECT template for table `comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPrope`
--
SELECT `cq.analytics.sitecatalyst.service.datacenter.url`, `devhostnamepatterns`, `connection.timeout`, `socket.timeout` FROM `comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPrope` WHERE 1;

--
-- INSERT template for table `comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPrope`
--
INSERT INTO `comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPrope`(`cq.analytics.sitecatalyst.service.datacenter.url`, `devhostnamepatterns`, `connection.timeout`, `socket.timeout`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPrope`
--
UPDATE `comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPrope` SET `cq.analytics.sitecatalyst.service.datacenter.url` = ?, `devhostnamepatterns` = ?, `connection.timeout` = ?, `socket.timeout` = ? WHERE 1;

--
-- DELETE template for table `comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPrope`
--
DELETE FROM `comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPrope` WHERE 0;

