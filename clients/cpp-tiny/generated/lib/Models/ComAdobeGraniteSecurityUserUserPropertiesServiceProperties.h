
/*
 * ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteSecurityUserUserPropertiesServiceProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteSecurityUserUserPropertiesServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteSecurityUserUserPropertiesServiceProperties();
    ComAdobeGraniteSecurityUserUserPropertiesServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteSecurityUserUserPropertiesServiceProperties();


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
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGraniteuserpropertiesnodetypes();

	/*! \brief Set 
	 */
	void setGraniteuserpropertiesnodetypes(ConfigNodePropertyArray graniteuserpropertiesnodetypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGraniteuserpropertiesresourcetypes();

	/*! \brief Set 
	 */
	void setGraniteuserpropertiesresourcetypes(ConfigNodePropertyArray graniteuserpropertiesresourcetypes);


    private:
    ConfigNodePropertyString adaptercondition;
    ConfigNodePropertyArray graniteuserpropertiesnodetypes;
    ConfigNodePropertyArray graniteuserpropertiesresourcetypes;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteSecurityUserUserPropertiesServiceProperties_H_ */
