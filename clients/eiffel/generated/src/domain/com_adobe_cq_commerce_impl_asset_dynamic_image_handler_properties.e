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
class COM_ADOBE_CQ_COMMERCE_IMPL_ASSET_DYNAMIC_IMAGE_HANDLER_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    cq_commerce_asset_handler_active: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      
    cq_commerce_asset_handler_name: detachable CONFIG_NODE_PROPERTY_STRING 
      

feature -- Change Element  
 
    set_cq_commerce_asset_handler_active (a_name: like cq_commerce_asset_handler_active)
        -- Set 'cq_commerce_asset_handler_active' with 'a_name'.
      do
        cq_commerce_asset_handler_active := a_name
      ensure
        cq_commerce_asset_handler_active_set: cq_commerce_asset_handler_active = a_name		
      end

    set_cq_commerce_asset_handler_name (a_name: like cq_commerce_asset_handler_name)
        -- Set 'cq_commerce_asset_handler_name' with 'a_name'.
      do
        cq_commerce_asset_handler_name := a_name
      ensure
        cq_commerce_asset_handler_name_set: cq_commerce_asset_handler_name = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_ADOBE_CQ_COMMERCE_IMPL_ASSET_DYNAMIC_IMAGE_HANDLER_PROPERTIES%N")
        if attached cq_commerce_asset_handler_active as l_cq_commerce_asset_handler_active then
          Result.append ("%Ncq_commerce_asset_handler_active:")
          Result.append (l_cq_commerce_asset_handler_active.out)
          Result.append ("%N")    
        end  
        if attached cq_commerce_asset_handler_name as l_cq_commerce_asset_handler_name then
          Result.append ("%Ncq_commerce_asset_handler_name:")
          Result.append (l_cq_commerce_asset_handler_name.out)
          Result.append ("%N")    
        end  
      end
end

