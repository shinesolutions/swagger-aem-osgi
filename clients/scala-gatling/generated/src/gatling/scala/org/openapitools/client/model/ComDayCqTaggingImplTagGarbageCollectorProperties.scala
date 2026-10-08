
package org.openapitools.client.model


case class ComDayCqTaggingImplTagGarbageCollectorProperties (
    _schedulerExpression: Option[ConfigNodePropertyString]
)
object ComDayCqTaggingImplTagGarbageCollectorProperties {
    def toStringBody(var_schedulerExpression: Object) =
        s"""
        | {
        | "schedulerExpression":$var_schedulerExpression
        | }
        """.stripMargin
}
