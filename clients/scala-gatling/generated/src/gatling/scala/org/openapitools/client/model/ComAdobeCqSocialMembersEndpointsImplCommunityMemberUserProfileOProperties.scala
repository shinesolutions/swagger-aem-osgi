
package org.openapitools.client.model


case class ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties (
    _fieldWhitelist: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties {
    def toStringBody(var_fieldWhitelist: Object) =
        s"""
        | {
        | "fieldWhitelist":$var_fieldWhitelist
        | }
        """.stripMargin
}
