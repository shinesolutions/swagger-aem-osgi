--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDtmImplServiceDTMWebServiceImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqDtmImplServiceDTMWebServiceImplProperties`
--
SELECT `connection.timeout`, `socket.timeout` FROM `comAdobeCqDtmImplServiceDTMWebServiceImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqDtmImplServiceDTMWebServiceImplProperties`
--
INSERT INTO `comAdobeCqDtmImplServiceDTMWebServiceImplProperties`(`connection.timeout`, `socket.timeout`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqDtmImplServiceDTMWebServiceImplProperties`
--
UPDATE `comAdobeCqDtmImplServiceDTMWebServiceImplProperties` SET `connection.timeout` = ?, `socket.timeout` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDtmImplServiceDTMWebServiceImplProperties`
--
DELETE FROM `comAdobeCqDtmImplServiceDTMWebServiceImplProperties` WHERE 0;

