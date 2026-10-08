-module(openapi_org_apache_sling_xss_impl_xss_filter_impl_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_xss_impl_xss_filter_impl_properties/0]).

-export([openapi_org_apache_sling_xss_impl_xss_filter_impl_properties/1]).

-export_type([openapi_org_apache_sling_xss_impl_xss_filter_impl_properties/0]).

-type openapi_org_apache_sling_xss_impl_xss_filter_impl_properties() ::
  [ {'policyPath', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_xss_impl_xss_filter_impl_properties() ->
    openapi_org_apache_sling_xss_impl_xss_filter_impl_properties([]).

openapi_org_apache_sling_xss_impl_xss_filter_impl_properties(Fields) ->
  Default = [ {'policyPath', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

