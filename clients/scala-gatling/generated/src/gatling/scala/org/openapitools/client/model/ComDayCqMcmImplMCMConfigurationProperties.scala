
package org.openapitools.client.model


case class ComDayCqMcmImplMCMConfigurationProperties (
    _experienceIndirection: Option[ConfigNodePropertyArray],
    _touchpointIndirection: Option[ConfigNodePropertyArray]
)
object ComDayCqMcmImplMCMConfigurationProperties {
    def toStringBody(var_experienceIndirection: Object, var_touchpointIndirection: Object) =
        s"""
        | {
        | "experienceIndirection":$var_experienceIndirection,"touchpointIndirection":$var_touchpointIndirection
        | }
        """.stripMargin
}
