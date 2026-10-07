
package org.openapitools.client.model


case class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties (
    _enable: Option[ConfigNodePropertyBoolean],
    _uGCLimit: Option[ConfigNodePropertyInteger],
    _ugcLimitDuration: Option[ConfigNodePropertyInteger],
    _domains: Option[ConfigNodePropertyArray],
    _toList: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties {
    def toStringBody(var_enable: Object, var_uGCLimit: Object, var_ugcLimitDuration: Object, var_domains: Object, var_toList: Object) =
        s"""
        | {
        | "enable":$var_enable,"uGCLimit":$var_uGCLimit,"ugcLimitDuration":$var_ugcLimitDuration,"domains":$var_domains,"toList":$var_toList
        | }
        """.stripMargin
}
