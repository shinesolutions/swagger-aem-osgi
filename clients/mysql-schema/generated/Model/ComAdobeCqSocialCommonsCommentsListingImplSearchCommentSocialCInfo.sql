--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCIn` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCIn`
--
INSERT INTO `comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCIn`
--
UPDATE `comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCIn`
--
DELETE FROM `comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCIn` WHERE 0;

