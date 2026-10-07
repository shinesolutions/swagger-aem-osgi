--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDtmImplServiceDTMWebServiceImplInfo' definition.
--


--
-- SELECT template for table `comAdobeCqDtmImplServiceDTMWebServiceImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqDtmImplServiceDTMWebServiceImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqDtmImplServiceDTMWebServiceImplInfo`
--
INSERT INTO `comAdobeCqDtmImplServiceDTMWebServiceImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqDtmImplServiceDTMWebServiceImplInfo`
--
UPDATE `comAdobeCqDtmImplServiceDTMWebServiceImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDtmImplServiceDTMWebServiceImplInfo`
--
DELETE FROM `comAdobeCqDtmImplServiceDTMWebServiceImplInfo` WHERE 0;

