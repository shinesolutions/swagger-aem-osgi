--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqCommercePimImplPageEventListenerInfo' definition.
--


--
-- SELECT template for table `comAdobeCqCommercePimImplPageEventListenerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqCommercePimImplPageEventListenerInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqCommercePimImplPageEventListenerInfo`
--
INSERT INTO `comAdobeCqCommercePimImplPageEventListenerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqCommercePimImplPageEventListenerInfo`
--
UPDATE `comAdobeCqCommercePimImplPageEventListenerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqCommercePimImplPageEventListenerInfo`
--
DELETE FROM `comAdobeCqCommercePimImplPageEventListenerInfo` WHERE 0;

