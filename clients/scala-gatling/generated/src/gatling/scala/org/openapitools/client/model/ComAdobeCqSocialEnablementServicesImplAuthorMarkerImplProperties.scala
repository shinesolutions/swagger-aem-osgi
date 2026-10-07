
package org.openapitools.client.model


case class ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties (
    _serviceRanking: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties {
    def toStringBody(var_serviceRanking: Object) =
        s"""
        | {
        | "serviceRanking":$var_serviceRanking
        | }
        """.stripMargin
}
