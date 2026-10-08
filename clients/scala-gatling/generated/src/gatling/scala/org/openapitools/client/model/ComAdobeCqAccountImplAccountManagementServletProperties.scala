
package org.openapitools.client.model


case class ComAdobeCqAccountImplAccountManagementServletProperties (
    _cqAccountmanagerConfigInformnewaccountMail: Option[ConfigNodePropertyString],
    _cqAccountmanagerConfigInformnewpwdMail: Option[ConfigNodePropertyString]
)
object ComAdobeCqAccountImplAccountManagementServletProperties {
    def toStringBody(var_cqAccountmanagerConfigInformnewaccountMail: Object, var_cqAccountmanagerConfigInformnewpwdMail: Object) =
        s"""
        | {
        | "cqAccountmanagerConfigInformnewaccountMail":$var_cqAccountmanagerConfigInformnewaccountMail,"cqAccountmanagerConfigInformnewpwdMail":$var_cqAccountmanagerConfigInformnewpwdMail
        | }
        """.stripMargin
}
