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
class COM_ADOBE_CQ_WCM_MOBILE_QRCODE_SERVLET_QR_CODE_IMAGE_GENERATOR_PROPERTIES 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    cq_wcm_qrcode_servlet_whitelist: detachable CONFIG_NODE_PROPERTY_ARRAY 
      

feature -- Change Element  
 
    set_cq_wcm_qrcode_servlet_whitelist (a_name: like cq_wcm_qrcode_servlet_whitelist)
        -- Set 'cq_wcm_qrcode_servlet_whitelist' with 'a_name'.
      do
        cq_wcm_qrcode_servlet_whitelist := a_name
      ensure
        cq_wcm_qrcode_servlet_whitelist_set: cq_wcm_qrcode_servlet_whitelist = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass COM_ADOBE_CQ_WCM_MOBILE_QRCODE_SERVLET_QR_CODE_IMAGE_GENERATOR_PROPERTIES%N")
        if attached cq_wcm_qrcode_servlet_whitelist as l_cq_wcm_qrcode_servlet_whitelist then
          Result.append ("%Ncq_wcm_qrcode_servlet_whitelist:")
          Result.append (l_cq_wcm_qrcode_servlet_whitelist.out)
          Result.append ("%N")    
        end  
      end
end

