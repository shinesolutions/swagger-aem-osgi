-module(openapi_com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties() ::
  [ {'nonValidChars', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties() ->
    openapi_com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties([]).

openapi_com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties(Fields) ->
  Default = [ {'nonValidChars', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

