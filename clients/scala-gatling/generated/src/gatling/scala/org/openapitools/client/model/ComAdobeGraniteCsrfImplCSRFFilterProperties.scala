
package org.openapitools.client.model


case class ComAdobeGraniteCsrfImplCSRFFilterProperties (
    _filterMethods: Option[ConfigNodePropertyArray],
    _filterEnableSafeUserAgents: Option[ConfigNodePropertyBoolean],
    _filterSafeUserAgents: Option[ConfigNodePropertyArray],
    _filterExcludedPaths: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteCsrfImplCSRFFilterProperties {
    def toStringBody(var_filterMethods: Object, var_filterEnableSafeUserAgents: Object, var_filterSafeUserAgents: Object, var_filterExcludedPaths: Object) =
        s"""
        | {
        | "filterMethods":$var_filterMethods,"filterEnableSafeUserAgents":$var_filterEnableSafeUserAgents,"filterSafeUserAgents":$var_filterSafeUserAgents,"filterExcludedPaths":$var_filterExcludedPaths
        | }
        """.stripMargin
}
