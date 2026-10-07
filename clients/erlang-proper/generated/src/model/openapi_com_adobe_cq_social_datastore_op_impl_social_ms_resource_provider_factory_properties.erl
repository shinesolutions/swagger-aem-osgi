-module(openapi_com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties/0]).

-export([openapi_com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties/1]).

-export_type([openapi_com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties/0]).

-type openapi_com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties() ::
  [ {'solr_zk_timeout', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'solr_commit', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cache_on', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'concurrency_level', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cache_start_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cache_ttl', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cache_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties() ->
    openapi_com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties([]).

openapi_com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties(Fields) ->
  Default = [ {'solr.zk.timeout', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'solr.commit', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cache.on', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'concurrency.level', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cache.start.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cache.ttl', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cache.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

