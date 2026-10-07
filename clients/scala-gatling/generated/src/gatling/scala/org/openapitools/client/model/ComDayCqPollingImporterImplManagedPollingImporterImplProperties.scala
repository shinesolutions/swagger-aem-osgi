
package org.openapitools.client.model


case class ComDayCqPollingImporterImplManagedPollingImporterImplProperties (
    _importerUser: Option[ConfigNodePropertyString]
)
object ComDayCqPollingImporterImplManagedPollingImporterImplProperties {
    def toStringBody(var_importerUser: Object) =
        s"""
        | {
        | "importerUser":$var_importerUser
        | }
        """.stripMargin
}
