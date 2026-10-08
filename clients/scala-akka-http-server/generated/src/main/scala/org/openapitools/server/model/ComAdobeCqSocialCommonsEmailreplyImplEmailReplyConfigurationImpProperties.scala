package org.openapitools.server.model


/**
 * @param emailName  for example: ''null''
 * @param emailCreatePostFromReply  for example: ''null''
 * @param emailAddCommentIdTo  for example: ''null''
 * @param emailSubjectMaximumLength  for example: ''null''
 * @param emailReplyToAddress  for example: ''null''
 * @param emailReplyToDelimiter  for example: ''null''
 * @param emailTrackerIdPrefixInSubject  for example: ''null''
 * @param emailTrackerIdPrefixInBody  for example: ''null''
 * @param emailAsHTML  for example: ''null''
 * @param emailDefaultUserName  for example: ''null''
 * @param emailTemplatesRootPath  for example: ''null''
*/
final case class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties (
  emailName: Option[ConfigNodePropertyString] = None,
  emailCreatePostFromReply: Option[ConfigNodePropertyBoolean] = None,
  emailAddCommentIdTo: Option[ConfigNodePropertyDropDown] = None,
  emailSubjectMaximumLength: Option[ConfigNodePropertyInteger] = None,
  emailReplyToAddress: Option[ConfigNodePropertyString] = None,
  emailReplyToDelimiter: Option[ConfigNodePropertyString] = None,
  emailTrackerIdPrefixInSubject: Option[ConfigNodePropertyString] = None,
  emailTrackerIdPrefixInBody: Option[ConfigNodePropertyString] = None,
  emailAsHTML: Option[ConfigNodePropertyBoolean] = None,
  emailDefaultUserName: Option[ConfigNodePropertyString] = None,
  emailTemplatesRootPath: Option[ConfigNodePropertyString] = None
)

