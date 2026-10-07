-module(openapi_org_apache_sling_i18n_impl_i18_n_filter_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_i18n_impl_i18_n_filter_properties/0]).

-export([openapi_org_apache_sling_i18n_impl_i18_n_filter_properties/1]).

-export_type([openapi_org_apache_sling_i18n_impl_i18_n_filter_properties/0]).

-type openapi_org_apache_sling_i18n_impl_i18_n_filter_properties() ::
  [ {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'sling_filter_scope', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_i18n_impl_i18_n_filter_properties() ->
    openapi_org_apache_sling_i18n_impl_i18_n_filter_properties([]).

openapi_org_apache_sling_i18n_impl_i18_n_filter_properties(Fields) ->
  Default = [ {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'sling.filter.scope', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

