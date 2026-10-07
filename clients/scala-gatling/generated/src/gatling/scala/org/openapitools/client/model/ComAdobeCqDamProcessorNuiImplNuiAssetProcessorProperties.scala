
package org.openapitools.client.model


case class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties (
    _nuiEnabled: Option[ConfigNodePropertyBoolean],
    _nuiServiceUrl: Option[ConfigNodePropertyString],
    _nuiApiKey: Option[ConfigNodePropertyString]
)
object ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties {
    def toStringBody(var_nuiEnabled: Object, var_nuiServiceUrl: Object, var_nuiApiKey: Object) =
        s"""
        | {
        | "nuiEnabled":$var_nuiEnabled,"nuiServiceUrl":$var_nuiServiceUrl,"nuiApiKey":$var_nuiApiKey
        | }
        """.stripMargin
}
