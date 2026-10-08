
package org.openapitools.client.model


case class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties (
    _enableScheduledPostsSearch: Option[ConfigNodePropertyBoolean],
    _numberOfMinutes: Option[ConfigNodePropertyInteger],
    _maxSearchLimit: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties {
    def toStringBody(var_enableScheduledPostsSearch: Object, var_numberOfMinutes: Object, var_maxSearchLimit: Object) =
        s"""
        | {
        | "enableScheduledPostsSearch":$var_enableScheduledPostsSearch,"numberOfMinutes":$var_numberOfMinutes,"maxSearchLimit":$var_maxSearchLimit
        | }
        """.stripMargin
}
