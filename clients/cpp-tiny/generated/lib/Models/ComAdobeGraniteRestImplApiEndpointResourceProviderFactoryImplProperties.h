
/*
 * ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties_H_


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

class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties();
    ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getProviderroots();

	/*! \brief Set 
	 */
	void setProviderroots(ConfigNodePropertyString providerroots);


    private:
    ConfigNodePropertyString providerroots;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties_H_ */
