
package org.openapitools.client.model


case class ComDayCqWcmCoreWCMRequestFilterProperties (
    _wcmfilterMode: Option[ConfigNodePropertyDropDown]
)
object ComDayCqWcmCoreWCMRequestFilterProperties {
    def toStringBody(var_wcmfilterMode: Object) =
        s"""
        | {
        | "wcmfilterMode":$var_wcmfilterMode
        | }
        """.stripMargin
}
