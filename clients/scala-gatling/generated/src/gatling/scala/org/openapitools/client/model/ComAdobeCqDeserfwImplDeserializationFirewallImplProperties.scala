
package org.openapitools.client.model


case class ComAdobeCqDeserfwImplDeserializationFirewallImplProperties (
    _firewallDeserializationWhitelist: Option[ConfigNodePropertyArray],
    _firewallDeserializationBlacklist: Option[ConfigNodePropertyArray],
    _firewallDeserializationDiagnostics: Option[ConfigNodePropertyString]
)
object ComAdobeCqDeserfwImplDeserializationFirewallImplProperties {
    def toStringBody(var_firewallDeserializationWhitelist: Object, var_firewallDeserializationBlacklist: Object, var_firewallDeserializationDiagnostics: Object) =
        s"""
        | {
        | "firewallDeserializationWhitelist":$var_firewallDeserializationWhitelist,"firewallDeserializationBlacklist":$var_firewallDeserializationBlacklist,"firewallDeserializationDiagnostics":$var_firewallDeserializationDiagnostics
        | }
        """.stripMargin
}
