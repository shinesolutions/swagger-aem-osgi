
package org.openapitools.client.model


case class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties (
    _userMapping: Option[ConfigNodePropertyArray],
    _userDefault: Option[ConfigNodePropertyString],
    _userEnableDefaultMapping: Option[ConfigNodePropertyBoolean],
    _requireValidation: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties {
    def toStringBody(var_userMapping: Object, var_userDefault: Object, var_userEnableDefaultMapping: Object, var_requireValidation: Object) =
        s"""
        | {
        | "userMapping":$var_userMapping,"userDefault":$var_userDefault,"userEnableDefaultMapping":$var_userEnableDefaultMapping,"requireValidation":$var_requireValidation
        | }
        """.stripMargin
}
