--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqHistoryImplHistoryServiceImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqHistoryImplHistoryServiceImplProperties`
--
SELECT `history.service.resourceTypes`, `history.service.pathFilter` FROM `comAdobeCqHistoryImplHistoryServiceImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqHistoryImplHistoryServiceImplProperties`
--
INSERT INTO `comAdobeCqHistoryImplHistoryServiceImplProperties`(`history.service.resourceTypes`, `history.service.pathFilter`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqHistoryImplHistoryServiceImplProperties`
--
UPDATE `comAdobeCqHistoryImplHistoryServiceImplProperties` SET `history.service.resourceTypes` = ?, `history.service.pathFilter` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqHistoryImplHistoryServiceImplProperties`
--
DELETE FROM `comAdobeCqHistoryImplHistoryServiceImplProperties` WHERE 0;

