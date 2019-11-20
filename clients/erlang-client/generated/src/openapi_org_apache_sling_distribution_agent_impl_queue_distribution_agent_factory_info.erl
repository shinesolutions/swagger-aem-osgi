-module(openapi_org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_info/0]).

-type openapi_org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties:openapi_org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.