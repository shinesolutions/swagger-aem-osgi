
package org.openapitools.client.model


case class ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties (
    _serviceRanking: Option[ConfigNodePropertyInteger],
    _tagpattern: Option[ConfigNodePropertyString]
)
object ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties {
    def toStringBody(var_serviceRanking: Object, var_tagpattern: Object) =
        s"""
        | {
        | "serviceRanking":$var_serviceRanking,"tagpattern":$var_tagpattern
        | }
        """.stripMargin
}
