-module(openapi_com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties/0]).

-export([openapi_com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties/1]).

-export_type([openapi_com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties/0]).

-type openapi_com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties() ::
  [ {'dtm_staging_ip_whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'dtm_production_ip_whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties() ->
    openapi_com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties([]).

openapi_com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_properties(Fields) ->
  Default = [ {'dtm.staging.ip.whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'dtm.production.ip.whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

