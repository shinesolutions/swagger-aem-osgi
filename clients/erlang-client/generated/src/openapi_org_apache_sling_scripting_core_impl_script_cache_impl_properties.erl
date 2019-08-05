-module(openapi_org_apache_sling_scripting_core_impl_script_cache_impl_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_scripting_core_impl_script_cache_impl_properties/0]).

-type openapi_org_apache_sling_scripting_core_impl_script_cache_impl_properties() ::
    #{ 'org_apache_sling_scripting_cache_size' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'org_apache_sling_scripting_cache_additional_extensions' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'org_apache_sling_scripting_cache_size' := OrgApacheSlingScriptingCacheSize,
          'org_apache_sling_scripting_cache_additional_extensions' := OrgApacheSlingScriptingCacheAdditionalExtensions
        }) ->
    #{ 'org.apache.sling.scripting.cache.size' => OrgApacheSlingScriptingCacheSize,
       'org.apache.sling.scripting.cache.additional_extensions' => OrgApacheSlingScriptingCacheAdditionalExtensions
     }.
