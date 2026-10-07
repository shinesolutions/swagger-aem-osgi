
package org.openapitools.client.model


case class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties (
    _cqSearchpromoteConfighandlerEnabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties {
    def toStringBody(var_cqSearchpromoteConfighandlerEnabled: Object) =
        s"""
        | {
        | "cqSearchpromoteConfighandlerEnabled":$var_cqSearchpromoteConfighandlerEnabled
        | }
        """.stripMargin
}
