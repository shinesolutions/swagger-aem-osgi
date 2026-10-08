
package org.openapitools.client.model


case class ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties (
    _isEnabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties {
    def toStringBody(var_isEnabled: Object) =
        s"""
        | {
        | "isEnabled":$var_isEnabled
        | }
        """.stripMargin
}
