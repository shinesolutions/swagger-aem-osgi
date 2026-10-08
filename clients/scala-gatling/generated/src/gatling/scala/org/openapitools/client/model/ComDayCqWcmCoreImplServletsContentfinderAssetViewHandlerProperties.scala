
package org.openapitools.client.model


case class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties (
    _damShowexpired: Option[ConfigNodePropertyBoolean],
    _damShowhidden: Option[ConfigNodePropertyBoolean],
    _tagTitleSearch: Option[ConfigNodePropertyBoolean],
    _guessTotal: Option[ConfigNodePropertyString],
    _damExpiryProperty: Option[ConfigNodePropertyString]
)
object ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties {
    def toStringBody(var_damShowexpired: Object, var_damShowhidden: Object, var_tagTitleSearch: Object, var_guessTotal: Object, var_damExpiryProperty: Object) =
        s"""
        | {
        | "damShowexpired":$var_damShowexpired,"damShowhidden":$var_damShowhidden,"tagTitleSearch":$var_tagTitleSearch,"guessTotal":$var_guessTotal,"damExpiryProperty":$var_damExpiryProperty
        | }
        """.stripMargin
}
