-module(openapi_com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties/0]).

-export([openapi_com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties/1]).

-export_type([openapi_com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties/0]).

-type openapi_com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties() ::
  [ {'omnisearch_suggestion_requiretext_min', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'omnisearch_suggestion_spellcheck_require', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties() ->
    openapi_com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties([]).

openapi_com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties(Fields) ->
  Default = [ {'omnisearch.suggestion.requiretext.min', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'omnisearch.suggestion.spellcheck.require', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

