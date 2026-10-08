
package org.openapitools.client.model


case class ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties (
    _compatgroups: Option[ConfigNodePropertyArray],
    _enabled: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties {
    def toStringBody(var_compatgroups: Object, var_enabled: Object) =
        s"""
        | {
        | "compatgroups":$var_compatgroups,"enabled":$var_enabled
        | }
        """.stripMargin
}
