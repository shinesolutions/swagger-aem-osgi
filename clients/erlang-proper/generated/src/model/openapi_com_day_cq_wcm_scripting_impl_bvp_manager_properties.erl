-module(openapi_com_day_cq_wcm_scripting_impl_bvp_manager_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_scripting_impl_bvp_manager_properties/0]).

-export([openapi_com_day_cq_wcm_scripting_impl_bvp_manager_properties/1]).

-export_type([openapi_com_day_cq_wcm_scripting_impl_bvp_manager_properties/0]).

-type openapi_com_day_cq_wcm_scripting_impl_bvp_manager_properties() ::
  [ {'com_day_cq_wcm_scripting_bvp_script_engines', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_scripting_impl_bvp_manager_properties() ->
    openapi_com_day_cq_wcm_scripting_impl_bvp_manager_properties([]).

openapi_com_day_cq_wcm_scripting_impl_bvp_manager_properties(Fields) ->
  Default = [ {'com.day.cq.wcm.scripting.bvp.script.engines', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

