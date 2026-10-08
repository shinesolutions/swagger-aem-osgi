
package org.openapitools.client.model


case class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties (
    _fullGcDays: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties {
    def toStringBody(var_fullGcDays: Object) =
        s"""
        | {
        | "fullGcDays":$var_fullGcDays
        | }
        """.stripMargin
}
