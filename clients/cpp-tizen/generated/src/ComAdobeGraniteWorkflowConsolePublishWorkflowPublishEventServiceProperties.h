/*
 * ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties_H_
#define _ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties_H_


#include <string>
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

class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties();
	ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGraniteworkflowWorkflowPublishEventServiceenabled();

	/*! \brief Set 
	 */
	void setGraniteworkflowWorkflowPublishEventServiceenabled(ConfigNodePropertyBoolean  graniteworkflowWorkflowPublishEventServiceenabled);

private:
	ConfigNodePropertyBoolean graniteworkflowWorkflowPublishEventServiceenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties_H_ */
