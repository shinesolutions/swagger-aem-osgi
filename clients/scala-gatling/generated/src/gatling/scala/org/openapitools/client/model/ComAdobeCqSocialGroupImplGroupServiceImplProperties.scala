
package org.openapitools.client.model


case class ComAdobeCqSocialGroupImplGroupServiceImplProperties (
    _maxWaitTime: Option[ConfigNodePropertyInteger],
    _minWaitBetweenRetries: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialGroupImplGroupServiceImplProperties {
    def toStringBody(var_maxWaitTime: Object, var_minWaitBetweenRetries: Object) =
        s"""
        | {
        | "maxWaitTime":$var_maxWaitTime,"minWaitBetweenRetries":$var_minWaitBetweenRetries
        | }
        """.stripMargin
}
