
package org.openapitools.client.model


case class ComDayCqTaggingImplJcrTagManagerFactoryImplProperties (
    _validationEnabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqTaggingImplJcrTagManagerFactoryImplProperties {
    def toStringBody(var_validationEnabled: Object) =
        s"""
        | {
        | "validationEnabled":$var_validationEnabled
        | }
        """.stripMargin
}
