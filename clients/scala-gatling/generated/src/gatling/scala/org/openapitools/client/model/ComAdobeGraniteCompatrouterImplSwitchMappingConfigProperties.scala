
package org.openapitools.client.model


case class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties (
    _group: Option[ConfigNodePropertyString],
    _ids: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties {
    def toStringBody(var_group: Object, var_ids: Object) =
        s"""
        | {
        | "group":$var_group,"ids":$var_ids
        | }
        """.stripMargin
}
