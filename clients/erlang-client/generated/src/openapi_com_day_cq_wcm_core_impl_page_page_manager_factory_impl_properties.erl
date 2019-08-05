-module(openapi_com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties() ::
    #{ 'illegalCharMapping' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'pageSubTreeActivationCheck' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'illegalCharMapping' := IllegalCharMapping,
          'pageSubTreeActivationCheck' := PageSubTreeActivationCheck
        }) ->
    #{ 'illegalCharMapping' => IllegalCharMapping,
       'pageSubTreeActivationCheck' => PageSubTreeActivationCheck
     }.
