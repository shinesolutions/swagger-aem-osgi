
package org.openapitools.client.model


case class ConfigNodePropertyDropDown (
    /* property name */
    _name: Option[String],
    /* True if optional */
    _optional: Option[Boolean],
    /* True if property is set */
    _isSet: Option[Boolean],
    _type: Option[ConfigNodePropertyDropDownType],
    /* Property value */
    _value: Option[AnyType],
    /* Property description */
    _description: Option[String]
)
object ConfigNodePropertyDropDown {
    def toStringBody(var_name: Object, var_optional: Object, var_isSet: Object, var_type: Object, var_value: Object, var_description: Object) =
        s"""
        | {
        | "name":$var_name,"optional":$var_optional,"isSet":$var_isSet,"type":$var_type,"value":$var_value,"description":$var_description
        | }
        """.stripMargin
}
