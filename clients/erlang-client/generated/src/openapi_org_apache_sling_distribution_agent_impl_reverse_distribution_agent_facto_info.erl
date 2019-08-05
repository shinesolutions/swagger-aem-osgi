-module(openapi_org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto_info/0]).

-type openapi_org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto_properties:openapi_org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto_properties()
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
