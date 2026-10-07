
package org.openapitools.client.model


case class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties (
    _communitiesIntegrationLivefyreSlingEventFilter: Option[ConfigNodePropertyString]
)
object ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties {
    def toStringBody(var_communitiesIntegrationLivefyreSlingEventFilter: Object) =
        s"""
        | {
        | "communitiesIntegrationLivefyreSlingEventFilter":$var_communitiesIntegrationLivefyreSlingEventFilter
        | }
        """.stripMargin
}
