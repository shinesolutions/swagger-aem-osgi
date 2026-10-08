
package org.openapitools.client.model


case class ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties (
    _cqWcmMsmActionExcludednodetypes: Option[ConfigNodePropertyArray],
    _cqWcmMsmActionExcludedparagraphitems: Option[ConfigNodePropertyArray],
    _cqWcmMsmActionExcludedprops: Option[ConfigNodePropertyArray],
    _cqWcmMsmImplActionsPagemovePropReferenceUpdate: Option[ConfigNodePropertyBoolean]
)
object ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties {
    def toStringBody(var_cqWcmMsmActionExcludednodetypes: Object, var_cqWcmMsmActionExcludedparagraphitems: Object, var_cqWcmMsmActionExcludedprops: Object, var_cqWcmMsmImplActionsPagemovePropReferenceUpdate: Object) =
        s"""
        | {
        | "cqWcmMsmActionExcludednodetypes":$var_cqWcmMsmActionExcludednodetypes,"cqWcmMsmActionExcludedparagraphitems":$var_cqWcmMsmActionExcludedparagraphitems,"cqWcmMsmActionExcludedprops":$var_cqWcmMsmActionExcludedprops,"cqWcmMsmImplActionsPagemovePropReferenceUpdate":$var_cqWcmMsmImplActionsPagemovePropReferenceUpdate
        | }
        """.stripMargin
}
