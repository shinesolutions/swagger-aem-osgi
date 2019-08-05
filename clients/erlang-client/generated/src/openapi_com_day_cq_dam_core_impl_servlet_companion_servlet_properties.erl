-module(openapi_com_day_cq_dam_core_impl_servlet_companion_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_companion_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_companion_servlet_properties() ::
    #{ 'More_Info' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'mntoverlaydamguicontentassetsmoreinfo_htmlpath' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'More_Info' := MoreInfo,
          'mntoverlaydamguicontentassetsmoreinfo_htmlpath' := MntoverlaydamguicontentassetsmoreinfoHtmlpath
        }) ->
    #{ 'More Info' => MoreInfo,
       '/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}' => MntoverlaydamguicontentassetsmoreinfoHtmlpath
     }.
