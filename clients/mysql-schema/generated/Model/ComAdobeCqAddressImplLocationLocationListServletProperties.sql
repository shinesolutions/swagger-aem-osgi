--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqAddressImplLocationLocationListServletProperties' definition.
--


--
-- SELECT template for table `comAdobeCqAddressImplLocationLocationListServletProperties`
--
SELECT `cq.address.location.default.maxResults` FROM `comAdobeCqAddressImplLocationLocationListServletProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqAddressImplLocationLocationListServletProperties`
--
INSERT INTO `comAdobeCqAddressImplLocationLocationListServletProperties`(`cq.address.location.default.maxResults`) VALUES (?);

--
-- UPDATE template for table `comAdobeCqAddressImplLocationLocationListServletProperties`
--
UPDATE `comAdobeCqAddressImplLocationLocationListServletProperties` SET `cq.address.location.default.maxResults` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqAddressImplLocationLocationListServletProperties`
--
DELETE FROM `comAdobeCqAddressImplLocationLocationListServletProperties` WHERE 0;

