
package org.openapitools.client.model


case class ComAdobeCqScreensImplScreensChannelPostProcessorProperties (
    _screensChannelsPropertiesToRemove: Option[ConfigNodePropertyArray]
)
object ComAdobeCqScreensImplScreensChannelPostProcessorProperties {
    def toStringBody(var_screensChannelsPropertiesToRemove: Object) =
        s"""
        | {
        | "screensChannelsPropertiesToRemove":$var_screensChannelsPropertiesToRemove
        | }
        """.stripMargin
}
