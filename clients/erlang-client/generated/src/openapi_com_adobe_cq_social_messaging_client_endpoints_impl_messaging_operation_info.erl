-module(openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_info/0]).

-type openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties:openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties()
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
