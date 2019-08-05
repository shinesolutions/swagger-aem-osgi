/*
 * ComAdobeGraniteWorkflowCoreWorkflowConfigProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteWorkflowCoreWorkflowConfigProperties_H_
#define _ComAdobeGraniteWorkflowCoreWorkflowConfigProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteWorkflowCoreWorkflowConfigProperties();
	ComAdobeGraniteWorkflowCoreWorkflowConfigProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteWorkflowCoreWorkflowConfigProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqworkflowconfigworkflowpackagesrootpath();

	/*! \brief Set 
	 */
	void setCqworkflowconfigworkflowpackagesrootpath(ConfigNodePropertyArray  cqworkflowconfigworkflowpackagesrootpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqworkflowconfigworkflowprocesslegacymode();

	/*! \brief Set 
	 */
	void setCqworkflowconfigworkflowprocesslegacymode(ConfigNodePropertyBoolean  cqworkflowconfigworkflowprocesslegacymode);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqworkflowconfigallowlocking();

	/*! \brief Set 
	 */
	void setCqworkflowconfigallowlocking(ConfigNodePropertyBoolean  cqworkflowconfigallowlocking);

private:
	ConfigNodePropertyArray cqworkflowconfigworkflowpackagesrootpath;
	ConfigNodePropertyBoolean cqworkflowconfigworkflowprocesslegacymode;
	ConfigNodePropertyBoolean cqworkflowconfigallowlocking;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteWorkflowCoreWorkflowConfigProperties_H_ */
