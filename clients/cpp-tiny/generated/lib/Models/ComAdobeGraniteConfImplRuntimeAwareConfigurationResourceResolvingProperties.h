
/*
 * ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties();
    ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFallbackPaths();

	/*! \brief Set 
	 */
	void setFallbackPaths(ConfigNodePropertyArray fallbackPaths);


    private:
    ConfigNodePropertyBoolean enabled;
    ConfigNodePropertyArray fallbackPaths;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties_H_ */
