-module(openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_info/0]).

-type openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_properties:openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_properties()
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
