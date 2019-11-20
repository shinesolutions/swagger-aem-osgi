/* 
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://openapi-generator.tech
 */


#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties {
  #[serde(rename = "pre-upgrade.maintenance.tasks")]
  pre_upgrade_maintenance_tasks: Option<::models::ConfigNodePropertyArray>,
  #[serde(rename = "pre-upgrade.hc.tags")]
  pre_upgrade_hc_tags: Option<::models::ConfigNodePropertyArray>
}

impl ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties {
  pub fn new() -> ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties {
    ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties {
      pre_upgrade_maintenance_tasks: None,
      pre_upgrade_hc_tags: None
    }
  }

  pub fn set_pre_upgrade_maintenance_tasks(&mut self, pre_upgrade_maintenance_tasks: ::models::ConfigNodePropertyArray) {
    self.pre_upgrade_maintenance_tasks = Some(pre_upgrade_maintenance_tasks);
  }

  pub fn with_pre_upgrade_maintenance_tasks(mut self, pre_upgrade_maintenance_tasks: ::models::ConfigNodePropertyArray) -> ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties {
    self.pre_upgrade_maintenance_tasks = Some(pre_upgrade_maintenance_tasks);
    self
  }

  pub fn pre_upgrade_maintenance_tasks(&self) -> Option<&::models::ConfigNodePropertyArray> {
    self.pre_upgrade_maintenance_tasks.as_ref()
  }

  pub fn reset_pre_upgrade_maintenance_tasks(&mut self) {
    self.pre_upgrade_maintenance_tasks = None;
  }

  pub fn set_pre_upgrade_hc_tags(&mut self, pre_upgrade_hc_tags: ::models::ConfigNodePropertyArray) {
    self.pre_upgrade_hc_tags = Some(pre_upgrade_hc_tags);
  }

  pub fn with_pre_upgrade_hc_tags(mut self, pre_upgrade_hc_tags: ::models::ConfigNodePropertyArray) -> ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties {
    self.pre_upgrade_hc_tags = Some(pre_upgrade_hc_tags);
    self
  }

  pub fn pre_upgrade_hc_tags(&self) -> Option<&::models::ConfigNodePropertyArray> {
    self.pre_upgrade_hc_tags.as_ref()
  }

  pub fn reset_pre_upgrade_hc_tags(&mut self) {
    self.pre_upgrade_hc_tags = None;
  }

}


