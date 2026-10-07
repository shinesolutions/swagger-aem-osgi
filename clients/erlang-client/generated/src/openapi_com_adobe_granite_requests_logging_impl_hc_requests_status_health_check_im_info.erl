-module(openapi_com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im_info/0]).

-type openapi_com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im_properties:openapi_com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im_properties()
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
