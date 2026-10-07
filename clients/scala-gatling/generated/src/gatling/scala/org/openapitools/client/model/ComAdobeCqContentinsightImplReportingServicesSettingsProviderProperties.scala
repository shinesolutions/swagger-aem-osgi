
package org.openapitools.client.model


case class ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties (
    _reportingservicesUrl: Option[ConfigNodePropertyString]
)
object ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties {
    def toStringBody(var_reportingservicesUrl: Object) =
        s"""
        | {
        | "reportingservicesUrl":$var_reportingservicesUrl
        | }
        """.stripMargin
}
