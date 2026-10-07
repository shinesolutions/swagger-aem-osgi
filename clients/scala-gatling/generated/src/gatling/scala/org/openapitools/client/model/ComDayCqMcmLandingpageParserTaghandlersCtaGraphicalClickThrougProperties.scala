
package org.openapitools.client.model


case class ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties (
    _serviceRanking: Option[ConfigNodePropertyInteger],
    _tagpattern: Option[ConfigNodePropertyString],
    _componentResourceType: Option[ConfigNodePropertyString]
)
object ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties {
    def toStringBody(var_serviceRanking: Object, var_tagpattern: Object, var_componentResourceType: Object) =
        s"""
        | {
        | "serviceRanking":$var_serviceRanking,"tagpattern":$var_tagpattern,"componentResourceType":$var_componentResourceType
        | }
        """.stripMargin
}
