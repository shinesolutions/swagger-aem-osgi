
package org.openapitools.client.model


case class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties (
    _fromAddress: Option[ConfigNodePropertyString],
    _senderHost: Option[ConfigNodePropertyString],
    _maxBounceCount: Option[ConfigNodePropertyString]
)
object ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties {
    def toStringBody(var_fromAddress: Object, var_senderHost: Object, var_maxBounceCount: Object) =
        s"""
        | {
        | "fromAddress":$var_fromAddress,"senderHost":$var_senderHost,"maxBounceCount":$var_maxBounceCount
        | }
        """.stripMargin
}
