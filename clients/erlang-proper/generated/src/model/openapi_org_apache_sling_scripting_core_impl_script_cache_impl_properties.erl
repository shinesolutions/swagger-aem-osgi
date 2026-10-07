-module(openapi_org_apache_sling_scripting_core_impl_script_cache_impl_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_scripting_core_impl_script_cache_impl_properties/0]).

-export([openapi_org_apache_sling_scripting_core_impl_script_cache_impl_properties/1]).

-export_type([openapi_org_apache_sling_scripting_core_impl_script_cache_impl_properties/0]).

-type openapi_org_apache_sling_scripting_core_impl_script_cache_impl_properties() ::
  [ {'org_apache_sling_scripting_cache_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_sling_scripting_cache_additional_extensions', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_scripting_core_impl_script_cache_impl_properties() ->
    openapi_org_apache_sling_scripting_core_impl_script_cache_impl_properties([]).

openapi_org_apache_sling_scripting_core_impl_script_cache_impl_properties(Fields) ->
  Default = [ {'org.apache.sling.scripting.cache.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.sling.scripting.cache.additional_extensions', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

