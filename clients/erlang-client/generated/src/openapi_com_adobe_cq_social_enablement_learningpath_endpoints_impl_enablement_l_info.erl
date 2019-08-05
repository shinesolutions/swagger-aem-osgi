-module(openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_info/0]).

-type openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_properties:openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_properties()
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
