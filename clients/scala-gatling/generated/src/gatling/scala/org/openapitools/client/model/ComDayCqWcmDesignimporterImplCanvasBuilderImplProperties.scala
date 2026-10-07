
package org.openapitools.client.model


case class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties (
    _filepattern: Option[ConfigNodePropertyString],
    _buildPageNodes: Option[ConfigNodePropertyBoolean],
    _buildClientLibs: Option[ConfigNodePropertyBoolean],
    _buildCanvasComponent: Option[ConfigNodePropertyBoolean]
)
object ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties {
    def toStringBody(var_filepattern: Object, var_buildPageNodes: Object, var_buildClientLibs: Object, var_buildCanvasComponent: Object) =
        s"""
        | {
        | "filepattern":$var_filepattern,"buildPageNodes":$var_buildPageNodes,"buildClientLibs":$var_buildClientLibs,"buildCanvasComponent":$var_buildCanvasComponent
        | }
        """.stripMargin
}
