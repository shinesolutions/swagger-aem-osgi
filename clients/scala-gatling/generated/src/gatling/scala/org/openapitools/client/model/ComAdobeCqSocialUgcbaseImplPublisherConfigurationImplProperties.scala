
package org.openapitools.client.model


case class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties (
    _isPrimaryPublisher: Option[ConfigNodePropertyBoolean]
)
object ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties {
    def toStringBody(var_isPrimaryPublisher: Object) =
        s"""
        | {
        | "isPrimaryPublisher":$var_isPrimaryPublisher
        | }
        """.stripMargin
}
