
package org.openapitools.client.model


case class OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties (
    _maxSize: Option[ConfigNodePropertyInteger]
)
object OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties {
    def toStringBody(var_maxSize: Object) =
        s"""
        | {
        | "maxSize":$var_maxSize
        | }
        """.stripMargin
}
