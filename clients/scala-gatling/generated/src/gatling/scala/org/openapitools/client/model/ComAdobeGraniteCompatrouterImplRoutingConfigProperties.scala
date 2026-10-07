
package org.openapitools.client.model


case class ComAdobeGraniteCompatrouterImplRoutingConfigProperties (
    _id: Option[ConfigNodePropertyString],
    _compatPath: Option[ConfigNodePropertyString],
    _newPath: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteCompatrouterImplRoutingConfigProperties {
    def toStringBody(var_id: Object, var_compatPath: Object, var_newPath: Object) =
        s"""
        | {
        | "id":$var_id,"compatPath":$var_compatPath,"newPath":$var_newPath
        | }
        """.stripMargin
}
