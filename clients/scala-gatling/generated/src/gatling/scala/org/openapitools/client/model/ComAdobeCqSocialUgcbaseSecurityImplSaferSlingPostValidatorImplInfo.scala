
package org.openapitools.client.model


case class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo (
    _pid: Option[String],
    _title: Option[String],
    _description: Option[String],
    _properties: Option[ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties]
)
object ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo {
    def toStringBody(var_pid: Object, var_title: Object, var_description: Object, var_properties: Object) =
        s"""
        | {
        | "pid":$var_pid,"title":$var_title,"description":$var_description,"properties":$var_properties
        | }
        """.stripMargin
}
