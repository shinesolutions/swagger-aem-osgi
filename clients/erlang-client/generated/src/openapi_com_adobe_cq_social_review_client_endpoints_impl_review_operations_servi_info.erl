-module(openapi_com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi_info/0]).

-type openapi_com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi_properties:openapi_com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi_properties()
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
