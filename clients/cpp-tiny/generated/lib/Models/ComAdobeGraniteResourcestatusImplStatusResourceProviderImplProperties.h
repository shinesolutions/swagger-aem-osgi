
/*
 * ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties_H_


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

class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties();
    ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getProviderroot();

	/*! \brief Set 
	 */
	void setProviderroot(ConfigNodePropertyString providerroot);


    private:
    ConfigNodePropertyString providerroot;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties_H_ */
