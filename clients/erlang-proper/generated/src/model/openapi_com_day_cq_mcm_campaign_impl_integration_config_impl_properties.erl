-module(openapi_com_day_cq_mcm_campaign_impl_integration_config_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_mcm_campaign_impl_integration_config_impl_properties/0]).

-export([openapi_com_day_cq_mcm_campaign_impl_integration_config_impl_properties/1]).

-export_type([openapi_com_day_cq_mcm_campaign_impl_integration_config_impl_properties/0]).

-type openapi_com_day_cq_mcm_campaign_impl_integration_config_impl_properties() ::
  [ {'aem_mcm_campaign_formConstraints', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'aem_mcm_campaign_publicUrl', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'aem_mcm_campaign_relaxedSSL', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_mcm_campaign_impl_integration_config_impl_properties() ->
    openapi_com_day_cq_mcm_campaign_impl_integration_config_impl_properties([]).

openapi_com_day_cq_mcm_campaign_impl_integration_config_impl_properties(Fields) ->
  Default = [ {'aem.mcm.campaign.formConstraints', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'aem.mcm.campaign.publicUrl', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'aem.mcm.campaign.relaxedSSL', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

