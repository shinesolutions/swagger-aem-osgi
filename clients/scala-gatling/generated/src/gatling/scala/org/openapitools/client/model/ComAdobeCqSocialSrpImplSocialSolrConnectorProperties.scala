
package org.openapitools.client.model


case class ComAdobeCqSocialSrpImplSocialSolrConnectorProperties (
    _srpType: Option[ConfigNodePropertyString]
)
object ComAdobeCqSocialSrpImplSocialSolrConnectorProperties {
    def toStringBody(var_srpType: Object) =
        s"""
        | {
        | "srpType":$var_srpType
        | }
        """.stripMargin
}
