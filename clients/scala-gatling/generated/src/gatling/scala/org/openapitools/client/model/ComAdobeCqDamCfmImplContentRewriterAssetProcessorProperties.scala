
package org.openapitools.client.model


case class ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties (
    _pipelineType: Option[ConfigNodePropertyString]
)
object ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties {
    def toStringBody(var_pipelineType: Object) =
        s"""
        | {
        | "pipelineType":$var_pipelineType
        | }
        """.stripMargin
}
