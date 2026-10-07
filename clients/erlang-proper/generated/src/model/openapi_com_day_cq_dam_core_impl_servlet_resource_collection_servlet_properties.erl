-module(openapi_com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties() ::
  [ {'sling_servlet_resourceTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'sling_servlet_methods', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'sling_servlet_selectors', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'download_config', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'view_selector', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'send_email', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties() ->
    openapi_com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties([]).

openapi_com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties(Fields) ->
  Default = [ {'sling.servlet.resourceTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'sling.servlet.methods', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'sling.servlet.selectors', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'download.config', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'view.selector', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'send_email', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

