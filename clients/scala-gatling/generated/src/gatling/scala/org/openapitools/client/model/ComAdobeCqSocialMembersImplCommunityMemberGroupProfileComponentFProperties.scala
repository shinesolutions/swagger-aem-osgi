
package org.openapitools.client.model


case class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties (
    _everyoneLimit: Option[ConfigNodePropertyInteger],
    _priority: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties {
    def toStringBody(var_everyoneLimit: Object, var_priority: Object) =
        s"""
        | {
        | "everyoneLimit":$var_everyoneLimit,"priority":$var_priority
        | }
        """.stripMargin
}
