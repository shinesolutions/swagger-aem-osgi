
package org.openapitools.client.model


case class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties (
    _cqSocialContentFragmentsServicesEnabled: Option[ConfigNodePropertyBoolean],
    _cqSocialContentFragmentsServicesWaitTimeSeconds: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties {
    def toStringBody(var_cqSocialContentFragmentsServicesEnabled: Object, var_cqSocialContentFragmentsServicesWaitTimeSeconds: Object) =
        s"""
        | {
        | "cqSocialContentFragmentsServicesEnabled":$var_cqSocialContentFragmentsServicesEnabled,"cqSocialContentFragmentsServicesWaitTimeSeconds":$var_cqSocialContentFragmentsServicesWaitTimeSeconds
        | }
        """.stripMargin
}
