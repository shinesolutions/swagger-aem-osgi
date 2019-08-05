-module(openapi_com_day_cq_wcm_foundation_impl_page_redirect_servlet_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_foundation_impl_page_redirect_servlet_info/0]).

-type openapi_com_day_cq_wcm_foundation_impl_page_redirect_servlet_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_wcm_foundation_impl_page_redirect_servlet_properties:openapi_com_day_cq_wcm_foundation_impl_page_redirect_servlet_properties()
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
