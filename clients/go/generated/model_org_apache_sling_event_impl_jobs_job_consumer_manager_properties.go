/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * API version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type OrgApacheSlingEventImplJobsJobConsumerManagerProperties struct {
	OrgApacheSlingInstallerConfigurationPersist ConfigNodePropertyBoolean `json:"org.apache.sling.installer.configuration.persist,omitempty"`
	JobConsumermanagerWhitelist ConfigNodePropertyArray `json:"job.consumermanager.whitelist,omitempty"`
	JobConsumermanagerBlacklist ConfigNodePropertyArray `json:"job.consumermanager.blacklist,omitempty"`
}