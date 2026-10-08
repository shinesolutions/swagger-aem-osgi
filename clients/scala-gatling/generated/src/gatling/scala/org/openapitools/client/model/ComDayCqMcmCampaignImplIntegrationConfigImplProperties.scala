
package org.openapitools.client.model


case class ComDayCqMcmCampaignImplIntegrationConfigImplProperties (
    _aemMcmCampaignFormConstraints: Option[ConfigNodePropertyArray],
    _aemMcmCampaignPublicUrl: Option[ConfigNodePropertyString],
    _aemMcmCampaignRelaxedSSL: Option[ConfigNodePropertyBoolean]
)
object ComDayCqMcmCampaignImplIntegrationConfigImplProperties {
    def toStringBody(var_aemMcmCampaignFormConstraints: Object, var_aemMcmCampaignPublicUrl: Object, var_aemMcmCampaignRelaxedSSL: Object) =
        s"""
        | {
        | "aemMcmCampaignFormConstraints":$var_aemMcmCampaignFormConstraints,"aemMcmCampaignPublicUrl":$var_aemMcmCampaignPublicUrl,"aemMcmCampaignRelaxedSSL":$var_aemMcmCampaignRelaxedSSL
        | }
        """.stripMargin
}
