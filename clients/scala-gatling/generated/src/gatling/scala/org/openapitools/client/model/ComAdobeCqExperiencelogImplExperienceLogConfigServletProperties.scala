
package org.openapitools.client.model


case class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties (
    _enabled: Option[ConfigNodePropertyBoolean],
    _disabledForGroups: Option[ConfigNodePropertyArray]
)
object ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties {
    def toStringBody(var_enabled: Object, var_disabledForGroups: Object) =
        s"""
        | {
        | "enabled":$var_enabled,"disabledForGroups":$var_disabledForGroups
        | }
        """.stripMargin
}
