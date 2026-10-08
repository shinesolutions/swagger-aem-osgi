
package org.openapitools.client.model


case class OrgApacheFelixSystemreadySystemReadyMonitorProperties (
    _pollInterval: Option[ConfigNodePropertyInteger]
)
object OrgApacheFelixSystemreadySystemReadyMonitorProperties {
    def toStringBody(var_pollInterval: Object) =
        s"""
        | {
        | "pollInterval":$var_pollInterval
        | }
        """.stripMargin
}
