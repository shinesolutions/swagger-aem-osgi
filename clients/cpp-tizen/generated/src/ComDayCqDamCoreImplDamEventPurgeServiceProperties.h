/*
 * ComDayCqDamCoreImplDamEventPurgeServiceProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplDamEventPurgeServiceProperties_H_
#define _ComDayCqDamCoreImplDamEventPurgeServiceProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
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

class ComDayCqDamCoreImplDamEventPurgeServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplDamEventPurgeServiceProperties();
	ComDayCqDamCoreImplDamEventPurgeServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplDamEventPurgeServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulerexpression();

	/*! \brief Set 
	 */
	void setSchedulerexpression(ConfigNodePropertyString  schedulerexpression);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxSavedActivities();

	/*! \brief Set 
	 */
	void setMaxSavedActivities(ConfigNodePropertyInteger  maxSavedActivities);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSaveInterval();

	/*! \brief Set 
	 */
	void setSaveInterval(ConfigNodePropertyInteger  saveInterval);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableActivityPurge();

	/*! \brief Set 
	 */
	void setEnableActivityPurge(ConfigNodePropertyBoolean  enableActivityPurge);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getEventTypes();

	/*! \brief Set 
	 */
	void setEventTypes(ConfigNodePropertyDropDown  eventTypes);

private:
	ConfigNodePropertyString schedulerexpression;
	ConfigNodePropertyInteger maxSavedActivities;
	ConfigNodePropertyInteger saveInterval;
	ConfigNodePropertyBoolean enableActivityPurge;
	ConfigNodePropertyDropDown eventTypes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplDamEventPurgeServiceProperties_H_ */
