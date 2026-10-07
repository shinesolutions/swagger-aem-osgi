
package org.openapitools.client.model


case class ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties (
    _enableDataTriggeredContent: Option[ConfigNodePropertyBoolean]
)
object ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties {
    def toStringBody(var_enableDataTriggeredContent: Object) =
        s"""
        | {
        | "enableDataTriggeredContent":$var_enableDataTriggeredContent
        | }
        """.stripMargin
}
