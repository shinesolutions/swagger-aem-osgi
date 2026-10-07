-module(openapi_com_adobe_cq_social_handlebars_guava_template_cache_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_handlebars_guava_template_cache_impl_properties/0]).

-type openapi_com_adobe_cq_social_handlebars_guava_template_cache_impl_properties() ::
    #{ 'parameter_guava_cache_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'parameter_guava_cache_params' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'parameter_guava_cache_reload' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'parameter_guava_cache_enabled' := ParameterGuavaCacheEnabled,
          'parameter_guava_cache_params' := ParameterGuavaCacheParams,
          'parameter_guava_cache_reload' := ParameterGuavaCacheReload,
          'service_ranking' := ServiceRanking
        }) ->
    #{ 'parameter.guava.cache.enabled' => ParameterGuavaCacheEnabled,
       'parameter.guava.cache.params' => ParameterGuavaCacheParams,
       'parameter.guava.cache.reload' => ParameterGuavaCacheReload,
       'service.ranking' => ServiceRanking
     }.
