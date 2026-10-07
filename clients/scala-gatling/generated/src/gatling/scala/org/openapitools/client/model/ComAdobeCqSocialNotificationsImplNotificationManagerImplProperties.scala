
package org.openapitools.client.model


case class ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties (
    _maxUnreadNotificationCount: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties {
    def toStringBody(var_maxUnreadNotificationCount: Object) =
        s"""
        | {
        | "maxUnreadNotificationCount":$var_maxUnreadNotificationCount
        | }
        """.stripMargin
}
