-module(openapi_com_day_cq_wcm_core_impl_utils_default_page_name_validator_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_utils_default_page_name_validator_info/0]).

-type openapi_com_day_cq_wcm_core_impl_utils_default_page_name_validator_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties:openapi_com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties()
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
