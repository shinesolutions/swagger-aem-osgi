-module(openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_info/0]).

-type openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties:openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties()
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
