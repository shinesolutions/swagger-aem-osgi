--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeAemTransactionCoreImplTransactionRecorderInfo' definition.
--


--
-- SELECT template for table `comAdobeAemTransactionCoreImplTransactionRecorderInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeAemTransactionCoreImplTransactionRecorderInfo` WHERE 1;

--
-- INSERT template for table `comAdobeAemTransactionCoreImplTransactionRecorderInfo`
--
INSERT INTO `comAdobeAemTransactionCoreImplTransactionRecorderInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeAemTransactionCoreImplTransactionRecorderInfo`
--
UPDATE `comAdobeAemTransactionCoreImplTransactionRecorderInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeAemTransactionCoreImplTransactionRecorderInfo`
--
DELETE FROM `comAdobeAemTransactionCoreImplTransactionRecorderInfo` WHERE 0;

