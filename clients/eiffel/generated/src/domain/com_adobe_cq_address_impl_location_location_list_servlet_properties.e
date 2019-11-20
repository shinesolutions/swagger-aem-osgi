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
class COM_ADOBE_CQ_ADDRESS_IMPL_LOCATION_LOCATION_LIST_SERVLET_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    cq_address_location_default_max_results: detachable CONFIG_NODE_PROPERTY_INTEGER 
      

feature -- Change Element  
 
    set_cq_address_location_default_max_results (a_name: like cq_address_location_default_max_results)
        -- Set 'cq_address_location_default_max_results' with 'a_name'.
      do
        cq_address_location_default_max_results := a_name
      ensure
        cq_address_location_default_max_results_set: cq_address_location_default_max_results = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_ADOBE_CQ_ADDRESS_IMPL_LOCATION_LOCATION_LIST_SERVLET_PROPERTIES%N")
        if attached cq_address_location_default_max_results as l_cq_address_location_default_max_results then
          Result.append ("%Ncq_address_location_default_max_results:")
          Result.append (l_cq_address_location_default_max_results.out)
          Result.append ("%N")    
        end  
      end
end

