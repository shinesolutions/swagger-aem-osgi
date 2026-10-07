
package org.openapitools.client.model


case class ComDayCqDamHandlerStandardPsdPsdHandlerProperties (
    _largeFileThreshold: Option[ConfigNodePropertyInteger]
)
object ComDayCqDamHandlerStandardPsdPsdHandlerProperties {
    def toStringBody(var_largeFileThreshold: Object) =
        s"""
        | {
        | "largeFileThreshold":$var_largeFileThreshold
        | }
        """.stripMargin
}
