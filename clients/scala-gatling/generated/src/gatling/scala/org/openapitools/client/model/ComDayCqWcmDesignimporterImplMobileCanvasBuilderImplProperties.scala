
package org.openapitools.client.model


case class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties (
    _filepattern: Option[ConfigNodePropertyString],
    _deviceGroups: Option[ConfigNodePropertyArray],
    _buildPageNodes: Option[ConfigNodePropertyBoolean],
    _buildClientLibs: Option[ConfigNodePropertyBoolean],
    _buildCanvasComponent: Option[ConfigNodePropertyBoolean]
)
object ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties {
    def toStringBody(var_filepattern: Object, var_deviceGroups: Object, var_buildPageNodes: Object, var_buildClientLibs: Object, var_buildCanvasComponent: Object) =
        s"""
        | {
        | "filepattern":$var_filepattern,"deviceGroups":$var_deviceGroups,"buildPageNodes":$var_buildPageNodes,"buildClientLibs":$var_buildClientLibs,"buildCanvasComponent":$var_buildCanvasComponent
        | }
        """.stripMargin
}
