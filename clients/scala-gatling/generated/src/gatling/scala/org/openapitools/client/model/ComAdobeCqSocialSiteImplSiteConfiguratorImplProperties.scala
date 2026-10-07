
package org.openapitools.client.model


case class ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties (
    _componentsUsingTags: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties {
    def toStringBody(var_componentsUsingTags: Object) =
        s"""
        | {
        | "componentsUsingTags":$var_componentsUsingTags
        | }
        """.stripMargin
}
