-module(openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties/0]).

-export([openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties/1]).

-export_type([openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties/0]).

-type openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties() ::
  [ {'TcpPort', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'AllowRemoteAccess', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'MaxRenderRgnPixels', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'MaxMessageSize', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'RandomAccessUrlTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'WorkerThreads', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties() ->
    openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties([]).

openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties(Fields) ->
  Default = [ {'TcpPort', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'AllowRemoteAccess', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'MaxRenderRgnPixels', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'MaxMessageSize', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'RandomAccessUrlTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'WorkerThreads', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

