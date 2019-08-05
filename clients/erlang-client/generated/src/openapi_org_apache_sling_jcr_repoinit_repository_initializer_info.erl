-module(openapi_org_apache_sling_jcr_repoinit_repository_initializer_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_repoinit_repository_initializer_info/0]).

-type openapi_org_apache_sling_jcr_repoinit_repository_initializer_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_jcr_repoinit_repository_initializer_properties:openapi_org_apache_sling_jcr_repoinit_repository_initializer_properties()
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
