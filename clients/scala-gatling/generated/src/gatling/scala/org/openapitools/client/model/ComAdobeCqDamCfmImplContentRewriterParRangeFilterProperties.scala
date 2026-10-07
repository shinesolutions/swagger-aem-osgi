
package org.openapitools.client.model


case class ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties (
    _pipelineType: Option[ConfigNodePropertyString]
)
object ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties {
    def toStringBody(var_pipelineType: Object) =
        s"""
        | {
        | "pipelineType":$var_pipelineType
        | }
        """.stripMargin
}
