
package org.openapitools.client.model


case class ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties (
    _activeRunModes: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties {
    def toStringBody(var_activeRunModes: Object) =
        s"""
        | {
        | "activeRunModes":$var_activeRunModes
        | }
        """.stripMargin
}
