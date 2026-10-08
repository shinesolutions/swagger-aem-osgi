-module(openapi_com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties/0]).

-export([openapi_com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties/1]).

-export_type([openapi_com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties/0]).

-type openapi_com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties() ::
  [ {'filepattern', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'device_groups', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'build_page_nodes', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'build_client_libs', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'build_canvas_component', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties() ->
    openapi_com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties([]).

openapi_com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_properties(Fields) ->
  Default = [ {'filepattern', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'device.groups', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'build.page.nodes', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'build.client.libs', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'build.canvas.component', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

