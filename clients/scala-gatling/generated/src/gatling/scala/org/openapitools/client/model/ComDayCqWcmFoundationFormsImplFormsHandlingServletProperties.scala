
package org.openapitools.client.model


case class ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties (
    _nameWhitelist: Option[ConfigNodePropertyString],
    _allowExpressions: Option[ConfigNodePropertyBoolean]
)
object ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties {
    def toStringBody(var_nameWhitelist: Object, var_allowExpressions: Object) =
        s"""
        | {
        | "nameWhitelist":$var_nameWhitelist,"allowExpressions":$var_allowExpressions
        | }
        """.stripMargin
}
