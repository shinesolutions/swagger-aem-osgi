
package org.openapitools.client.model


case class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties (
    _cqWcmMsmActionExcludednodetypes: Option[ConfigNodePropertyArray],
    _cqWcmMsmActionExcludedparagraphitems: Option[ConfigNodePropertyArray],
    _cqWcmMsmActionExcludedprops: Option[ConfigNodePropertyArray],
    _cqWcmMsmImplActionReferencesupdatePropUpdateNested: Option[ConfigNodePropertyBoolean]
)
object ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties {
    def toStringBody(var_cqWcmMsmActionExcludednodetypes: Object, var_cqWcmMsmActionExcludedparagraphitems: Object, var_cqWcmMsmActionExcludedprops: Object, var_cqWcmMsmImplActionReferencesupdatePropUpdateNested: Object) =
        s"""
        | {
        | "cqWcmMsmActionExcludednodetypes":$var_cqWcmMsmActionExcludednodetypes,"cqWcmMsmActionExcludedparagraphitems":$var_cqWcmMsmActionExcludedparagraphitems,"cqWcmMsmActionExcludedprops":$var_cqWcmMsmActionExcludedprops,"cqWcmMsmImplActionReferencesupdatePropUpdateNested":$var_cqWcmMsmImplActionReferencesupdatePropUpdateNested
        | }
        """.stripMargin
}
