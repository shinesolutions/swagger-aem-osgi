
package org.openapitools.client.model


case class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties (
    _purgeCompleted: Option[ConfigNodePropertyBoolean],
    _completedAge: Option[ConfigNodePropertyInteger],
    _purgeActive: Option[ConfigNodePropertyBoolean],
    _activeAge: Option[ConfigNodePropertyInteger],
    _saveThreshold: Option[ConfigNodePropertyInteger]
)
object ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties {
    def toStringBody(var_purgeCompleted: Object, var_completedAge: Object, var_purgeActive: Object, var_activeAge: Object, var_saveThreshold: Object) =
        s"""
        | {
        | "purgeCompleted":$var_purgeCompleted,"completedAge":$var_completedAge,"purgeActive":$var_purgeActive,"activeAge":$var_activeAge,"saveThreshold":$var_saveThreshold
        | }
        """.stripMargin
}
