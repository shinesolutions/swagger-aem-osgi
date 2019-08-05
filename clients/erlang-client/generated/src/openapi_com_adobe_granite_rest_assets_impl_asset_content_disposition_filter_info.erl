-module(openapi_com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_info/0]).

-type openapi_com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties:openapi_com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties()
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
