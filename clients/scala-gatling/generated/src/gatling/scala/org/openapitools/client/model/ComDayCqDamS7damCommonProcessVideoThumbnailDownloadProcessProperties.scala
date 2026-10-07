
package org.openapitools.client.model


case class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties (
    _processLabel: Option[ConfigNodePropertyString]
)
object ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties {
    def toStringBody(var_processLabel: Object) =
        s"""
        | {
        | "processLabel":$var_processLabel
        | }
        """.stripMargin
}
