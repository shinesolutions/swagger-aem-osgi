
package org.openapitools.client.model


case class ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties (
    _resourceTypeFilters: Option[ConfigNodePropertyArray],
    _priority: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties {
    def toStringBody(var_resourceTypeFilters: Object, var_priority: Object) =
        s"""
        | {
        | "resourceTypeFilters":$var_resourceTypeFilters,"priority":$var_priority
        | }
        """.stripMargin
}
