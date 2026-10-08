
package org.openapitools.client.model


case class ComDayCqPollingImporterImplPollingImporterImplProperties (
    _importerMinInterval: Option[ConfigNodePropertyInteger],
    _importerUser: Option[ConfigNodePropertyString],
    _excludePaths: Option[ConfigNodePropertyArray],
    _includePaths: Option[ConfigNodePropertyArray]
)
object ComDayCqPollingImporterImplPollingImporterImplProperties {
    def toStringBody(var_importerMinInterval: Object, var_importerUser: Object, var_excludePaths: Object, var_includePaths: Object) =
        s"""
        | {
        | "importerMinInterval":$var_importerMinInterval,"importerUser":$var_importerUser,"excludePaths":$var_excludePaths,"includePaths":$var_includePaths
        | }
        """.stripMargin
}
