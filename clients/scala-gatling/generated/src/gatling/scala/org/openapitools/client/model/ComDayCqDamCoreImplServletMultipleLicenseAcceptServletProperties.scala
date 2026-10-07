
package org.openapitools.client.model


case class ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties (
    _cqDamDrmEnable: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties {
    def toStringBody(var_cqDamDrmEnable: Object) =
        s"""
        | {
        | "cqDamDrmEnable":$var_cqDamDrmEnable
        | }
        """.stripMargin
}
