
package org.openapitools.client.model


case class ComDayCqReportingImplRLogAnalyzerProperties (
    _requestLogOutput: Option[ConfigNodePropertyString]
)
object ComDayCqReportingImplRLogAnalyzerProperties {
    def toStringBody(var_requestLogOutput: Object) =
        s"""
        | {
        | "requestLogOutput":$var_requestLogOutput
        | }
        """.stripMargin
}
