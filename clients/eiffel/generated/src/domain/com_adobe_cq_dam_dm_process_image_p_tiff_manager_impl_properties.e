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
class COM_ADOBE_CQ_DAM_DM_PROCESS_IMAGE_P_TIFF_MANAGER_IMPL_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    max_memory: detachable CONFIG_NODE_PROPERTY_INTEGER 
      

feature -- Change Element  
 
    set_max_memory (a_name: like max_memory)
        -- Set 'max_memory' with 'a_name'.
      do
        max_memory := a_name
      ensure
        max_memory_set: max_memory = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_ADOBE_CQ_DAM_DM_PROCESS_IMAGE_P_TIFF_MANAGER_IMPL_PROPERTIES%N")
        if attached max_memory as l_max_memory then
          Result.append ("%Nmax_memory:")
          Result.append (l_max_memory.out)
          Result.append ("%N")    
        end  
      end
end

