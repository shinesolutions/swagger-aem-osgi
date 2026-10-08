--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteLoggingImplLogAnalyserImplProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteLoggingImplLogAnalyserImplProperties`
--
SELECT `messages.queue.size`, `logger.config`, `messages.size` FROM `comAdobeGraniteLoggingImplLogAnalyserImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteLoggingImplLogAnalyserImplProperties`
--
INSERT INTO `comAdobeGraniteLoggingImplLogAnalyserImplProperties`(`messages.queue.size`, `logger.config`, `messages.size`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteLoggingImplLogAnalyserImplProperties`
--
UPDATE `comAdobeGraniteLoggingImplLogAnalyserImplProperties` SET `messages.queue.size` = ?, `logger.config` = ?, `messages.size` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteLoggingImplLogAnalyserImplProperties`
--
DELETE FROM `comAdobeGraniteLoggingImplLogAnalyserImplProperties` WHERE 0;

