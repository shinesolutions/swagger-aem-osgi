
package org.openapitools.client.model


case class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties (
    _enable: Option[ConfigNodePropertyBoolean],
    _ttl1: Option[ConfigNodePropertyInteger],
    _ttl2: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties {
    def toStringBody(var_enable: Object, var_ttl1: Object, var_ttl2: Object) =
        s"""
        | {
        | "enable":$var_enable,"ttl1":$var_ttl1,"ttl2":$var_ttl2
        | }
        """.stripMargin
}
