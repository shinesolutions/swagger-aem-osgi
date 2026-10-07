
package org.openapitools.client.model


case class ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties (
    _cqWcmMsmActionExcludednodetypes: Option[ConfigNodePropertyArray],
    _cqWcmMsmActionExcludedparagraphitems: Option[ConfigNodePropertyArray],
    _cqWcmMsmActionExcludedprops: Option[ConfigNodePropertyArray],
    _cqWcmMsmActionIgnoredMixin: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties {
    def toStringBody(var_cqWcmMsmActionExcludednodetypes: Object, var_cqWcmMsmActionExcludedparagraphitems: Object, var_cqWcmMsmActionExcludedprops: Object, var_cqWcmMsmActionIgnoredMixin: Object) =
        s"""
        | {
        | "cqWcmMsmActionExcludednodetypes":$var_cqWcmMsmActionExcludednodetypes,"cqWcmMsmActionExcludedparagraphitems":$var_cqWcmMsmActionExcludedparagraphitems,"cqWcmMsmActionExcludedprops":$var_cqWcmMsmActionExcludedprops,"cqWcmMsmActionIgnoredMixin":$var_cqWcmMsmActionIgnoredMixin
        | }
        """.stripMargin
}
