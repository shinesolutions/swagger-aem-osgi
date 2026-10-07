
package org.openapitools.client.model


case class ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties (
    _forcelocation: Option[ConfigNodePropertyBoolean]
)
object ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties {
    def toStringBody(var_forcelocation: Object) =
        s"""
        | {
        | "forcelocation":$var_forcelocation
        | }
        """.stripMargin
}
