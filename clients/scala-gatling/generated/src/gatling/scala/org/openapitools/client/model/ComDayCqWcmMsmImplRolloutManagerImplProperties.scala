
package org.openapitools.client.model


case class ComDayCqWcmMsmImplRolloutManagerImplProperties (
    _eventFilter: Option[ConfigNodePropertyString],
    _rolloutmgrExcludedpropsDefault: Option[ConfigNodePropertyArray],
    _rolloutmgrExcludedparagraphpropsDefault: Option[ConfigNodePropertyArray],
    _rolloutmgrExcludednodetypesDefault: Option[ConfigNodePropertyArray],
    _rolloutmgrThreadpoolMaxsize: Option[ConfigNodePropertyInteger],
    _rolloutmgrThreadpoolMaxshutdowntime: Option[ConfigNodePropertyInteger],
    _rolloutmgrThreadpoolPriority: Option[ConfigNodePropertyDropDown],
    _rolloutmgrCommitSize: Option[ConfigNodePropertyInteger],
    _rolloutmgrConflicthandlingEnabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqWcmMsmImplRolloutManagerImplProperties {
    def toStringBody(var_eventFilter: Object, var_rolloutmgrExcludedpropsDefault: Object, var_rolloutmgrExcludedparagraphpropsDefault: Object, var_rolloutmgrExcludednodetypesDefault: Object, var_rolloutmgrThreadpoolMaxsize: Object, var_rolloutmgrThreadpoolMaxshutdowntime: Object, var_rolloutmgrThreadpoolPriority: Object, var_rolloutmgrCommitSize: Object, var_rolloutmgrConflicthandlingEnabled: Object) =
        s"""
        | {
        | "eventFilter":$var_eventFilter,"rolloutmgrExcludedpropsDefault":$var_rolloutmgrExcludedpropsDefault,"rolloutmgrExcludedparagraphpropsDefault":$var_rolloutmgrExcludedparagraphpropsDefault,"rolloutmgrExcludednodetypesDefault":$var_rolloutmgrExcludednodetypesDefault,"rolloutmgrThreadpoolMaxsize":$var_rolloutmgrThreadpoolMaxsize,"rolloutmgrThreadpoolMaxshutdowntime":$var_rolloutmgrThreadpoolMaxshutdowntime,"rolloutmgrThreadpoolPriority":$var_rolloutmgrThreadpoolPriority,"rolloutmgrCommitSize":$var_rolloutmgrCommitSize,"rolloutmgrConflicthandlingEnabled":$var_rolloutmgrConflicthandlingEnabled
        | }
        """.stripMargin
}
