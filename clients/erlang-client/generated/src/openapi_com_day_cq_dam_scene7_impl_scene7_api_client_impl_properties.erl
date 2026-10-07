-module(openapi_com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties/0]).

-type openapi_com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties() ::
    #{ 'cq_dam_scene7_apiclient_recordsperpage_nofilter_name' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_scene7_apiclient_recordsperpage_withfilter_name' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cq_dam_scene7_apiclient_recordsperpage_nofilter_name' := CqDamScene7ApiclientRecordsperpageNofilterName,
          'cq_dam_scene7_apiclient_recordsperpage_withfilter_name' := CqDamScene7ApiclientRecordsperpageWithfilterName
        }) ->
    #{ 'cq.dam.scene7.apiclient.recordsperpage.nofilter.name' => CqDamScene7ApiclientRecordsperpageNofilterName,
       'cq.dam.scene7.apiclient.recordsperpage.withfilter.name' => CqDamScene7ApiclientRecordsperpageWithfilterName
     }.
