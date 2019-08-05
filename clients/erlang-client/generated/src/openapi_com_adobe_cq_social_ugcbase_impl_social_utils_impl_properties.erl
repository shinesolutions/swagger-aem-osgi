-module(openapi_com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties/0]).

-type openapi_com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties() ::
    #{ 'legacyCloudUGCPathMapping' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'legacyCloudUGCPathMapping' := LegacyCloudUGCPathMapping
        }) ->
    #{ 'legacyCloudUGCPathMapping' => LegacyCloudUGCPathMapping
     }.
