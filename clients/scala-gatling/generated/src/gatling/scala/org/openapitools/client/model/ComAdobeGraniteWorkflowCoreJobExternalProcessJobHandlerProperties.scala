
package org.openapitools.client.model


case class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties (
    _defaultTimeout: Option[ConfigNodePropertyInteger],
    _maxTimeout: Option[ConfigNodePropertyInteger],
    _defaultPeriod: Option[ConfigNodePropertyInteger]
)
object ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties {
    def toStringBody(var_defaultTimeout: Object, var_maxTimeout: Object, var_defaultPeriod: Object) =
        s"""
        | {
        | "defaultTimeout":$var_defaultTimeout,"maxTimeout":$var_maxTimeout,"defaultPeriod":$var_defaultPeriod
        | }
        """.stripMargin
}
