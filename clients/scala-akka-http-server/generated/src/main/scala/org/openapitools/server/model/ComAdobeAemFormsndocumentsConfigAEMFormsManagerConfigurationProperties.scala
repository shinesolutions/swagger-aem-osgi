package org.openapitools.server.model


/**
 * @param formsManagerConfigIncludeOOTBTemplates  for example: ''null''
 * @param formsManagerConfigIncludeDeprecatedTemplates  for example: ''null''
*/
final case class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties (
  formsManagerConfigIncludeOOTBTemplates: Option[ConfigNodePropertyBoolean] = None,
  formsManagerConfigIncludeDeprecatedTemplates: Option[ConfigNodePropertyBoolean] = None
)

