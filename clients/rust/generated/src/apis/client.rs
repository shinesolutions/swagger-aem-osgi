use std::rc::Rc;

use hyper;
use super::configuration::Configuration;

pub struct APIClient<C: hyper::client::Connect> {
  configuration: Rc<Configuration<C>>,
  configmgr_api: Box<::apis::ConfigmgrApi>,
}

impl<C: hyper::client::Connect> APIClient<C> {
  pub fn new(configuration: Configuration<C>) -> APIClient<C> {
    let rc = Rc::new(configuration);

    APIClient {
      configuration: rc.clone(),
      configmgr_api: Box::new(::apis::ConfigmgrApiClient::new(rc.clone())),
    }
  }

  pub fn configmgr_api(&self) -> &::apis::ConfigmgrApi{
    self.configmgr_api.as_ref()
  }


}
