
package org.openapitools.client.model


case class ComAdobeCqAccountApiAccountManagementServiceProperties (
    _cqAccountmanagerTokenValidityPeriod: Option[ConfigNodePropertyInteger],
    _cqAccountmanagerConfigRequestnewaccountMail: Option[ConfigNodePropertyString],
    _cqAccountmanagerConfigRequestnewpwdMail: Option[ConfigNodePropertyString]
)
object ComAdobeCqAccountApiAccountManagementServiceProperties {
    def toStringBody(var_cqAccountmanagerTokenValidityPeriod: Object, var_cqAccountmanagerConfigRequestnewaccountMail: Object, var_cqAccountmanagerConfigRequestnewpwdMail: Object) =
        s"""
        | {
        | "cqAccountmanagerTokenValidityPeriod":$var_cqAccountmanagerTokenValidityPeriod,"cqAccountmanagerConfigRequestnewaccountMail":$var_cqAccountmanagerConfigRequestnewaccountMail,"cqAccountmanagerConfigRequestnewpwdMail":$var_cqAccountmanagerConfigRequestnewpwdMail
        | }
        """.stripMargin
}
