
package org.openapitools.client.model


case class ComDayCqWcmCoreImplServletsFindReplaceServletProperties (
    _scope: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmCoreImplServletsFindReplaceServletProperties {
    def toStringBody(var_scope: Object) =
        s"""
        | {
        | "scope":$var_scope
        | }
        """.stripMargin
}
