package org.openapitools.server.model


/**
 * @param aemMcmCampaignFormConstraints  for example: ''null''
 * @param aemMcmCampaignPublicUrl  for example: ''null''
 * @param aemMcmCampaignRelaxedSSL  for example: ''null''
*/
final case class ComDayCqMcmCampaignImplIntegrationConfigImplProperties (
  aemMcmCampaignFormConstraints: Option[ConfigNodePropertyArray] = None,
  aemMcmCampaignPublicUrl: Option[ConfigNodePropertyString] = None,
  aemMcmCampaignRelaxedSSL: Option[ConfigNodePropertyBoolean] = None
)

