
package org.openapitools.client.model


case class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties (
    _notifyOnupdate: Option[ConfigNodePropertyBoolean],
    _notifyOncomplete: Option[ConfigNodePropertyBoolean]
)
object ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties {
    def toStringBody(var_notifyOnupdate: Object, var_notifyOncomplete: Object) =
        s"""
        | {
        | "notifyOnupdate":$var_notifyOnupdate,"notifyOncomplete":$var_notifyOncomplete
        | }
        """.stripMargin
}
