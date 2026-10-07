
package org.openapitools.client.model


case class ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties (
    _ignorePath: Option[ConfigNodePropertyBoolean]
)
object ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties {
    def toStringBody(var_ignorePath: Object) =
        s"""
        | {
        | "ignorePath":$var_ignorePath
        | }
        """.stripMargin
}
