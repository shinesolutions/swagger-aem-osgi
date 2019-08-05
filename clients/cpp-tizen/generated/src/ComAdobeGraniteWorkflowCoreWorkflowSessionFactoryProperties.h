/*
 * ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties_H_
#define _ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties();
	ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getGraniteworkflowinboxsortpropertyName();

	/*! \brief Set 
	 */
	void setGraniteworkflowinboxsortpropertyName(ConfigNodePropertyDropDown  graniteworkflowinboxsortpropertyName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGraniteworkflowinboxsortorder();

	/*! \brief Set 
	 */
	void setGraniteworkflowinboxsortorder(ConfigNodePropertyString  graniteworkflowinboxsortorder);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqworkflowjobretry();

	/*! \brief Set 
	 */
	void setCqworkflowjobretry(ConfigNodePropertyInteger  cqworkflowjobretry);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqworkflowsuperuser();

	/*! \brief Set 
	 */
	void setCqworkflowsuperuser(ConfigNodePropertyArray  cqworkflowsuperuser);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getGraniteworkflowinboxQuerySize();

	/*! \brief Set 
	 */
	void setGraniteworkflowinboxQuerySize(ConfigNodePropertyInteger  graniteworkflowinboxQuerySize);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGraniteworkflowadminUserGroupFilter();

	/*! \brief Set 
	 */
	void setGraniteworkflowadminUserGroupFilter(ConfigNodePropertyBoolean  graniteworkflowadminUserGroupFilter);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGraniteworkflowenforceWorkitemAssigneePermissions();

	/*! \brief Set 
	 */
	void setGraniteworkflowenforceWorkitemAssigneePermissions(ConfigNodePropertyBoolean  graniteworkflowenforceWorkitemAssigneePermissions);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGraniteworkflowenforceWorkflowInitiatorPermissions();

	/*! \brief Set 
	 */
	void setGraniteworkflowenforceWorkflowInitiatorPermissions(ConfigNodePropertyBoolean  graniteworkflowenforceWorkflowInitiatorPermissions);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGraniteworkflowinjectTenantIdInJobTopics();

	/*! \brief Set 
	 */
	void setGraniteworkflowinjectTenantIdInJobTopics(ConfigNodePropertyBoolean  graniteworkflowinjectTenantIdInJobTopics);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getGraniteworkflowmaxPurgeSaveThreshold();

	/*! \brief Set 
	 */
	void setGraniteworkflowmaxPurgeSaveThreshold(ConfigNodePropertyInteger  graniteworkflowmaxPurgeSaveThreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getGraniteworkflowmaxPurgeQueryCount();

	/*! \brief Set 
	 */
	void setGraniteworkflowmaxPurgeQueryCount(ConfigNodePropertyInteger  graniteworkflowmaxPurgeQueryCount);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties_H_ */
