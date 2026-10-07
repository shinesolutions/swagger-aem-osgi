/*
 * ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties_H_
#define _ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties();
	ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPurgeCompleted();

	/*! \brief Set 
	 */
	void setPurgeCompleted(ConfigNodePropertyBoolean  purgeCompleted);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCompletedAge();

	/*! \brief Set 
	 */
	void setCompletedAge(ConfigNodePropertyInteger  completedAge);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPurgeActive();

	/*! \brief Set 
	 */
	void setPurgeActive(ConfigNodePropertyBoolean  purgeActive);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getActiveAge();

	/*! \brief Set 
	 */
	void setActiveAge(ConfigNodePropertyInteger  activeAge);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSaveThreshold();

	/*! \brief Set 
	 */
	void setSaveThreshold(ConfigNodePropertyInteger  saveThreshold);

private:
	ConfigNodePropertyBoolean purgeCompleted;
	ConfigNodePropertyInteger completedAge;
	ConfigNodePropertyBoolean purgeActive;
	ConfigNodePropertyInteger activeAge;
	ConfigNodePropertyInteger saveThreshold;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties_H_ */
