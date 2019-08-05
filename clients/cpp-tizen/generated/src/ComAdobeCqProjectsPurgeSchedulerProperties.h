/*
 * ComAdobeCqProjectsPurgeSchedulerProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqProjectsPurgeSchedulerProperties_H_
#define _ComAdobeCqProjectsPurgeSchedulerProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeCqProjectsPurgeSchedulerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqProjectsPurgeSchedulerProperties();
	ComAdobeCqProjectsPurgeSchedulerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqProjectsPurgeSchedulerProperties();

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
	ConfigNodePropertyBoolean getScheduledpurgepurgeActive();

	/*! \brief Set 
	 */
	void setScheduledpurgepurgeActive(ConfigNodePropertyBoolean  scheduledpurgepurgeActive);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getScheduledpurgetemplates();

	/*! \brief Set 
	 */
	void setScheduledpurgetemplates(ConfigNodePropertyArray  scheduledpurgetemplates);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getScheduledpurgepurgeGroups();

	/*! \brief Set 
	 */
	void setScheduledpurgepurgeGroups(ConfigNodePropertyBoolean  scheduledpurgepurgeGroups);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getScheduledpurgepurgeAssets();

	/*! \brief Set 
	 */
	void setScheduledpurgepurgeAssets(ConfigNodePropertyBoolean  scheduledpurgepurgeAssets);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getScheduledpurgeterminateRunningWorkflows();

	/*! \brief Set 
	 */
	void setScheduledpurgeterminateRunningWorkflows(ConfigNodePropertyBoolean  scheduledpurgeterminateRunningWorkflows);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getScheduledpurgedaysold();

	/*! \brief Set 
	 */
	void setScheduledpurgedaysold(ConfigNodePropertyInteger  scheduledpurgedaysold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getScheduledpurgesaveThreshold();

	/*! \brief Set 
	 */
	void setScheduledpurgesaveThreshold(ConfigNodePropertyInteger  scheduledpurgesaveThreshold);

private:
	ConfigNodePropertyString scheduledpurgename;
	ConfigNodePropertyBoolean scheduledpurgepurgeActive;
	ConfigNodePropertyArray scheduledpurgetemplates;
	ConfigNodePropertyBoolean scheduledpurgepurgeGroups;
	ConfigNodePropertyBoolean scheduledpurgepurgeAssets;
	ConfigNodePropertyBoolean scheduledpurgeterminateRunningWorkflows;
	ConfigNodePropertyInteger scheduledpurgedaysold;
	ConfigNodePropertyInteger scheduledpurgesaveThreshold;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqProjectsPurgeSchedulerProperties_H_ */
