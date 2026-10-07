
package org.openapitools.client.model


case class ComDayCqWcmFoundationFormsImplMailServletProperties (
    _slingServletResourceTypes: Option[ConfigNodePropertyString],
    _slingServletSelectors: Option[ConfigNodePropertyString],
    _resourceWhitelist: Option[ConfigNodePropertyArray],
    _resourceBlacklist: Option[ConfigNodePropertyString]
)
object ComDayCqWcmFoundationFormsImplMailServletProperties {
    def toStringBody(var_slingServletResourceTypes: Object, var_slingServletSelectors: Object, var_resourceWhitelist: Object, var_resourceBlacklist: Object) =
        s"""
        | {
        | "slingServletResourceTypes":$var_slingServletResourceTypes,"slingServletSelectors":$var_slingServletSelectors,"resourceWhitelist":$var_resourceWhitelist,"resourceBlacklist":$var_resourceBlacklist
        | }
        """.stripMargin
}
