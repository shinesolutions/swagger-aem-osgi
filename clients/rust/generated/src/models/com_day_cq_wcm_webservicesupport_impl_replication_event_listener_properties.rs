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
pub struct ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties {
  #[serde(rename = "Flush agents")]
  flush_agents: Option<::models::ConfigNodePropertyArray>
}

impl ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties {
  pub fn new() -> ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties {
    ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties {
      flush_agents: None
    }
  }

  pub fn set_flush_agents(&mut self, flush_agents: ::models::ConfigNodePropertyArray) {
    self.flush_agents = Some(flush_agents);
  }

  pub fn with_flush_agents(mut self, flush_agents: ::models::ConfigNodePropertyArray) -> ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties {
    self.flush_agents = Some(flush_agents);
    self
  }

  pub fn flush_agents(&self) -> Option<&::models::ConfigNodePropertyArray> {
    self.flush_agents.as_ref()
  }

  pub fn reset_flush_agents(&mut self) {
    self.flush_agents = None;
  }

}


