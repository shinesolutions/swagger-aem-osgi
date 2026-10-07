--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeAemTransactionCoreImplTransactionRecorderProperties' definition.
--


--
-- SELECT template for table `comAdobeAemTransactionCoreImplTransactionRecorderProperties`
--
SELECT `isTransactionRecordingEnabled` FROM `comAdobeAemTransactionCoreImplTransactionRecorderProperties` WHERE 1;

--
-- INSERT template for table `comAdobeAemTransactionCoreImplTransactionRecorderProperties`
--
INSERT INTO `comAdobeAemTransactionCoreImplTransactionRecorderProperties`(`isTransactionRecordingEnabled`) VALUES (?);

--
-- UPDATE template for table `comAdobeAemTransactionCoreImplTransactionRecorderProperties`
--
UPDATE `comAdobeAemTransactionCoreImplTransactionRecorderProperties` SET `isTransactionRecordingEnabled` = ? WHERE 1;

--
-- DELETE template for table `comAdobeAemTransactionCoreImplTransactionRecorderProperties`
--
DELETE FROM `comAdobeAemTransactionCoreImplTransactionRecorderProperties` WHERE 0;

