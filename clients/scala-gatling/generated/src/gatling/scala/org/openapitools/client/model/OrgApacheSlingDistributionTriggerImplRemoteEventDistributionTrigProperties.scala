
package org.openapitools.client.model


case class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties (
    _name: Option[ConfigNodePropertyString],
    _endpoint: Option[ConfigNodePropertyString],
    _transportSecretProviderTarget: Option[ConfigNodePropertyString]
)
object OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties {
    def toStringBody(var_name: Object, var_endpoint: Object, var_transportSecretProviderTarget: Object) =
        s"""
        | {
        | "name":$var_name,"endpoint":$var_endpoint,"transportSecretProviderTarget":$var_transportSecretProviderTarget
        | }
        """.stripMargin
}
