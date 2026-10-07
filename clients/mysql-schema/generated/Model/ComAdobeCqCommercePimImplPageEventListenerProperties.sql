--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqCommercePimImplPageEventListenerProperties' definition.
--


--
-- SELECT template for table `comAdobeCqCommercePimImplPageEventListenerProperties`
--
SELECT `cq.commerce.pageeventlistener.enabled` FROM `comAdobeCqCommercePimImplPageEventListenerProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqCommercePimImplPageEventListenerProperties`
--
INSERT INTO `comAdobeCqCommercePimImplPageEventListenerProperties`(`cq.commerce.pageeventlistener.enabled`) VALUES (?);

--
-- UPDATE template for table `comAdobeCqCommercePimImplPageEventListenerProperties`
--
UPDATE `comAdobeCqCommercePimImplPageEventListenerProperties` SET `cq.commerce.pageeventlistener.enabled` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqCommercePimImplPageEventListenerProperties`
--
DELETE FROM `comAdobeCqCommercePimImplPageEventListenerProperties` WHERE 0;

