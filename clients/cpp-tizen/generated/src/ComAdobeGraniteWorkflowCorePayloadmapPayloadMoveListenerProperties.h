/*
 * ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties_H_
#define _ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties_H_


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

class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties();
	ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPayloadmovewhitelist();

	/*! \brief Set 
	 */
	void setPayloadmovewhitelist(ConfigNodePropertyArray  payloadmovewhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPayloadmovehandlefromworkflowprocess();

	/*! \brief Set 
	 */
	void setPayloadmovehandlefromworkflowprocess(ConfigNodePropertyBoolean  payloadmovehandlefromworkflowprocess);

private:
	ConfigNodePropertyArray payloadmovewhitelist;
	ConfigNodePropertyBoolean payloadmovehandlefromworkflowprocess;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties_H_ */
