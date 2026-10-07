
package org.openapitools.client.model


case class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties (
    _path: Option[ConfigNodePropertyString],
    _tokenRequiredAttr: Option[ConfigNodePropertyDropDown],
    _tokenAlternateUrl: Option[ConfigNodePropertyString],
    _tokenEncapsulated: Option[ConfigNodePropertyBoolean],
    _skipTokenRefresh: Option[ConfigNodePropertyArray]
)
object ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties {
    def toStringBody(var_path: Object, var_tokenRequiredAttr: Object, var_tokenAlternateUrl: Object, var_tokenEncapsulated: Object, var_skipTokenRefresh: Object) =
        s"""
        | {
        | "path":$var_path,"tokenRequiredAttr":$var_tokenRequiredAttr,"tokenAlternateUrl":$var_tokenAlternateUrl,"tokenEncapsulated":$var_tokenEncapsulated,"skipTokenRefresh":$var_skipTokenRefresh
        | }
        """.stripMargin
}
