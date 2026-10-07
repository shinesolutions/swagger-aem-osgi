-module(openapi_com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties/0]).

-type openapi_com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_properties() ::
    #{ 'isPrimaryPublisher' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'isPrimaryPublisher' := IsPrimaryPublisher
        }) ->
    #{ 'isPrimaryPublisher' => IsPrimaryPublisher
     }.
