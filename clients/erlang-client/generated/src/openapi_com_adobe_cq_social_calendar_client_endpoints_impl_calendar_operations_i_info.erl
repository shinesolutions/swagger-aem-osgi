-module(openapi_com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i_info/0]).

-type openapi_com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i_properties:openapi_com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i_properties()
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
