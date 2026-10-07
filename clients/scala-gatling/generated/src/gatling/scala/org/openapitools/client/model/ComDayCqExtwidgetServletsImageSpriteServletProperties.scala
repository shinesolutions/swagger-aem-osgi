
package org.openapitools.client.model


case class ComDayCqExtwidgetServletsImageSpriteServletProperties (
    _maxWidth: Option[ConfigNodePropertyInteger],
    _maxHeight: Option[ConfigNodePropertyInteger]
)
object ComDayCqExtwidgetServletsImageSpriteServletProperties {
    def toStringBody(var_maxWidth: Object, var_maxHeight: Object) =
        s"""
        | {
        | "maxWidth":$var_maxWidth,"maxHeight":$var_maxHeight
        | }
        """.stripMargin
}
