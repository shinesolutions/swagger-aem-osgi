
package org.openapitools.client.model


case class ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties (
    _wcmdevmodefilterEnabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties {
    def toStringBody(var_wcmdevmodefilterEnabled: Object) =
        s"""
        | {
        | "wcmdevmodefilterEnabled":$var_wcmdevmodefilterEnabled
        | }
        """.stripMargin
}
