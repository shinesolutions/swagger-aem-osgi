
package org.openapitools.client.model


case class ComDayCqWcmCoreImplEventPageEventAuditListenerProperties (
    _configured: Option[ConfigNodePropertyString]
)
object ComDayCqWcmCoreImplEventPageEventAuditListenerProperties {
    def toStringBody(var_configured: Object) =
        s"""
        | {
        | "configured":$var_configured
        | }
        """.stripMargin
}
