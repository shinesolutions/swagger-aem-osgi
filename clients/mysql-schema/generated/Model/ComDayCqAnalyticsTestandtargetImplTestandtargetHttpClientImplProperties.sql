--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties' definition.
--


--
-- SELECT template for table `comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPro`
--
SELECT `cq.analytics.testandtarget.api.url`, `cq.analytics.testandtarget.timeout`, `cq.analytics.testandtarget.sockettimeout`, `cq.analytics.testandtarget.recommendations.url.replace`, `cq.analytics.testandtarget.recommendations.url.replacewith` FROM `comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPro` WHERE 1;

--
-- INSERT template for table `comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPro`
--
INSERT INTO `comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPro`(`cq.analytics.testandtarget.api.url`, `cq.analytics.testandtarget.timeout`, `cq.analytics.testandtarget.sockettimeout`, `cq.analytics.testandtarget.recommendations.url.replace`, `cq.analytics.testandtarget.recommendations.url.replacewith`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPro`
--
UPDATE `comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPro` SET `cq.analytics.testandtarget.api.url` = ?, `cq.analytics.testandtarget.timeout` = ?, `cq.analytics.testandtarget.sockettimeout` = ?, `cq.analytics.testandtarget.recommendations.url.replace` = ?, `cq.analytics.testandtarget.recommendations.url.replacewith` = ? WHERE 1;

--
-- DELETE template for table `comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPro`
--
DELETE FROM `comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPro` WHERE 0;

