-module(openapi_org_apache_sling_commons_mime_internal_mime_type_service_impl_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_commons_mime_internal_mime_type_service_impl_properties/0]).

-type openapi_org_apache_sling_commons_mime_internal_mime_type_service_impl_properties() ::
    #{ 'mime_types' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'mime_types' := MimeTypes
        }) ->
    #{ 'mime.types' => MimeTypes
     }.
