
package org.openapitools.client.model


case class ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties (
    _offloadingJobclonerEnabled: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties {
    def toStringBody(var_offloadingJobclonerEnabled: Object) =
        s"""
        | {
        | "offloadingJobclonerEnabled":$var_offloadingJobclonerEnabled
        | }
        """.stripMargin
}
