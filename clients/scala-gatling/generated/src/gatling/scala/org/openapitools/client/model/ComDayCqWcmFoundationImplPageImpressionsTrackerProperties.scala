
package org.openapitools.client.model


case class ComDayCqWcmFoundationImplPageImpressionsTrackerProperties (
    _slingAuthRequirements: Option[ConfigNodePropertyString]
)
object ComDayCqWcmFoundationImplPageImpressionsTrackerProperties {
    def toStringBody(var_slingAuthRequirements: Object) =
        s"""
        | {
        | "slingAuthRequirements":$var_slingAuthRequirements
        | }
        """.stripMargin
}
