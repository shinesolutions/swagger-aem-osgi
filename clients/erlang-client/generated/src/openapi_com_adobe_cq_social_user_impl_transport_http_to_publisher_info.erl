-module(openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_info/0]).

-type openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_properties:openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_properties()
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
