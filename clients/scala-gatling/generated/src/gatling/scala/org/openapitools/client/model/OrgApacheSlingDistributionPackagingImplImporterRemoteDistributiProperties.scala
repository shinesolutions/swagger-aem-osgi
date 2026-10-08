
package org.openapitools.client.model


case class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties (
    _name: Option[ConfigNodePropertyString],
    _endpoints: Option[ConfigNodePropertyArray],
    _transportSecretProviderTarget: Option[ConfigNodePropertyString]
)
object OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties {
    def toStringBody(var_name: Object, var_endpoints: Object, var_transportSecretProviderTarget: Object) =
        s"""
        | {
        | "name":$var_name,"endpoints":$var_endpoints,"transportSecretProviderTarget":$var_transportSecretProviderTarget
        | }
        """.stripMargin
}
