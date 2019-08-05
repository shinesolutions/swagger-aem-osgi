-module(openapi_com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties/0]).

-type openapi_com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties() ::
    #{ 'dtm_staging_ip_whitelist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'dtm_production_ip_whitelist' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'dtm_staging_ip_whitelist' := DtmStagingIpWhitelist,
          'dtm_production_ip_whitelist' := DtmProductionIpWhitelist
        }) ->
    #{ 'dtm.staging.ip.whitelist' => DtmStagingIpWhitelist,
       'dtm.production.ip.whitelist' => DtmProductionIpWhitelist
     }.
