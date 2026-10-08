--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqHistoryImplHistoryRequestFilterProperties' definition.
--


--
-- SELECT template for table `comAdobeCqHistoryImplHistoryRequestFilterProperties`
--
SELECT `history.requestFilter.excludedSelectors`, `history.requestFilter.excludedExtensions` FROM `comAdobeCqHistoryImplHistoryRequestFilterProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqHistoryImplHistoryRequestFilterProperties`
--
INSERT INTO `comAdobeCqHistoryImplHistoryRequestFilterProperties`(`history.requestFilter.excludedSelectors`, `history.requestFilter.excludedExtensions`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqHistoryImplHistoryRequestFilterProperties`
--
UPDATE `comAdobeCqHistoryImplHistoryRequestFilterProperties` SET `history.requestFilter.excludedSelectors` = ?, `history.requestFilter.excludedExtensions` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqHistoryImplHistoryRequestFilterProperties`
--
DELETE FROM `comAdobeCqHistoryImplHistoryRequestFilterProperties` WHERE 0;

