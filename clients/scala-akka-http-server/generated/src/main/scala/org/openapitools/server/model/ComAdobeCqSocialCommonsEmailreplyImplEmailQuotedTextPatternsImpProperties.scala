package org.openapitools.server.model


/**
 * @param patternTime  for example: ''null''
 * @param patternNewline  for example: ''null''
 * @param patternDayOfMonth  for example: ''null''
 * @param patternMonth  for example: ''null''
 * @param patternYear  for example: ''null''
 * @param patternDate  for example: ''null''
 * @param patternDateTime  for example: ''null''
 * @param patternEmail  for example: ''null''
*/
final case class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties (
  patternTime: Option[ConfigNodePropertyString] = None,
  patternNewline: Option[ConfigNodePropertyString] = None,
  patternDayOfMonth: Option[ConfigNodePropertyString] = None,
  patternMonth: Option[ConfigNodePropertyString] = None,
  patternYear: Option[ConfigNodePropertyString] = None,
  patternDate: Option[ConfigNodePropertyString] = None,
  patternDateTime: Option[ConfigNodePropertyString] = None,
  patternEmail: Option[ConfigNodePropertyString] = None
)

