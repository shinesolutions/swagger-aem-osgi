
package org.openapitools.client.model


case class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties (
    _fromAddress: Option[ConfigNodePropertyString],
    _hostPrefix: Option[ConfigNodePropertyString],
    _notifyOnabort: Option[ConfigNodePropertyBoolean],
    _notifyOncomplete: Option[ConfigNodePropertyBoolean],
    _notifyOncontainercomplete: Option[ConfigNodePropertyBoolean],
    _notifyUseronly: Option[ConfigNodePropertyBoolean]
)
object ComDayCqWorkflowImplEmailEMailNotificationServiceProperties {
    def toStringBody(var_fromAddress: Object, var_hostPrefix: Object, var_notifyOnabort: Object, var_notifyOncomplete: Object, var_notifyOncontainercomplete: Object, var_notifyUseronly: Object) =
        s"""
        | {
        | "fromAddress":$var_fromAddress,"hostPrefix":$var_hostPrefix,"notifyOnabort":$var_notifyOnabort,"notifyOncomplete":$var_notifyOncomplete,"notifyOncontainercomplete":$var_notifyOncontainercomplete,"notifyUseronly":$var_notifyUseronly
        | }
        """.stripMargin
}
