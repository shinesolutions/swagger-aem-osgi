
package org.openapitools.client.model


case class ComAdobeCqSocialSyncImplUserSyncListenerImplProperties (
    _nodetypes: Option[ConfigNodePropertyArray],
    _ignorableprops: Option[ConfigNodePropertyArray],
    _ignorablenodes: Option[ConfigNodePropertyArray],
    _enabled: Option[ConfigNodePropertyBoolean],
    _distfolders: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialSyncImplUserSyncListenerImplProperties {
    def toStringBody(var_nodetypes: Object, var_ignorableprops: Object, var_ignorablenodes: Object, var_enabled: Object, var_distfolders: Object) =
        s"""
        | {
        | "nodetypes":$var_nodetypes,"ignorableprops":$var_ignorableprops,"ignorablenodes":$var_ignorablenodes,"enabled":$var_enabled,"distfolders":$var_distfolders
        | }
        """.stripMargin
}
