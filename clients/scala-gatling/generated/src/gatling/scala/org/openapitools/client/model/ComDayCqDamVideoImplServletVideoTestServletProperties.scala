
package org.openapitools.client.model


case class ComDayCqDamVideoImplServletVideoTestServletProperties (
    _enabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamVideoImplServletVideoTestServletProperties {
    def toStringBody(var_enabled: Object) =
        s"""
        | {
        | "enabled":$var_enabled
        | }
        """.stripMargin
}
