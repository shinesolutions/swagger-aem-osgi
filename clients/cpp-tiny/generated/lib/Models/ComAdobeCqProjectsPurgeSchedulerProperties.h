
/*
 * ComAdobeCqProjectsPurgeSchedulerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqProjectsPurgeSchedulerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqProjectsPurgeSchedulerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqProjectsPurgeSchedulerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqProjectsPurgeSchedulerProperties();
    ComAdobeCqProjectsPurgeSchedulerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqProjectsPurgeSchedulerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getScheduledpurgename();

	/*! \brief Set 
	 */
	void setScheduledpurgename(ConfigNodePropertyString scheduledpurgename);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getScheduledpurgepurgeActive();

	/*! \brief Set 
	 */
	void setScheduledpurgepurgeActive(ConfigNodePropertyBoolean scheduledpurgepurgeActive);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getScheduledpurgetemplates();

	/*! \brief Set 
	 */
	void setScheduledpurgetemplates(ConfigNodePropertyArray scheduledpurgetemplates);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getScheduledpurgepurgeGroups();

	/*! \brief Set 
	 */
	void setScheduledpurgepurgeGroups(ConfigNodePropertyBoolean scheduledpurgepurgeGroups);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getScheduledpurgepurgeAssets();

	/*! \brief Set 
	 */
	void setScheduledpurgepurgeAssets(ConfigNodePropertyBoolean scheduledpurgepurgeAssets);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getScheduledpurgeterminateRunningWorkflows();

	/*! \brief Set 
	 */
	void setScheduledpurgeterminateRunningWorkflows(ConfigNodePropertyBoolean scheduledpurgeterminateRunningWorkflows);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getScheduledpurgedaysold();

	/*! \brief Set 
	 */
	void setScheduledpurgedaysold(ConfigNodePropertyInteger scheduledpurgedaysold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getScheduledpurgesaveThreshold();

	/*! \brief Set 
	 */
	void setScheduledpurgesaveThreshold(ConfigNodePropertyInteger scheduledpurgesaveThreshold);


    private:
    ConfigNodePropertyString scheduledpurgename;
    ConfigNodePropertyBoolean scheduledpurgepurgeActive;
    ConfigNodePropertyArray scheduledpurgetemplates;
    ConfigNodePropertyBoolean scheduledpurgepurgeGroups;
    ConfigNodePropertyBoolean scheduledpurgepurgeAssets;
    ConfigNodePropertyBoolean scheduledpurgeterminateRunningWorkflows;
    ConfigNodePropertyInteger scheduledpurgedaysold;
    ConfigNodePropertyInteger scheduledpurgesaveThreshold;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqProjectsPurgeSchedulerProperties_H_ */
