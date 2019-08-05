-module(openapi_com_day_cq_replication_impl_agent_manager_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_replication_impl_agent_manager_impl_properties/0]).

-type openapi_com_day_cq_replication_impl_agent_manager_impl_properties() ::
    #{ 'job_topics' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'serviceUser_target' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'agentProvider_target' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'job_topics' := JobTopics,
          'serviceUser_target' := ServiceUserTarget,
          'agentProvider_target' := AgentProviderTarget
        }) ->
    #{ 'job.topics' => JobTopics,
       'serviceUser.target' => ServiceUserTarget,
       'agentProvider.target' => AgentProviderTarget
     }.
