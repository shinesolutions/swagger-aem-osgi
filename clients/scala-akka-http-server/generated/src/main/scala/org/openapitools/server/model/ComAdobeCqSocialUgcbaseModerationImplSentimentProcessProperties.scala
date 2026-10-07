package org.openapitools.server.model


/**
 * @param watchwordsPositive  for example: ''null''
 * @param watchwordsNegative  for example: ''null''
 * @param watchwordsPath  for example: ''null''
 * @param sentimentPath  for example: ''null''
*/
final case class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties (
  watchwordsPositive: Option[ConfigNodePropertyArray] = None,
  watchwordsNegative: Option[ConfigNodePropertyArray] = None,
  watchwordsPath: Option[ConfigNodePropertyString] = None,
  sentimentPath: Option[ConfigNodePropertyString] = None
)

