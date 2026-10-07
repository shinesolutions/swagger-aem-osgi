
package org.openapitools.client.model


case class OrgApacheSlingModelsImplModelAdapterFactoryProperties (
    _osgiHttpWhiteboardListener: Option[ConfigNodePropertyString],
    _osgiHttpWhiteboardContextSelect: Option[ConfigNodePropertyString],
    _maxRecursionDepth: Option[ConfigNodePropertyInteger],
    _cleanupJobPeriod: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingModelsImplModelAdapterFactoryProperties {
    def toStringBody(var_osgiHttpWhiteboardListener: Object, var_osgiHttpWhiteboardContextSelect: Object, var_maxRecursionDepth: Object, var_cleanupJobPeriod: Object) =
        s"""
        | {
        | "osgiHttpWhiteboardListener":$var_osgiHttpWhiteboardListener,"osgiHttpWhiteboardContextSelect":$var_osgiHttpWhiteboardContextSelect,"maxRecursionDepth":$var_maxRecursionDepth,"cleanupJobPeriod":$var_cleanupJobPeriod
        | }
        """.stripMargin
}
