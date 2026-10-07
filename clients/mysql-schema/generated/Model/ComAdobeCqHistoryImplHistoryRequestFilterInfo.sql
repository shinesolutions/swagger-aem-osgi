--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqHistoryImplHistoryRequestFilterInfo' definition.
--


--
-- SELECT template for table `comAdobeCqHistoryImplHistoryRequestFilterInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeCqHistoryImplHistoryRequestFilterInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqHistoryImplHistoryRequestFilterInfo`
--
INSERT INTO `comAdobeCqHistoryImplHistoryRequestFilterInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqHistoryImplHistoryRequestFilterInfo`
--
UPDATE `comAdobeCqHistoryImplHistoryRequestFilterInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqHistoryImplHistoryRequestFilterInfo`
--
DELETE FROM `comAdobeCqHistoryImplHistoryRequestFilterInfo` WHERE 0;

