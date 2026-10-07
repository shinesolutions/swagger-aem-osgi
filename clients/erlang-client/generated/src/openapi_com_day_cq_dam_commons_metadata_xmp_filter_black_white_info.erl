-module(openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_info/0]).

-type openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties:openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties()
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
