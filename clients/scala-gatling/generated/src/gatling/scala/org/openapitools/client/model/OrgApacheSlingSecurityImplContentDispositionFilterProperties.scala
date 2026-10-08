
package org.openapitools.client.model


case class OrgApacheSlingSecurityImplContentDispositionFilterProperties (
    _slingContentDispositionPaths: Option[ConfigNodePropertyArray],
    _slingContentDispositionExcludedPaths: Option[ConfigNodePropertyArray],
    _slingContentDispositionAllPaths: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingSecurityImplContentDispositionFilterProperties {
    def toStringBody(var_slingContentDispositionPaths: Object, var_slingContentDispositionExcludedPaths: Object, var_slingContentDispositionAllPaths: Object) =
        s"""
        | {
        | "slingContentDispositionPaths":$var_slingContentDispositionPaths,"slingContentDispositionExcludedPaths":$var_slingContentDispositionExcludedPaths,"slingContentDispositionAllPaths":$var_slingContentDispositionAllPaths
        | }
        """.stripMargin
}
