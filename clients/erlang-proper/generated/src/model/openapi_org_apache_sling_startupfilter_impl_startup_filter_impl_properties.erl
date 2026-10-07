-module(openapi_org_apache_sling_startupfilter_impl_startup_filter_impl_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_startupfilter_impl_startup_filter_impl_properties/0]).

-export([openapi_org_apache_sling_startupfilter_impl_startup_filter_impl_properties/1]).

-export_type([openapi_org_apache_sling_startupfilter_impl_startup_filter_impl_properties/0]).

-type openapi_org_apache_sling_startupfilter_impl_startup_filter_impl_properties() ::
  [ {'active_by_default', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'default_message', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_startupfilter_impl_startup_filter_impl_properties() ->
    openapi_org_apache_sling_startupfilter_impl_startup_filter_impl_properties([]).

openapi_org_apache_sling_startupfilter_impl_startup_filter_impl_properties(Fields) ->
  Default = [ {'active.by.default', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'default.message', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

