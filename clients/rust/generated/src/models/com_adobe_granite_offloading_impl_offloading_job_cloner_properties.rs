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
pub struct ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties {
  #[serde(rename = "offloading.jobcloner.enabled")]
  offloading_jobcloner_enabled: Option<::models::ConfigNodePropertyBoolean>
}

impl ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties {
  pub fn new() -> ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties {
    ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties {
      offloading_jobcloner_enabled: None
    }
  }

  pub fn set_offloading_jobcloner_enabled(&mut self, offloading_jobcloner_enabled: ::models::ConfigNodePropertyBoolean) {
    self.offloading_jobcloner_enabled = Some(offloading_jobcloner_enabled);
  }

  pub fn with_offloading_jobcloner_enabled(mut self, offloading_jobcloner_enabled: ::models::ConfigNodePropertyBoolean) -> ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties {
    self.offloading_jobcloner_enabled = Some(offloading_jobcloner_enabled);
    self
  }

  pub fn offloading_jobcloner_enabled(&self) -> Option<&::models::ConfigNodePropertyBoolean> {
    self.offloading_jobcloner_enabled.as_ref()
  }

  pub fn reset_offloading_jobcloner_enabled(&mut self) {
    self.offloading_jobcloner_enabled = None;
  }

}


