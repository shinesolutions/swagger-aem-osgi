
package org.openapitools.client.model


case class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties (
    _inboxImplTypeproviderRegistrypaths: Option[ConfigNodePropertyArray],
    _inboxImplTypeproviderLegacypaths: Option[ConfigNodePropertyArray],
    _inboxImplTypeproviderDefaulturlFailureitem: Option[ConfigNodePropertyString],
    _inboxImplTypeproviderDefaulturlWorkitem: Option[ConfigNodePropertyString],
    _inboxImplTypeproviderDefaulturlTask: Option[ConfigNodePropertyString]
)
object ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties {
    def toStringBody(var_inboxImplTypeproviderRegistrypaths: Object, var_inboxImplTypeproviderLegacypaths: Object, var_inboxImplTypeproviderDefaulturlFailureitem: Object, var_inboxImplTypeproviderDefaulturlWorkitem: Object, var_inboxImplTypeproviderDefaulturlTask: Object) =
        s"""
        | {
        | "inboxImplTypeproviderRegistrypaths":$var_inboxImplTypeproviderRegistrypaths,"inboxImplTypeproviderLegacypaths":$var_inboxImplTypeproviderLegacypaths,"inboxImplTypeproviderDefaulturlFailureitem":$var_inboxImplTypeproviderDefaulturlFailureitem,"inboxImplTypeproviderDefaulturlWorkitem":$var_inboxImplTypeproviderDefaulturlWorkitem,"inboxImplTypeproviderDefaulturlTask":$var_inboxImplTypeproviderDefaulturlTask
        | }
        """.stripMargin
}
