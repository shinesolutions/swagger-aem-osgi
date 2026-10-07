
package org.openapitools.client.model


case class ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties (
    _pageInfoProviderPropertyRegexDefault: Option[ConfigNodePropertyString],
    _pageInfoProviderPropertyName: Option[ConfigNodePropertyString]
)
object ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties {
    def toStringBody(var_pageInfoProviderPropertyRegexDefault: Object, var_pageInfoProviderPropertyName: Object) =
        s"""
        | {
        | "pageInfoProviderPropertyRegexDefault":$var_pageInfoProviderPropertyRegexDefault,"pageInfoProviderPropertyName":$var_pageInfoProviderPropertyName
        | }
        """.stripMargin
}
