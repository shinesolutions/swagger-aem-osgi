
package org.openapitools.client.model


case class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties (
    _name: Option[ConfigNodePropertyString],
    _endpoints: Option[ConfigNodePropertyArray],
    _pullItems: Option[ConfigNodePropertyInteger],
    _packageBuilderTarget: Option[ConfigNodePropertyString],
    _transportSecretProviderTarget: Option[ConfigNodePropertyString]
)
object OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties {
    def toStringBody(var_name: Object, var_endpoints: Object, var_pullItems: Object, var_packageBuilderTarget: Object, var_transportSecretProviderTarget: Object) =
        s"""
        | {
        | "name":$var_name,"endpoints":$var_endpoints,"pullItems":$var_pullItems,"packageBuilderTarget":$var_packageBuilderTarget,"transportSecretProviderTarget":$var_transportSecretProviderTarget
        | }
        """.stripMargin
}
