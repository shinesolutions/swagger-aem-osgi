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
pub struct ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties {
  #[serde(rename = "com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath")]
  com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path: Option<::models::ConfigNodePropertyArray>,
  #[serde(rename = "com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency")]
  com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency: Option<::models::ConfigNodePropertyString>
}

impl ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties {
  pub fn new() -> ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties {
    ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties {
      com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path: None,
      com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency: None
    }
  }

  pub fn set_com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path(&mut self, com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path: ::models::ConfigNodePropertyArray) {
    self.com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path = Some(com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path);
  }

  pub fn with_com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path(mut self, com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path: ::models::ConfigNodePropertyArray) -> ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties {
    self.com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path = Some(com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path);
    self
  }

  pub fn com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path(&self) -> Option<&::models::ConfigNodePropertyArray> {
    self.com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path.as_ref()
  }

  pub fn reset_com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path(&mut self) {
    self.com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path = None;
  }

  pub fn set_com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency(&mut self, com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency: ::models::ConfigNodePropertyString) {
    self.com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency = Some(com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency);
  }

  pub fn with_com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency(mut self, com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency: ::models::ConfigNodePropertyString) -> ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties {
    self.com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency = Some(com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency);
    self
  }

  pub fn com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency.as_ref()
  }

  pub fn reset_com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency(&mut self) {
    self.com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency = None;
  }

}


