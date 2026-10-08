
package org.openapitools.client.model


case class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties (
    _cqMimeTypeBlacklist: Option[ConfigNodePropertyArray],
    _cqDamEmptyMime: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplServletDamContentDispositionFilterProperties {
    def toStringBody(var_cqMimeTypeBlacklist: Object, var_cqDamEmptyMime: Object) =
        s"""
        | {
        | "cqMimeTypeBlacklist":$var_cqMimeTypeBlacklist,"cqDamEmptyMime":$var_cqDamEmptyMime
        | }
        """.stripMargin
}
