-module(openapi_com_day_cq_wcm_designimporter_impl_canvas_builder_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_designimporter_impl_canvas_builder_impl_properties/0]).

-export([openapi_com_day_cq_wcm_designimporter_impl_canvas_builder_impl_properties/1]).

-export_type([openapi_com_day_cq_wcm_designimporter_impl_canvas_builder_impl_properties/0]).

-type openapi_com_day_cq_wcm_designimporter_impl_canvas_builder_impl_properties() ::
  [ {'filepattern', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'build_page_nodes', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'build_client_libs', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'build_canvas_component', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_wcm_designimporter_impl_canvas_builder_impl_properties() ->
    openapi_com_day_cq_wcm_designimporter_impl_canvas_builder_impl_properties([]).

openapi_com_day_cq_wcm_designimporter_impl_canvas_builder_impl_properties(Fields) ->
  Default = [ {'filepattern', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'build.page.nodes', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'build.client.libs', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'build.canvas.component', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

