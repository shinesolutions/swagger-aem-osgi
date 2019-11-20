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
pub struct ComAdobeGraniteWorkflowCoreJobJobHandlerProperties {
  #[serde(rename = "job.topics")]
  job_topics: Option<::models::ConfigNodePropertyArray>,
  #[serde(rename = "allow.self.process.termination")]
  allow_self_process_termination: Option<::models::ConfigNodePropertyBoolean>
}

impl ComAdobeGraniteWorkflowCoreJobJobHandlerProperties {
  pub fn new() -> ComAdobeGraniteWorkflowCoreJobJobHandlerProperties {
    ComAdobeGraniteWorkflowCoreJobJobHandlerProperties {
      job_topics: None,
      allow_self_process_termination: None
    }
  }

  pub fn set_job_topics(&mut self, job_topics: ::models::ConfigNodePropertyArray) {
    self.job_topics = Some(job_topics);
  }

  pub fn with_job_topics(mut self, job_topics: ::models::ConfigNodePropertyArray) -> ComAdobeGraniteWorkflowCoreJobJobHandlerProperties {
    self.job_topics = Some(job_topics);
    self
  }

  pub fn job_topics(&self) -> Option<&::models::ConfigNodePropertyArray> {
    self.job_topics.as_ref()
  }

  pub fn reset_job_topics(&mut self) {
    self.job_topics = None;
  }

  pub fn set_allow_self_process_termination(&mut self, allow_self_process_termination: ::models::ConfigNodePropertyBoolean) {
    self.allow_self_process_termination = Some(allow_self_process_termination);
  }

  pub fn with_allow_self_process_termination(mut self, allow_self_process_termination: ::models::ConfigNodePropertyBoolean) -> ComAdobeGraniteWorkflowCoreJobJobHandlerProperties {
    self.allow_self_process_termination = Some(allow_self_process_termination);
    self
  }

  pub fn allow_self_process_termination(&self) -> Option<&::models::ConfigNodePropertyBoolean> {
    self.allow_self_process_termination.as_ref()
  }

  pub fn reset_allow_self_process_termination(&mut self) {
    self.allow_self_process_termination = None;
  }

}


