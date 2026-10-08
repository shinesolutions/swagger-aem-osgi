
package org.openapitools.client.model


case class OrgApacheSlingTenantInternalTenantProviderImplProperties (
    _tenantRoot: Option[ConfigNodePropertyString],
    _tenantPathMatcher: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingTenantInternalTenantProviderImplProperties {
    def toStringBody(var_tenantRoot: Object, var_tenantPathMatcher: Object) =
        s"""
        | {
        | "tenantRoot":$var_tenantRoot,"tenantPathMatcher":$var_tenantPathMatcher
        | }
        """.stripMargin
}
