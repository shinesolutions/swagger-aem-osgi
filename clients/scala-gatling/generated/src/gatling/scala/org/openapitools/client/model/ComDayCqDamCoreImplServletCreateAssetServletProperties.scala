
package org.openapitools.client.model


case class ComDayCqDamCoreImplServletCreateAssetServletProperties (
    _detectDuplicate: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplServletCreateAssetServletProperties {
    def toStringBody(var_detectDuplicate: Object) =
        s"""
        | {
        | "detectDuplicate":$var_detectDuplicate
        | }
        """.stripMargin
}
