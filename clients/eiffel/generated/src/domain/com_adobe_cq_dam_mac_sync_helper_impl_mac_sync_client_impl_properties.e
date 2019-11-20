note
 description:"[
		Adobe Experience Manager OSGI config (AEM) API
 		Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
  		OpenAPI spec version: 1.0.0-pre.0
 	    Contact: opensource@shinesolutions.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class COM_ADOBE_CQ_DAM_MAC_SYNC_HELPER_IMPL_MAC_SYNC_CLIENT_IMPL_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    com_adobe_dam_mac_sync_client_so_timeout: detachable CONFIG_NODE_PROPERTY_INTEGER 
      

feature -- Change Element  
 
    set_com_adobe_dam_mac_sync_client_so_timeout (a_name: like com_adobe_dam_mac_sync_client_so_timeout)
        -- Set 'com_adobe_dam_mac_sync_client_so_timeout' with 'a_name'.
      do
        com_adobe_dam_mac_sync_client_so_timeout := a_name
      ensure
        com_adobe_dam_mac_sync_client_so_timeout_set: com_adobe_dam_mac_sync_client_so_timeout = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_ADOBE_CQ_DAM_MAC_SYNC_HELPER_IMPL_MAC_SYNC_CLIENT_IMPL_PROPERTIES%N")
        if attached com_adobe_dam_mac_sync_client_so_timeout as l_com_adobe_dam_mac_sync_client_so_timeout then
          Result.append ("%Ncom_adobe_dam_mac_sync_client_so_timeout:")
          Result.append (l_com_adobe_dam_mac_sync_client_so_timeout.out)
          Result.append ("%N")    
        end  
      end
end

