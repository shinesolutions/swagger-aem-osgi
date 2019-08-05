-module(openapi_com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties/0]).

-type openapi_com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties() ::
    #{ 'mime_allowEmpty' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'mime_allowed' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'mime_allowEmpty' := MimeAllowEmpty,
          'mime_allowed' := MimeAllowed
        }) ->
    #{ 'mime.allowEmpty' => MimeAllowEmpty,
       'mime.allowed' => MimeAllowed
     }.
