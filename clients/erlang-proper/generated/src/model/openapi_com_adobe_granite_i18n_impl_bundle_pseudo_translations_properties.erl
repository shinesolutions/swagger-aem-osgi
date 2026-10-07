-module(openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties/0]).

-export([openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties/1]).

-export_type([openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties/0]).

-type openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties() ::
  [ {'pseudo_patterns', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties() ->
    openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties([]).

openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties(Fields) ->
  Default = [ {'pseudo.patterns', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

