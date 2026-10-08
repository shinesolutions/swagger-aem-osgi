-module(openapi_com_day_cq_wcm_core_impl_language_manager_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_language_manager_impl_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_language_manager_impl_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_language_manager_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_language_manager_impl_properties() ::
  [ {'langmgr_list_path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'langmgr_country_default', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_core_impl_language_manager_impl_properties() ->
    openapi_com_day_cq_wcm_core_impl_language_manager_impl_properties([]).

openapi_com_day_cq_wcm_core_impl_language_manager_impl_properties(Fields) ->
  Default = [ {'langmgr.list.path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'langmgr.country.default', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

