
package org.openapitools.client.model


case class ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties (
    _cqWcmMsmActionExcludednodetypes: Option[ConfigNodePropertyArray],
    _cqWcmMsmActionExcludedparagraphitems: Option[ConfigNodePropertyArray],
    _cqWcmMsmActionExcludedprops: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties {
    def toStringBody(var_cqWcmMsmActionExcludednodetypes: Object, var_cqWcmMsmActionExcludedparagraphitems: Object, var_cqWcmMsmActionExcludedprops: Object) =
        s"""
        | {
        | "cqWcmMsmActionExcludednodetypes":$var_cqWcmMsmActionExcludednodetypes,"cqWcmMsmActionExcludedparagraphitems":$var_cqWcmMsmActionExcludedparagraphitems,"cqWcmMsmActionExcludedprops":$var_cqWcmMsmActionExcludedprops
        | }
        """.stripMargin
}
