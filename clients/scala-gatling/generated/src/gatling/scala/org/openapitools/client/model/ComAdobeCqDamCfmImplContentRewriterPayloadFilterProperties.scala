
package org.openapitools.client.model


case class ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties (
    _pipelineType: Option[ConfigNodePropertyString]
)
object ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties {
    def toStringBody(var_pipelineType: Object) =
        s"""
        | {
        | "pipelineType":$var_pipelineType
        | }
        """.stripMargin
}
