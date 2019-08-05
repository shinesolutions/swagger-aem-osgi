/*
 * ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties_H_
#define _ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties_H_


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

class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties();
	ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties();

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
	ConfigNodePropertyArray getTaskmanageradmingroups();

	/*! \brief Set 
	 */
	void setTaskmanageradmingroups(ConfigNodePropertyArray  taskmanageradmingroups);

private:
	ConfigNodePropertyString adaptercondition;
	ConfigNodePropertyArray taskmanageradmingroups;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties_H_ */
