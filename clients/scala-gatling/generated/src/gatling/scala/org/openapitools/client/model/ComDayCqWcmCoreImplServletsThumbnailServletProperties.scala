
package org.openapitools.client.model


case class ComDayCqWcmCoreImplServletsThumbnailServletProperties (
    _workspace: Option[ConfigNodePropertyString],
    _dimensions: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmCoreImplServletsThumbnailServletProperties {
    def toStringBody(var_workspace: Object, var_dimensions: Object) =
        s"""
        | {
        | "workspace":$var_workspace,"dimensions":$var_dimensions
        | }
        """.stripMargin
}
