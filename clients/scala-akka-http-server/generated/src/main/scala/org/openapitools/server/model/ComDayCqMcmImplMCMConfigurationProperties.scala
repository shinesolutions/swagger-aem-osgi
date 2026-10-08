package org.openapitools.server.model


/**
 * @param experienceIndirection  for example: ''null''
 * @param touchpointIndirection  for example: ''null''
*/
final case class ComDayCqMcmImplMCMConfigurationProperties (
  experienceIndirection: Option[ConfigNodePropertyArray] = None,
  touchpointIndirection: Option[ConfigNodePropertyArray] = None
)

