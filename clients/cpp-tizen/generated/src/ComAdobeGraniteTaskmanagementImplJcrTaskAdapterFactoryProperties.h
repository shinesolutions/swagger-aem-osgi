/*
 * ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties_H_
#define _ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties_H_


#include <string>
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

class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties();
	ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties();

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

private:
	ConfigNodePropertyString adaptercondition;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties_H_ */
