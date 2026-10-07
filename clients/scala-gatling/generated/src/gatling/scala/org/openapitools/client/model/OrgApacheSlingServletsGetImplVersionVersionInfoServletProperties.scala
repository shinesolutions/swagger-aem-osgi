
package org.openapitools.client.model


case class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties (
    _slingServletSelectors: Option[ConfigNodePropertyArray],
    _ecmaSuport: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties {
    def toStringBody(var_slingServletSelectors: Object, var_ecmaSuport: Object) =
        s"""
        | {
        | "slingServletSelectors":$var_slingServletSelectors,"ecmaSuport":$var_ecmaSuport
        | }
        """.stripMargin
}
