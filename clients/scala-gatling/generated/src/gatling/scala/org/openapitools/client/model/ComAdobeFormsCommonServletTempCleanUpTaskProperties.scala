
package org.openapitools.client.model


case class ComAdobeFormsCommonServletTempCleanUpTaskProperties (
    _schedulerExpression: Option[ConfigNodePropertyString],
    _durationForTemporaryStorage: Option[ConfigNodePropertyString],
    _durationForAnonymousStorage: Option[ConfigNodePropertyString]
)
object ComAdobeFormsCommonServletTempCleanUpTaskProperties {
    def toStringBody(var_schedulerExpression: Object, var_durationForTemporaryStorage: Object, var_durationForAnonymousStorage: Object) =
        s"""
        | {
        | "schedulerExpression":$var_schedulerExpression,"durationForTemporaryStorage":$var_durationForTemporaryStorage,"durationForAnonymousStorage":$var_durationForAnonymousStorage
        | }
        """.stripMargin
}
