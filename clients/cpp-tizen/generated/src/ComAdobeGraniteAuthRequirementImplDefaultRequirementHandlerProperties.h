/*
 * ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties_H_
#define _ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties();
	ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSupportedPaths();

	/*! \brief Set 
	 */
	void setSupportedPaths(ConfigNodePropertyArray  supportedPaths);

private:
	ConfigNodePropertyArray supportedPaths;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties_H_ */
