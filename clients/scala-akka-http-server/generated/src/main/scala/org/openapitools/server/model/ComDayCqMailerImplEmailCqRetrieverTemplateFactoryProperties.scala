package org.openapitools.server.model


/**
 * @param mailerEmailEmbed  for example: ''null''
 * @param mailerEmailCharset  for example: ''null''
 * @param mailerEmailRetrieverUserID  for example: ''null''
 * @param mailerEmailRetrieverUserPWD  for example: ''null''
*/
final case class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties (
  mailerEmailEmbed: Option[ConfigNodePropertyBoolean] = None,
  mailerEmailCharset: Option[ConfigNodePropertyString] = None,
  mailerEmailRetrieverUserID: Option[ConfigNodePropertyString] = None,
  mailerEmailRetrieverUserPWD: Option[ConfigNodePropertyString] = None
)

