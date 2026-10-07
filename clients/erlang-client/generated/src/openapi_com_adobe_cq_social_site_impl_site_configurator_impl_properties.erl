-module(openapi_com_adobe_cq_social_site_impl_site_configurator_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_site_impl_site_configurator_impl_properties/0]).

-type openapi_com_adobe_cq_social_site_impl_site_configurator_impl_properties() ::
    #{ 'componentsUsingTags' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'componentsUsingTags' := ComponentsUsingTags
        }) ->
    #{ 'componentsUsingTags' => ComponentsUsingTags
     }.
