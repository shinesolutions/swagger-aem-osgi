
package org.openapitools.client.model


case class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties (
    _schedulerPeriod: Option[ConfigNodePropertyInteger],
    _schedulerConcurrent: Option[ConfigNodePropertyBoolean],
    _serviceBadLinkToleranceInterval: Option[ConfigNodePropertyInteger],
    _serviceCheckOverridePatterns: Option[ConfigNodePropertyArray],
    _serviceCacheBrokenInternalLinks: Option[ConfigNodePropertyBoolean],
    _serviceSpecialLinkPrefix: Option[ConfigNodePropertyArray],
    _serviceSpecialLinkPatterns: Option[ConfigNodePropertyArray]
)
object ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties {
    def toStringBody(var_schedulerPeriod: Object, var_schedulerConcurrent: Object, var_serviceBadLinkToleranceInterval: Object, var_serviceCheckOverridePatterns: Object, var_serviceCacheBrokenInternalLinks: Object, var_serviceSpecialLinkPrefix: Object, var_serviceSpecialLinkPatterns: Object) =
        s"""
        | {
        | "schedulerPeriod":$var_schedulerPeriod,"schedulerConcurrent":$var_schedulerConcurrent,"serviceBadLinkToleranceInterval":$var_serviceBadLinkToleranceInterval,"serviceCheckOverridePatterns":$var_serviceCheckOverridePatterns,"serviceCacheBrokenInternalLinks":$var_serviceCacheBrokenInternalLinks,"serviceSpecialLinkPrefix":$var_serviceSpecialLinkPrefix,"serviceSpecialLinkPatterns":$var_serviceSpecialLinkPatterns
        | }
        """.stripMargin
}
