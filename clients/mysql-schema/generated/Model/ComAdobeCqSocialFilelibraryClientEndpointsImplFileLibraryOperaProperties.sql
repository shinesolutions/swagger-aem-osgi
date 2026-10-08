--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPr`
--
SELECT `fieldWhitelist`, `attachmentTypeBlacklist` FROM `comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPr` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPr`
--
INSERT INTO `comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPr`(`fieldWhitelist`, `attachmentTypeBlacklist`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPr`
--
UPDATE `comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPr` SET `fieldWhitelist` = ?, `attachmentTypeBlacklist` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPr`
--
DELETE FROM `comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPr` WHERE 0;

