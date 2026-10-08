--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDtmReactorImplServiceWebServiceImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqDtmReactorImplServiceWebServiceImplProperties`
--
SELECT `endpointUri`, `connectionTimeout`, `socketTimeout` FROM `comAdobeCqDtmReactorImplServiceWebServiceImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqDtmReactorImplServiceWebServiceImplProperties`
--
INSERT INTO `comAdobeCqDtmReactorImplServiceWebServiceImplProperties`(`endpointUri`, `connectionTimeout`, `socketTimeout`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeCqDtmReactorImplServiceWebServiceImplProperties`
--
UPDATE `comAdobeCqDtmReactorImplServiceWebServiceImplProperties` SET `endpointUri` = ?, `connectionTimeout` = ?, `socketTimeout` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDtmReactorImplServiceWebServiceImplProperties`
--
DELETE FROM `comAdobeCqDtmReactorImplServiceWebServiceImplProperties` WHERE 0;

