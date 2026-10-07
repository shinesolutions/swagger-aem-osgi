
package org.openapitools.client.model


case class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties (
    _linkExpiredPrefix: Option[ConfigNodePropertyString],
    _linkExpiredRemove: Option[ConfigNodePropertyBoolean],
    _linkExpiredSuffix: Option[ConfigNodePropertyString],
    _linkInvalidPrefix: Option[ConfigNodePropertyString],
    _linkInvalidRemove: Option[ConfigNodePropertyBoolean],
    _linkInvalidSuffix: Option[ConfigNodePropertyString],
    _linkPredatedPrefix: Option[ConfigNodePropertyString],
    _linkPredatedRemove: Option[ConfigNodePropertyBoolean],
    _linkPredatedSuffix: Option[ConfigNodePropertyString],
    _linkWcmmodes: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties {
    def toStringBody(var_linkExpiredPrefix: Object, var_linkExpiredRemove: Object, var_linkExpiredSuffix: Object, var_linkInvalidPrefix: Object, var_linkInvalidRemove: Object, var_linkInvalidSuffix: Object, var_linkPredatedPrefix: Object, var_linkPredatedRemove: Object, var_linkPredatedSuffix: Object, var_linkWcmmodes: Object) =
        s"""
        | {
        | "linkExpiredPrefix":$var_linkExpiredPrefix,"linkExpiredRemove":$var_linkExpiredRemove,"linkExpiredSuffix":$var_linkExpiredSuffix,"linkInvalidPrefix":$var_linkInvalidPrefix,"linkInvalidRemove":$var_linkInvalidRemove,"linkInvalidSuffix":$var_linkInvalidSuffix,"linkPredatedPrefix":$var_linkPredatedPrefix,"linkPredatedRemove":$var_linkPredatedRemove,"linkPredatedSuffix":$var_linkPredatedSuffix,"linkWcmmodes":$var_linkWcmmodes
        | }
        """.stripMargin
}
