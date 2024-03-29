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
class COM_DAY_CQ_REPLICATION_IMPL_CONTENT_DURBO_BINARY_LESS_CONTENT_BUILDER_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    binary_threshold: detachable CONFIG_NODE_PROPERTY_INTEGER 
      

feature -- Change Element  
 
    set_binary_threshold (a_name: like binary_threshold)
        -- Set 'binary_threshold' with 'a_name'.
      do
        binary_threshold := a_name
      ensure
        binary_threshold_set: binary_threshold = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_DAY_CQ_REPLICATION_IMPL_CONTENT_DURBO_BINARY_LESS_CONTENT_BUILDER_PROPERTIES%N")
        if attached binary_threshold as l_binary_threshold then
          Result.append ("%Nbinary_threshold:")
          Result.append (l_binary_threshold.out)
          Result.append ("%N")    
        end  
      end
end


