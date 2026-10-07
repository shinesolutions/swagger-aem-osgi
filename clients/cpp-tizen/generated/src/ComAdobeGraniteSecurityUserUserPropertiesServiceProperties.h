/*
 * ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteSecurityUserUserPropertiesServiceProperties_H_
#define _ComAdobeGraniteSecurityUserUserPropertiesServiceProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteSecurityUserUserPropertiesServiceProperties();
	ComAdobeGraniteSecurityUserUserPropertiesServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteSecurityUserUserPropertiesServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getAdaptercondition();

	/*! \brief Set 
	 */
	void setAdaptercondition(ConfigNodePropertyString  adaptercondition);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGraniteuserpropertiesnodetypes();

	/*! \brief Set 
	 */
	void setGraniteuserpropertiesnodetypes(ConfigNodePropertyArray  graniteuserpropertiesnodetypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGraniteuserpropertiesresourcetypes();

	/*! \brief Set 
	 */
	void setGraniteuserpropertiesresourcetypes(ConfigNodePropertyArray  graniteuserpropertiesresourcetypes);

private:
	ConfigNodePropertyString adaptercondition;
	ConfigNodePropertyArray graniteuserpropertiesnodetypes;
	ConfigNodePropertyArray graniteuserpropertiesresourcetypes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteSecurityUserUserPropertiesServiceProperties_H_ */
