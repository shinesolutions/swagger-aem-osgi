
package org.openapitools.client.model


case class ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties (
    _schedulerExpression: Option[ConfigNodePropertyString]
)
object ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties {
    def toStringBody(var_schedulerExpression: Object) =
        s"""
        | {
        | "schedulerExpression":$var_schedulerExpression
        | }
        """.stripMargin
}
