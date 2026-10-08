
/*
 * ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
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

class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties();
    ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getGraniteworkflowinboxsortpropertyName();

	/*! \brief Set 
	 */
	void setGraniteworkflowinboxsortpropertyName(ConfigNodePropertyDropDown graniteworkflowinboxsortpropertyName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGraniteworkflowinboxsortorder();

	/*! \brief Set 
	 */
	void setGraniteworkflowinboxsortorder(ConfigNodePropertyString graniteworkflowinboxsortorder);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqworkflowjobretry();

	/*! \brief Set 
	 */
	void setCqworkflowjobretry(ConfigNodePropertyInteger cqworkflowjobretry);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqworkflowsuperuser();

	/*! \brief Set 
	 */
	void setCqworkflowsuperuser(ConfigNodePropertyArray cqworkflowsuperuser);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getGraniteworkflowinboxQuerySize();

	/*! \brief Set 
	 */
	void setGraniteworkflowinboxQuerySize(ConfigNodePropertyInteger graniteworkflowinboxQuerySize);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGraniteworkflowadminUserGroupFilter();

	/*! \brief Set 
	 */
	void setGraniteworkflowadminUserGroupFilter(ConfigNodePropertyBoolean graniteworkflowadminUserGroupFilter);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGraniteworkflowenforceWorkitemAssigneePermissions();

	/*! \brief Set 
	 */
	void setGraniteworkflowenforceWorkitemAssigneePermissions(ConfigNodePropertyBoolean graniteworkflowenforceWorkitemAssigneePermissions);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGraniteworkflowenforceWorkflowInitiatorPermissions();

	/*! \brief Set 
	 */
	void setGraniteworkflowenforceWorkflowInitiatorPermissions(ConfigNodePropertyBoolean graniteworkflowenforceWorkflowInitiatorPermissions);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGraniteworkflowinjectTenantIdInJobTopics();

	/*! \brief Set 
	 */
	void setGraniteworkflowinjectTenantIdInJobTopics(ConfigNodePropertyBoolean graniteworkflowinjectTenantIdInJobTopics);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getGraniteworkflowmaxPurgeSaveThreshold();

	/*! \brief Set 
	 */
	void setGraniteworkflowmaxPurgeSaveThreshold(ConfigNodePropertyInteger graniteworkflowmaxPurgeSaveThreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getGraniteworkflowmaxPurgeQueryCount();

	/*! \brief Set 
	 */
	void setGraniteworkflowmaxPurgeQueryCount(ConfigNodePropertyInteger graniteworkflowmaxPurgeQueryCount);


    private:
    ConfigNodePropertyDropDown graniteworkflowinboxsortpropertyName;
    ConfigNodePropertyString graniteworkflowinboxsortorder;
    ConfigNodePropertyInteger cqworkflowjobretry;
    ConfigNodePropertyArray cqworkflowsuperuser;
    ConfigNodePropertyInteger graniteworkflowinboxQuerySize;
    ConfigNodePropertyBoolean graniteworkflowadminUserGroupFilter;
    ConfigNodePropertyBoolean graniteworkflowenforceWorkitemAssigneePermissions;
    ConfigNodePropertyBoolean graniteworkflowenforceWorkflowInitiatorPermissions;
    ConfigNodePropertyBoolean graniteworkflowinjectTenantIdInJobTopics;
    ConfigNodePropertyInteger graniteworkflowmaxPurgeSaveThreshold;
    ConfigNodePropertyInteger graniteworkflowmaxPurgeQueryCount;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties_H_ */
