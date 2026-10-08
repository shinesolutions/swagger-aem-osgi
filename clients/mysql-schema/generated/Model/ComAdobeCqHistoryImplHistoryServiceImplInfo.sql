--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqHistoryImplHistoryServiceImplInfo' definition.
--


--
-- SELECT template for table `comAdobeCqHistoryImplHistoryServiceImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location` FROM `comAdobeCqHistoryImplHistoryServiceImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqHistoryImplHistoryServiceImplInfo`
--
INSERT INTO `comAdobeCqHistoryImplHistoryServiceImplInfo`(`pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqHistoryImplHistoryServiceImplInfo`
--
UPDATE `comAdobeCqHistoryImplHistoryServiceImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `additionalProperties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqHistoryImplHistoryServiceImplInfo`
--
DELETE FROM `comAdobeCqHistoryImplHistoryServiceImplInfo` WHERE 0;

