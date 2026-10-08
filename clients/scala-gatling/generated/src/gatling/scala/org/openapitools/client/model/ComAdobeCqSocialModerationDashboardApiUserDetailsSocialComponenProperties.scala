
package org.openapitools.client.model


case class ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties (
    _priority: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties {
    def toStringBody(var_priority: Object) =
        s"""
        | {
        | "priority":$var_priority
        | }
        """.stripMargin
}
