
package org.openapitools.client.model


case class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties (
    _nonValidChars: Option[ConfigNodePropertyString]
)
object ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties {
    def toStringBody(var_nonValidChars: Object) =
        s"""
        | {
        | "nonValidChars":$var_nonValidChars
        | }
        """.stripMargin
}
