/*
 * ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties_H_
#define _ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties();
	ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getWorkflowpackageinfoproviderfilter();

	/*! \brief Set 
	 */
	void setWorkflowpackageinfoproviderfilter(ConfigNodePropertyArray  workflowpackageinfoproviderfilter);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getWorkflowpackageinfoproviderfilterrootpath();

	/*! \brief Set 
	 */
	void setWorkflowpackageinfoproviderfilterrootpath(ConfigNodePropertyString  workflowpackageinfoproviderfilterrootpath);

private:
	ConfigNodePropertyArray workflowpackageinfoproviderfilter;
	ConfigNodePropertyString workflowpackageinfoproviderfilterrootpath;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties_H_ */
