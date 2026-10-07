-module(openapi_com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties/0]).

-export([openapi_com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties/1]).

-export_type([openapi_com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties/0]).

-type openapi_com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties() ::
  [ {'cq_social_console_analytics_components', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties() ->
    openapi_com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties([]).

openapi_com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties(Fields) ->
  Default = [ {'cq.social.console.analytics.components', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

