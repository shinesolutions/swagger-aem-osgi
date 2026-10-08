
/*
 * ComDayCqDamCoreImplDamEventPurgeServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplDamEventPurgeServiceProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplDamEventPurgeServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplDamEventPurgeServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplDamEventPurgeServiceProperties();
    ComDayCqDamCoreImplDamEventPurgeServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplDamEventPurgeServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulerexpression();

	/*! \brief Set 
	 */
	void setSchedulerexpression(ConfigNodePropertyString schedulerexpression);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxSavedActivities();

	/*! \brief Set 
	 */
	void setMaxSavedActivities(ConfigNodePropertyInteger maxSavedActivities);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSaveInterval();

	/*! \brief Set 
	 */
	void setSaveInterval(ConfigNodePropertyInteger saveInterval);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableActivityPurge();

	/*! \brief Set 
	 */
	void setEnableActivityPurge(ConfigNodePropertyBoolean enableActivityPurge);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getEventTypes();

	/*! \brief Set 
	 */
	void setEventTypes(ConfigNodePropertyDropDown eventTypes);


    private:
    ConfigNodePropertyString schedulerexpression;
    ConfigNodePropertyInteger maxSavedActivities;
    ConfigNodePropertyInteger saveInterval;
    ConfigNodePropertyBoolean enableActivityPurge;
    ConfigNodePropertyDropDown eventTypes;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplDamEventPurgeServiceProperties_H_ */
