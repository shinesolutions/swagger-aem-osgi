-module(openapi_org_apache_sling_security_impl_content_disposition_filter_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_security_impl_content_disposition_filter_properties/0]).

-export([openapi_org_apache_sling_security_impl_content_disposition_filter_properties/1]).

-export_type([openapi_org_apache_sling_security_impl_content_disposition_filter_properties/0]).

-type openapi_org_apache_sling_security_impl_content_disposition_filter_properties() ::
  [ {'sling_content_disposition_paths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'sling_content_disposition_excluded_paths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'sling_content_disposition_all_paths', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_security_impl_content_disposition_filter_properties() ->
    openapi_org_apache_sling_security_impl_content_disposition_filter_properties([]).

openapi_org_apache_sling_security_impl_content_disposition_filter_properties(Fields) ->
  Default = [ {'sling.content.disposition.paths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'sling.content.disposition.excluded.paths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'sling.content.disposition.all.paths', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

