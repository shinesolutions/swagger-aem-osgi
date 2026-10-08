
package org.openapitools.client.model


case class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties (
    _schedulerPeriod: Option[ConfigNodePropertyInteger],
    _schedulerConcurrent: Option[ConfigNodePropertyBoolean],
    _goodLinkTestInterval: Option[ConfigNodePropertyInteger],
    _badLinkTestInterval: Option[ConfigNodePropertyInteger],
    _linkUnusedInterval: Option[ConfigNodePropertyInteger],
    _connectionTimeout: Option[ConfigNodePropertyInteger]
)
object ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties {
    def toStringBody(var_schedulerPeriod: Object, var_schedulerConcurrent: Object, var_goodLinkTestInterval: Object, var_badLinkTestInterval: Object, var_linkUnusedInterval: Object, var_connectionTimeout: Object) =
        s"""
        | {
        | "schedulerPeriod":$var_schedulerPeriod,"schedulerConcurrent":$var_schedulerConcurrent,"goodLinkTestInterval":$var_goodLinkTestInterval,"badLinkTestInterval":$var_badLinkTestInterval,"linkUnusedInterval":$var_linkUnusedInterval,"connectionTimeout":$var_connectionTimeout
        | }
        """.stripMargin
}
