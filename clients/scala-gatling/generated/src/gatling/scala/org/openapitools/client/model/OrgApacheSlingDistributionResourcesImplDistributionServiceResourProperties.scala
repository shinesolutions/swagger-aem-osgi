
package org.openapitools.client.model


case class OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties (
    _providerRoots: Option[ConfigNodePropertyString],
    _kind: Option[ConfigNodePropertyString]
)
object OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties {
    def toStringBody(var_providerRoots: Object, var_kind: Object) =
        s"""
        | {
        | "providerRoots":$var_providerRoots,"kind":$var_kind
        | }
        """.stripMargin
}
