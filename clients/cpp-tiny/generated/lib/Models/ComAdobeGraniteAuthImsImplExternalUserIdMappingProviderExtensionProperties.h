
/*
 * ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties();
    ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderid();

	/*! \brief Set 
	 */
	void setOauthproviderid(ConfigNodePropertyString oauthproviderid);


    private:
    ConfigNodePropertyString oauthproviderid;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties_H_ */
