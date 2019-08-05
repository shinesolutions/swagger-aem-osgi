/*
 * ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.h
 *
 * 
 */

#ifndef _ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties_H_
#define _ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties_H_


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

class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties();
	ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getNotifyonupdate();

	/*! \brief Set 
	 */
	void setNotifyonupdate(ConfigNodePropertyBoolean  notifyonupdate);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getNotifyoncomplete();

	/*! \brief Set 
	 */
	void setNotifyoncomplete(ConfigNodePropertyBoolean  notifyoncomplete);

private:
	ConfigNodePropertyBoolean notifyonupdate;
	ConfigNodePropertyBoolean notifyoncomplete;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties_H_ */
