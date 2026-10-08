--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo' definition.
--


--
-- SELECT template for table `comAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo`
--
INSERT INTO `comAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo`
--
UPDATE `comAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo`
--
DELETE FROM `comAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo` WHERE 0;

