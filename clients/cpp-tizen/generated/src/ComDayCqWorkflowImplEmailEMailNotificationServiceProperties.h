/*
 * ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.h
 *
 * 
 */

#ifndef _ComDayCqWorkflowImplEmailEMailNotificationServiceProperties_H_
#define _ComDayCqWorkflowImplEmailEMailNotificationServiceProperties_H_


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

class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWorkflowImplEmailEMailNotificationServiceProperties();
	ComDayCqWorkflowImplEmailEMailNotificationServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWorkflowImplEmailEMailNotificationServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getFromaddress();

	/*! \brief Set 
	 */
	void setFromaddress(ConfigNodePropertyString  fromaddress);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHostprefix();

	/*! \brief Set 
	 */
	void setHostprefix(ConfigNodePropertyString  hostprefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getNotifyonabort();

	/*! \brief Set 
	 */
	void setNotifyonabort(ConfigNodePropertyBoolean  notifyonabort);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getNotifyoncomplete();

	/*! \brief Set 
	 */
	void setNotifyoncomplete(ConfigNodePropertyBoolean  notifyoncomplete);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getNotifyoncontainercomplete();

	/*! \brief Set 
	 */
	void setNotifyoncontainercomplete(ConfigNodePropertyBoolean  notifyoncontainercomplete);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getNotifyuseronly();

	/*! \brief Set 
	 */
	void setNotifyuseronly(ConfigNodePropertyBoolean  notifyuseronly);

private:
	ConfigNodePropertyString fromaddress;
	ConfigNodePropertyString hostprefix;
	ConfigNodePropertyBoolean notifyonabort;
	ConfigNodePropertyBoolean notifyoncomplete;
	ConfigNodePropertyBoolean notifyoncontainercomplete;
	ConfigNodePropertyBoolean notifyuseronly;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWorkflowImplEmailEMailNotificationServiceProperties_H_ */
