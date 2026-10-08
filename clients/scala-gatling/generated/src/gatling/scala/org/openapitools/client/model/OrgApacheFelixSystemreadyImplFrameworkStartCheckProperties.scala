
package org.openapitools.client.model


case class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties (
    _timeout: Option[ConfigNodePropertyInteger],
    _targetStartLevel: Option[ConfigNodePropertyInteger],
    _targetStartLevelPropName: Option[ConfigNodePropertyString],
    _type: Option[ConfigNodePropertyDropDown]
)
object OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties {
    def toStringBody(var_timeout: Object, var_targetStartLevel: Object, var_targetStartLevelPropName: Object, var_type: Object) =
        s"""
        | {
        | "timeout":$var_timeout,"targetStartLevel":$var_targetStartLevel,"targetStartLevelPropName":$var_targetStartLevelPropName,"type":$var_type
        | }
        """.stripMargin
}
