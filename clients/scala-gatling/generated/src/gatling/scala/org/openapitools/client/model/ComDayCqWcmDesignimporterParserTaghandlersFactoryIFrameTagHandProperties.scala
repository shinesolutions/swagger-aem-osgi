
package org.openapitools.client.model


case class ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties (
    _serviceRanking: Option[ConfigNodePropertyInteger],
    _tagpattern: Option[ConfigNodePropertyString]
)
object ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties {
    def toStringBody(var_serviceRanking: Object, var_tagpattern: Object) =
        s"""
        | {
        | "serviceRanking":$var_serviceRanking,"tagpattern":$var_tagpattern
        | }
        """.stripMargin
}
