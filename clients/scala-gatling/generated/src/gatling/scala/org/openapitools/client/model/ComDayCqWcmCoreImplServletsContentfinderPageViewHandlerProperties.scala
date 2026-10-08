
package org.openapitools.client.model


case class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties (
    _guessTotal: Option[ConfigNodePropertyString],
    _tagTitleSearch: Option[ConfigNodePropertyBoolean]
)
object ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties {
    def toStringBody(var_guessTotal: Object, var_tagTitleSearch: Object) =
        s"""
        | {
        | "guessTotal":$var_guessTotal,"tagTitleSearch":$var_tagTitleSearch
        | }
        """.stripMargin
}
