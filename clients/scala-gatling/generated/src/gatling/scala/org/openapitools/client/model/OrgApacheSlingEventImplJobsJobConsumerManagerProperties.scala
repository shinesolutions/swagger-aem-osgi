
package org.openapitools.client.model


case class OrgApacheSlingEventImplJobsJobConsumerManagerProperties (
    _orgApacheSlingInstallerConfigurationPersist: Option[ConfigNodePropertyBoolean],
    _jobConsumermanagerWhitelist: Option[ConfigNodePropertyArray],
    _jobConsumermanagerBlacklist: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingEventImplJobsJobConsumerManagerProperties {
    def toStringBody(var_orgApacheSlingInstallerConfigurationPersist: Object, var_jobConsumermanagerWhitelist: Object, var_jobConsumermanagerBlacklist: Object) =
        s"""
        | {
        | "orgApacheSlingInstallerConfigurationPersist":$var_orgApacheSlingInstallerConfigurationPersist,"jobConsumermanagerWhitelist":$var_jobConsumermanagerWhitelist,"jobConsumermanagerBlacklist":$var_jobConsumermanagerBlacklist
        | }
        """.stripMargin
}
