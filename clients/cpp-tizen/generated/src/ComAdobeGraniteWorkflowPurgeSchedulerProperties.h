/*
 * ComAdobeGraniteWorkflowPurgeSchedulerProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteWorkflowPurgeSchedulerProperties_H_
#define _ComAdobeGraniteWorkflowPurgeSchedulerProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeGraniteWorkflowPurgeSchedulerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteWorkflowPurgeSchedulerProperties();
	ComAdobeGraniteWorkflowPurgeSchedulerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteWorkflowPurgeSchedulerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getScheduledpurgename();

	/*! \brief Set 
	 */
	void setScheduledpurgename(ConfigNodePropertyString  scheduledpurgename);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getScheduledpurgeworkflowStatus();

	/*! \brief Set 
	 */
	void setScheduledpurgeworkflowStatus(ConfigNodePropertyDropDown  scheduledpurgeworkflowStatus);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getScheduledpurgemodelIds();

	/*! \brief Set 
	 */
	void setScheduledpurgemodelIds(ConfigNodePropertyArray  scheduledpurgemodelIds);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getScheduledpurgedaysold();

	/*! \brief Set 
	 */
	void setScheduledpurgedaysold(ConfigNodePropertyInteger  scheduledpurgedaysold);

private:
	ConfigNodePropertyString scheduledpurgename;
	ConfigNodePropertyDropDown scheduledpurgeworkflowStatus;
	ConfigNodePropertyArray scheduledpurgemodelIds;
	ConfigNodePropertyInteger scheduledpurgedaysold;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteWorkflowPurgeSchedulerProperties_H_ */
