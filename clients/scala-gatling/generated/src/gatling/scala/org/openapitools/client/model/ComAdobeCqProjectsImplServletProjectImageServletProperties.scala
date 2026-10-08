
package org.openapitools.client.model


case class ComAdobeCqProjectsImplServletProjectImageServletProperties (
    _imageQuality: Option[ConfigNodePropertyString],
    _imageSupportedResolutions: Option[ConfigNodePropertyString]
)
object ComAdobeCqProjectsImplServletProjectImageServletProperties {
    def toStringBody(var_imageQuality: Object, var_imageSupportedResolutions: Object) =
        s"""
        | {
        | "imageQuality":$var_imageQuality,"imageSupportedResolutions":$var_imageSupportedResolutions
        | }
        """.stripMargin
}
