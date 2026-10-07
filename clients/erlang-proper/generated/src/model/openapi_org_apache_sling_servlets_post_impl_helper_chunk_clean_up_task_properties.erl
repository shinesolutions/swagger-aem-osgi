-module(openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties/0]).

-export([openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties/1]).

-export_type([openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties/0]).

-type openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties() ::
  [ {'scheduler_expression', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'scheduler_concurrent', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'chunk_cleanup_age', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties() ->
    openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties([]).

openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties(Fields) ->
  Default = [ {'scheduler.expression', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'scheduler.concurrent', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'chunk.cleanup.age', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

