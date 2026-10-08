
package org.openapitools.client.model


case class ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties (
    _liverelationshipmgrRelationsconfigDefault: Option[ConfigNodePropertyString]
)
object ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties {
    def toStringBody(var_liverelationshipmgrRelationsconfigDefault: Object) =
        s"""
        | {
        | "liverelationshipmgrRelationsconfigDefault":$var_liverelationshipmgrRelationsconfigDefault
        | }
        """.stripMargin
}
