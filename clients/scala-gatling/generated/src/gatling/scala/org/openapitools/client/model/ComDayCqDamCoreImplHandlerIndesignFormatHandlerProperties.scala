
package org.openapitools.client.model


case class ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties (
    _mimetype: Option[ConfigNodePropertyArray]
)
object ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties {
    def toStringBody(var_mimetype: Object) =
        s"""
        | {
        | "mimetype":$var_mimetype
        | }
        """.stripMargin
}
