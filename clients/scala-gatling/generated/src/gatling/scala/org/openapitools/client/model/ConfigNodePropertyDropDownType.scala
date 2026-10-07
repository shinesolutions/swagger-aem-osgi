
package org.openapitools.client.model


case class ConfigNodePropertyDropDownType (
    /* Drop Down label */
    _labels: Option[AnyType],
    /* Drown Down value */
    _values: Option[AnyType]
)
object ConfigNodePropertyDropDownType {
    def toStringBody(var_labels: Object, var_values: Object) =
        s"""
        | {
        | "labels":$var_labels,"values":$var_values
        | }
        """.stripMargin
}
