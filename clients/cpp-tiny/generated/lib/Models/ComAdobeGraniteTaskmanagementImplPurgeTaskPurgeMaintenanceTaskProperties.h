
/*
 * ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties();
    ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPurgeCompleted();

	/*! \brief Set 
	 */
	void setPurgeCompleted(ConfigNodePropertyBoolean purgeCompleted);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCompletedAge();

	/*! \brief Set 
	 */
	void setCompletedAge(ConfigNodePropertyInteger completedAge);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPurgeActive();

	/*! \brief Set 
	 */
	void setPurgeActive(ConfigNodePropertyBoolean purgeActive);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getActiveAge();

	/*! \brief Set 
	 */
	void setActiveAge(ConfigNodePropertyInteger activeAge);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSaveThreshold();

	/*! \brief Set 
	 */
	void setSaveThreshold(ConfigNodePropertyInteger saveThreshold);


    private:
    ConfigNodePropertyBoolean purgeCompleted;
    ConfigNodePropertyInteger completedAge;
    ConfigNodePropertyBoolean purgeActive;
    ConfigNodePropertyInteger activeAge;
    ConfigNodePropertyInteger saveThreshold;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties_H_ */
