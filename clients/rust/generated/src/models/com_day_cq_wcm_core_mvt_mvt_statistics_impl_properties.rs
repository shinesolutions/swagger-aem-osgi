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
pub struct ComDayCqWcmCoreMvtMvtStatisticsImplProperties {
  #[serde(rename = "mvtstatistics.trackingurl")]
  mvtstatistics_trackingurl: Option<::models::ConfigNodePropertyString>
}

impl ComDayCqWcmCoreMvtMvtStatisticsImplProperties {
  pub fn new() -> ComDayCqWcmCoreMvtMvtStatisticsImplProperties {
    ComDayCqWcmCoreMvtMvtStatisticsImplProperties {
      mvtstatistics_trackingurl: None
    }
  }

  pub fn set_mvtstatistics_trackingurl(&mut self, mvtstatistics_trackingurl: ::models::ConfigNodePropertyString) {
    self.mvtstatistics_trackingurl = Some(mvtstatistics_trackingurl);
  }

  pub fn with_mvtstatistics_trackingurl(mut self, mvtstatistics_trackingurl: ::models::ConfigNodePropertyString) -> ComDayCqWcmCoreMvtMvtStatisticsImplProperties {
    self.mvtstatistics_trackingurl = Some(mvtstatistics_trackingurl);
    self
  }

  pub fn mvtstatistics_trackingurl(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.mvtstatistics_trackingurl.as_ref()
  }

  pub fn reset_mvtstatistics_trackingurl(&mut self) {
    self.mvtstatistics_trackingurl = None;
  }

}


