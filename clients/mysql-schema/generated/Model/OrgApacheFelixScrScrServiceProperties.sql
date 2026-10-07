--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixScrScrServiceProperties' definition.
--


--
-- SELECT template for table `orgApacheFelixScrScrServiceProperties`
--
SELECT `ds.loglevel`, `ds.factory.enabled`, `ds.delayed.keepInstances`, `ds.lock.timeout.milliseconds`, `ds.stop.timeout.milliseconds`, `ds.global.extender` FROM `orgApacheFelixScrScrServiceProperties` WHERE 1;

--
-- INSERT template for table `orgApacheFelixScrScrServiceProperties`
--
INSERT INTO `orgApacheFelixScrScrServiceProperties`(`ds.loglevel`, `ds.factory.enabled`, `ds.delayed.keepInstances`, `ds.lock.timeout.milliseconds`, `ds.stop.timeout.milliseconds`, `ds.global.extender`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheFelixScrScrServiceProperties`
--
UPDATE `orgApacheFelixScrScrServiceProperties` SET `ds.loglevel` = ?, `ds.factory.enabled` = ?, `ds.delayed.keepInstances` = ?, `ds.lock.timeout.milliseconds` = ?, `ds.stop.timeout.milliseconds` = ?, `ds.global.extender` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixScrScrServiceProperties`
--
DELETE FROM `orgApacheFelixScrScrServiceProperties` WHERE 0;

