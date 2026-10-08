
/*
 * ComAdobeGraniteWorkflowPurgeSchedulerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteWorkflowPurgeSchedulerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteWorkflowPurgeSchedulerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteWorkflowPurgeSchedulerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteWorkflowPurgeSchedulerProperties();
    ComAdobeGraniteWorkflowPurgeSchedulerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteWorkflowPurgeSchedulerProperties();


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
	ConfigNodePropertyDropDown getScheduledpurgeworkflowStatus();

	/*! \brief Set 
	 */
	void setScheduledpurgeworkflowStatus(ConfigNodePropertyDropDown scheduledpurgeworkflowStatus);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getScheduledpurgemodelIds();

	/*! \brief Set 
	 */
	void setScheduledpurgemodelIds(ConfigNodePropertyArray scheduledpurgemodelIds);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getScheduledpurgedaysold();

	/*! \brief Set 
	 */
	void setScheduledpurgedaysold(ConfigNodePropertyInteger scheduledpurgedaysold);


    private:
    ConfigNodePropertyString scheduledpurgename;
    ConfigNodePropertyDropDown scheduledpurgeworkflowStatus;
    ConfigNodePropertyArray scheduledpurgemodelIds;
    ConfigNodePropertyInteger scheduledpurgedaysold;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteWorkflowPurgeSchedulerProperties_H_ */
