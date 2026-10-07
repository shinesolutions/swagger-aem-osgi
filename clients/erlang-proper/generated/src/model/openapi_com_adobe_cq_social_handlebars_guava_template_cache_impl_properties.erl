-module(openapi_com_adobe_cq_social_handlebars_guava_template_cache_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_handlebars_guava_template_cache_impl_properties/0]).

-export([openapi_com_adobe_cq_social_handlebars_guava_template_cache_impl_properties/1]).

-export_type([openapi_com_adobe_cq_social_handlebars_guava_template_cache_impl_properties/0]).

-type openapi_com_adobe_cq_social_handlebars_guava_template_cache_impl_properties() ::
  [ {'parameter_guava_cache_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'parameter_guava_cache_params', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'parameter_guava_cache_reload', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_handlebars_guava_template_cache_impl_properties() ->
    openapi_com_adobe_cq_social_handlebars_guava_template_cache_impl_properties([]).

openapi_com_adobe_cq_social_handlebars_guava_template_cache_impl_properties(Fields) ->
  Default = [ {'parameter.guava.cache.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'parameter.guava.cache.params', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'parameter.guava.cache.reload', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

