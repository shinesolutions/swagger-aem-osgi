
package org.openapitools.client.model


case class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties (
    _eventFilter: Option[ConfigNodePropertyString],
    _launchesEventhandlerThreadpoolMaxsize: Option[ConfigNodePropertyInteger],
    _launchesEventhandlerThreadpoolPriority: Option[ConfigNodePropertyDropDown],
    _launchesEventhandlerUpdatelastmodification: Option[ConfigNodePropertyBoolean]
)
object ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties {
    def toStringBody(var_eventFilter: Object, var_launchesEventhandlerThreadpoolMaxsize: Object, var_launchesEventhandlerThreadpoolPriority: Object, var_launchesEventhandlerUpdatelastmodification: Object) =
        s"""
        | {
        | "eventFilter":$var_eventFilter,"launchesEventhandlerThreadpoolMaxsize":$var_launchesEventhandlerThreadpoolMaxsize,"launchesEventhandlerThreadpoolPriority":$var_launchesEventhandlerThreadpoolPriority,"launchesEventhandlerUpdatelastmodification":$var_launchesEventhandlerUpdatelastmodification
        | }
        """.stripMargin
}
