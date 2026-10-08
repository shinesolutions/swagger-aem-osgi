
package org.openapitools.client.model


case class ConfigNodePropertyArray (
    /* property name */
    _name: Option[String],
    /* True if optional */
    _optional: Option[Boolean],
    /* True if property is set */
    _isSet: Option[Boolean],
    /* Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String) */
    _type: Option[Integer],
    /* Property value */
    _values: Option[List[String]],
    /* Property description */
    _description: Option[String]
)
object ConfigNodePropertyArray {
    def toStringBody(var_name: Object, var_optional: Object, var_isSet: Object, var_type: Object, var_values: Object, var_description: Object) =
        s"""
        | {
        | "name":$var_name,"optional":$var_optional,"isSet":$var_isSet,"type":$var_type,"values":$var_values,"description":$var_description
        | }
        """.stripMargin
}
