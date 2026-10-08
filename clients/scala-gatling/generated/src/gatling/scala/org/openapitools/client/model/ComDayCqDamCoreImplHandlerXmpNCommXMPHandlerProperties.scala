
package org.openapitools.client.model


case class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties (
    _xmphandlerCqFormats: Option[ConfigNodePropertyArray]
)
object ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties {
    def toStringBody(var_xmphandlerCqFormats: Object) =
        s"""
        | {
        | "xmphandlerCqFormats":$var_xmphandlerCqFormats
        | }
        """.stripMargin
}
