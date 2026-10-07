/*
 * ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties_H_
#define _ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties();
	ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getProcesslabel();

	/*! \brief Set 
	 */
	void setProcesslabel(ConfigNodePropertyString  processlabel);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getNotifyonComplete();

	/*! \brief Set 
	 */
	void setNotifyonComplete(ConfigNodePropertyBoolean  notifyonComplete);

private:
	ConfigNodePropertyString processlabel;
	ConfigNodePropertyBoolean notifyonComplete;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties_H_ */
