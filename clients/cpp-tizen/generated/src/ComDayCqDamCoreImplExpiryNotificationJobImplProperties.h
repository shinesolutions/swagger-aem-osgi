/*
 * ComDayCqDamCoreImplExpiryNotificationJobImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplExpiryNotificationJobImplProperties_H_
#define _ComDayCqDamCoreImplExpiryNotificationJobImplProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqDamCoreImplExpiryNotificationJobImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplExpiryNotificationJobImplProperties();
	ComDayCqDamCoreImplExpiryNotificationJobImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplExpiryNotificationJobImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamexpirynotificationscheduleristimebased();

	/*! \brief Set 
	 */
	void setCqdamexpirynotificationscheduleristimebased(ConfigNodePropertyBoolean  cqdamexpirynotificationscheduleristimebased);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdamexpirynotificationschedulertimebasedrule();

	/*! \brief Set 
	 */
	void setCqdamexpirynotificationschedulertimebasedrule(ConfigNodePropertyString  cqdamexpirynotificationschedulertimebasedrule);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamexpirynotificationschedulerperiodrule();

	/*! \brief Set 
	 */
	void setCqdamexpirynotificationschedulerperiodrule(ConfigNodePropertyInteger  cqdamexpirynotificationschedulerperiodrule);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSendEmail();

	/*! \brief Set 
	 */
	void setSendEmail(ConfigNodePropertyBoolean  send_email);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAssetExpiredLimit();

	/*! \brief Set 
	 */
	void setAssetExpiredLimit(ConfigNodePropertyInteger  asset_expired_limit);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPriorNotificationSeconds();

	/*! \brief Set 
	 */
	void setPriorNotificationSeconds(ConfigNodePropertyInteger  prior_notification_seconds);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdamexpirynotificationurlprotocol();

	/*! \brief Set 
	 */
	void setCqdamexpirynotificationurlprotocol(ConfigNodePropertyString  cqdamexpirynotificationurlprotocol);

private:
	ConfigNodePropertyBoolean cqdamexpirynotificationscheduleristimebased;
	ConfigNodePropertyString cqdamexpirynotificationschedulertimebasedrule;
	ConfigNodePropertyInteger cqdamexpirynotificationschedulerperiodrule;
	ConfigNodePropertyBoolean send_email;
	ConfigNodePropertyInteger asset_expired_limit;
	ConfigNodePropertyInteger prior_notification_seconds;
	ConfigNodePropertyString cqdamexpirynotificationurlprotocol;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplExpiryNotificationJobImplProperties_H_ */
