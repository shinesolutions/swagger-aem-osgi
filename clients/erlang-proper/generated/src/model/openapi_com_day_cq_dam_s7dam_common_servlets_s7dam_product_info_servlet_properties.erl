-module(openapi_com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet_properties/0]).

-export([openapi_com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet_properties/1]).

-export_type([openapi_com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet_properties/0]).

-type openapi_com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet_properties() ::
  [ {'sling_servlet_paths', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'sling_servlet_methods', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet_properties() ->
    openapi_com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet_properties([]).

openapi_com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet_properties(Fields) ->
  Default = [ {'sling.servlet.paths', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'sling.servlet.methods', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

