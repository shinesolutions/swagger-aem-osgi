-module(openapi_com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties/0]).

-type openapi_com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties() ::
    #{ 'event_filter' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'fontmgr_system_font_dir' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'fontmgr_adobe_font_dir' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'fontmgr_customer_font_dir' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'event_filter' := EventFilter,
          'fontmgr_system_font_dir' := FontmgrSystemFontDir,
          'fontmgr_adobe_font_dir' := FontmgrAdobeFontDir,
          'fontmgr_customer_font_dir' := FontmgrCustomerFontDir
        }) ->
    #{ 'event.filter' => EventFilter,
       'fontmgr.system.font.dir' => FontmgrSystemFontDir,
       'fontmgr.adobe.font.dir' => FontmgrAdobeFontDir,
       'fontmgr.customer.font.dir' => FontmgrCustomerFontDir
     }.
