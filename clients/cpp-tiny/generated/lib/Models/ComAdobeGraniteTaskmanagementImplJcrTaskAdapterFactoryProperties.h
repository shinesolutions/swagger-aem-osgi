
/*
 * ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties_H_


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

class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties();
    ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getAdaptercondition();

	/*! \brief Set 
	 */
	void setAdaptercondition(ConfigNodePropertyString adaptercondition);


    private:
    ConfigNodePropertyString adaptercondition;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties_H_ */
