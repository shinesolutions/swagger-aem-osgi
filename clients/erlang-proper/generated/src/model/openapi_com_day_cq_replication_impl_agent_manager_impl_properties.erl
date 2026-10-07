-module(openapi_com_day_cq_replication_impl_agent_manager_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_replication_impl_agent_manager_impl_properties/0]).

-export([openapi_com_day_cq_replication_impl_agent_manager_impl_properties/1]).

-export_type([openapi_com_day_cq_replication_impl_agent_manager_impl_properties/0]).

-type openapi_com_day_cq_replication_impl_agent_manager_impl_properties() ::
  [ {'job_topics', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'serviceUser_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'agentProvider_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_replication_impl_agent_manager_impl_properties() ->
    openapi_com_day_cq_replication_impl_agent_manager_impl_properties([]).

openapi_com_day_cq_replication_impl_agent_manager_impl_properties(Fields) ->
  Default = [ {'job.topics', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'serviceUser.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'agentProvider.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

