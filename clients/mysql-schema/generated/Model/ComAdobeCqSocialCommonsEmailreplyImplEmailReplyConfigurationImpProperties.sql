--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpP`
--
SELECT `email.name`, `email.createPostFromReply`, `email.addCommentIdTo`, `email.subjectMaximumLength`, `email.replyToAddress`, `email.replyToDelimiter`, `email.trackerIdPrefixInSubject`, `email.trackerIdPrefixInBody`, `email.asHTML`, `email.defaultUserName`, `email.templates.rootPath` FROM `comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpP` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpP`
--
INSERT INTO `comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpP`(`email.name`, `email.createPostFromReply`, `email.addCommentIdTo`, `email.subjectMaximumLength`, `email.replyToAddress`, `email.replyToDelimiter`, `email.trackerIdPrefixInSubject`, `email.trackerIdPrefixInBody`, `email.asHTML`, `email.defaultUserName`, `email.templates.rootPath`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpP`
--
UPDATE `comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpP` SET `email.name` = ?, `email.createPostFromReply` = ?, `email.addCommentIdTo` = ?, `email.subjectMaximumLength` = ?, `email.replyToAddress` = ?, `email.replyToDelimiter` = ?, `email.trackerIdPrefixInSubject` = ?, `email.trackerIdPrefixInBody` = ?, `email.asHTML` = ?, `email.defaultUserName` = ?, `email.templates.rootPath` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpP`
--
DELETE FROM `comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpP` WHERE 0;

