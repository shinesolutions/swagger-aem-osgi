-module(openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_properties/0]).

-type openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_properties() ::
    #{ 'isMemberCheck' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'isMemberCheck' := IsMemberCheck
        }) ->
    #{ 'isMemberCheck' => IsMemberCheck
     }.
