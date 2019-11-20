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
pub struct ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties {
  #[serde(rename = "com.adobe.aem.screens.impl.remote.request_timeout")]
  com_adobe_aem_screens_impl_remote_request_timeout: Option<::models::ConfigNodePropertyInteger>
}

impl ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties {
  pub fn new() -> ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties {
    ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties {
      com_adobe_aem_screens_impl_remote_request_timeout: None
    }
  }

  pub fn set_com_adobe_aem_screens_impl_remote_request_timeout(&mut self, com_adobe_aem_screens_impl_remote_request_timeout: ::models::ConfigNodePropertyInteger) {
    self.com_adobe_aem_screens_impl_remote_request_timeout = Some(com_adobe_aem_screens_impl_remote_request_timeout);
  }

  pub fn with_com_adobe_aem_screens_impl_remote_request_timeout(mut self, com_adobe_aem_screens_impl_remote_request_timeout: ::models::ConfigNodePropertyInteger) -> ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties {
    self.com_adobe_aem_screens_impl_remote_request_timeout = Some(com_adobe_aem_screens_impl_remote_request_timeout);
    self
  }

  pub fn com_adobe_aem_screens_impl_remote_request_timeout(&self) -> Option<&::models::ConfigNodePropertyInteger> {
    self.com_adobe_aem_screens_impl_remote_request_timeout.as_ref()
  }

  pub fn reset_com_adobe_aem_screens_impl_remote_request_timeout(&mut self) {
    self.com_adobe_aem_screens_impl_remote_request_timeout = None;
  }

}


