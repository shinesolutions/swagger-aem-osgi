
package org.openapitools.client.model


case class ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties (
    _priority: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties {
    def toStringBody(var_priority: Object) =
        s"""
        | {
        | "priority":$var_priority
        | }
        """.stripMargin
}
