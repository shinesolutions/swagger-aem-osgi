
package org.openapitools.client.model


case class ComDayCqSecurityACLSetupProperties (
    _cqAclsetupRules: Option[ConfigNodePropertyArray]
)
object ComDayCqSecurityACLSetupProperties {
    def toStringBody(var_cqAclsetupRules: Object) =
        s"""
        | {
        | "cqAclsetupRules":$var_cqAclsetupRules
        | }
        """.stripMargin
}
