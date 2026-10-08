
package org.openapitools.client.model


case class OrgApacheSlingAuthCoreImplLogoutServletProperties (
    _slingServletMethods: Option[ConfigNodePropertyArray],
    _slingServletPaths: Option[ConfigNodePropertyString]
)
object OrgApacheSlingAuthCoreImplLogoutServletProperties {
    def toStringBody(var_slingServletMethods: Object, var_slingServletPaths: Object) =
        s"""
        | {
        | "slingServletMethods":$var_slingServletMethods,"slingServletPaths":$var_slingServletPaths
        | }
        """.stripMargin
}
