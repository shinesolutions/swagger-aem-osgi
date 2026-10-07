
package org.openapitools.client.model


case class ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties (
    _fieldWhitelist: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties {
    def toStringBody(var_fieldWhitelist: Object) =
        s"""
        | {
        | "fieldWhitelist":$var_fieldWhitelist
        | }
        """.stripMargin
}
