
/*
 * ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties();
    ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSupportedPaths();

	/*! \brief Set 
	 */
	void setSupportedPaths(ConfigNodePropertyArray supportedPaths);


    private:
    ConfigNodePropertyArray supportedPaths;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties_H_ */
