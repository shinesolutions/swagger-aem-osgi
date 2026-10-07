
package org.openapitools.client.model


case class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties (
    _cqSocialConsoleAnalyticsComponents: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties {
    def toStringBody(var_cqSocialConsoleAnalyticsComponents: Object) =
        s"""
        | {
        | "cqSocialConsoleAnalyticsComponents":$var_cqSocialConsoleAnalyticsComponents
        | }
        """.stripMargin
}
