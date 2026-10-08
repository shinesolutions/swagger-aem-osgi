
package org.openapitools.client.model


case class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties (
    _slingServletExtensions: Option[ConfigNodePropertyString],
    _slingServletPaths: Option[ConfigNodePropertyString],
    _slingServletMethods: Option[ConfigNodePropertyString]
)
object ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties {
    def toStringBody(var_slingServletExtensions: Object, var_slingServletPaths: Object, var_slingServletMethods: Object) =
        s"""
        | {
        | "slingServletExtensions":$var_slingServletExtensions,"slingServletPaths":$var_slingServletPaths,"slingServletMethods":$var_slingServletMethods
        | }
        """.stripMargin
}
