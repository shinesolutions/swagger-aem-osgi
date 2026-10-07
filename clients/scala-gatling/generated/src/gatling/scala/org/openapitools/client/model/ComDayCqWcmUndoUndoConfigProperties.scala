
package org.openapitools.client.model


case class ComDayCqWcmUndoUndoConfigProperties (
    _cqWcmUndoEnabled: Option[ConfigNodePropertyBoolean],
    _cqWcmUndoPath: Option[ConfigNodePropertyString],
    _cqWcmUndoValidity: Option[ConfigNodePropertyInteger],
    _cqWcmUndoSteps: Option[ConfigNodePropertyInteger],
    _cqWcmUndoPersistence: Option[ConfigNodePropertyString],
    _cqWcmUndoPersistenceMode: Option[ConfigNodePropertyBoolean],
    _cqWcmUndoMarkermode: Option[ConfigNodePropertyString],
    _cqWcmUndoWhitelist: Option[ConfigNodePropertyArray],
    _cqWcmUndoBlacklist: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmUndoUndoConfigProperties {
    def toStringBody(var_cqWcmUndoEnabled: Object, var_cqWcmUndoPath: Object, var_cqWcmUndoValidity: Object, var_cqWcmUndoSteps: Object, var_cqWcmUndoPersistence: Object, var_cqWcmUndoPersistenceMode: Object, var_cqWcmUndoMarkermode: Object, var_cqWcmUndoWhitelist: Object, var_cqWcmUndoBlacklist: Object) =
        s"""
        | {
        | "cqWcmUndoEnabled":$var_cqWcmUndoEnabled,"cqWcmUndoPath":$var_cqWcmUndoPath,"cqWcmUndoValidity":$var_cqWcmUndoValidity,"cqWcmUndoSteps":$var_cqWcmUndoSteps,"cqWcmUndoPersistence":$var_cqWcmUndoPersistence,"cqWcmUndoPersistenceMode":$var_cqWcmUndoPersistenceMode,"cqWcmUndoMarkermode":$var_cqWcmUndoMarkermode,"cqWcmUndoWhitelist":$var_cqWcmUndoWhitelist,"cqWcmUndoBlacklist":$var_cqWcmUndoBlacklist
        | }
        """.stripMargin
}
