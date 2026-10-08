
package org.openapitools.client.model


case class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties (
    _comAdobeCqScreensAnalyticsImplUrl: Option[ConfigNodePropertyString],
    _comAdobeCqScreensAnalyticsImplApikey: Option[ConfigNodePropertyString],
    _comAdobeCqScreensAnalyticsImplProject: Option[ConfigNodePropertyString],
    _comAdobeCqScreensAnalyticsImplEnvironment: Option[ConfigNodePropertyDropDown],
    _comAdobeCqScreensAnalyticsImplSendFrequency: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties {
    def toStringBody(var_comAdobeCqScreensAnalyticsImplUrl: Object, var_comAdobeCqScreensAnalyticsImplApikey: Object, var_comAdobeCqScreensAnalyticsImplProject: Object, var_comAdobeCqScreensAnalyticsImplEnvironment: Object, var_comAdobeCqScreensAnalyticsImplSendFrequency: Object) =
        s"""
        | {
        | "comAdobeCqScreensAnalyticsImplUrl":$var_comAdobeCqScreensAnalyticsImplUrl,"comAdobeCqScreensAnalyticsImplApikey":$var_comAdobeCqScreensAnalyticsImplApikey,"comAdobeCqScreensAnalyticsImplProject":$var_comAdobeCqScreensAnalyticsImplProject,"comAdobeCqScreensAnalyticsImplEnvironment":$var_comAdobeCqScreensAnalyticsImplEnvironment,"comAdobeCqScreensAnalyticsImplSendFrequency":$var_comAdobeCqScreensAnalyticsImplSendFrequency
        | }
        """.stripMargin
}
