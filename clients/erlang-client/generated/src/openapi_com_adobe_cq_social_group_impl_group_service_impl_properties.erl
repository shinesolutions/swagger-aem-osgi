-module(openapi_com_adobe_cq_social_group_impl_group_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_group_impl_group_service_impl_properties/0]).

-type openapi_com_adobe_cq_social_group_impl_group_service_impl_properties() ::
    #{ 'maxWaitTime' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'minWaitBetweenRetries' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'maxWaitTime' := MaxWaitTime,
          'minWaitBetweenRetries' := MinWaitBetweenRetries
        }) ->
    #{ 'maxWaitTime' => MaxWaitTime,
       'minWaitBetweenRetries' => MinWaitBetweenRetries
     }.
