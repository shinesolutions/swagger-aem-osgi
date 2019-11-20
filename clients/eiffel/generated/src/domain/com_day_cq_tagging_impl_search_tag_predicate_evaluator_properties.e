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
class COM_DAY_CQ_TAGGING_IMPL_SEARCH_TAG_PREDICATE_EVALUATOR_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    ignore_path: detachable CONFIG_NODE_PROPERTY_BOOLEAN 
      

feature -- Change Element  
 
    set_ignore_path (a_name: like ignore_path)
        -- Set 'ignore_path' with 'a_name'.
      do
        ignore_path := a_name
      ensure
        ignore_path_set: ignore_path = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_DAY_CQ_TAGGING_IMPL_SEARCH_TAG_PREDICATE_EVALUATOR_PROPERTIES%N")
        if attached ignore_path as l_ignore_path then
          Result.append ("%Nignore_path:")
          Result.append (l_ignore_path.out)
          Result.append ("%N")    
        end  
      end
end

