
/*
 * ComDayCqDamCoreImplExpiryNotificationJobImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplExpiryNotificationJobImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplExpiryNotificationJobImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplExpiryNotificationJobImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplExpiryNotificationJobImplProperties();
    ComDayCqDamCoreImplExpiryNotificationJobImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplExpiryNotificationJobImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamexpirynotificationscheduleristimebased();

	/*! \brief Set 
	 */
	void setCqdamexpirynotificationscheduleristimebased(ConfigNodePropertyBoolean cqdamexpirynotificationscheduleristimebased);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdamexpirynotificationschedulertimebasedrule();

	/*! \brief Set 
	 */
	void setCqdamexpirynotificationschedulertimebasedrule(ConfigNodePropertyString cqdamexpirynotificationschedulertimebasedrule);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamexpirynotificationschedulerperiodrule();

	/*! \brief Set 
	 */
	void setCqdamexpirynotificationschedulerperiodrule(ConfigNodePropertyInteger cqdamexpirynotificationschedulerperiodrule);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSendEmail();

	/*! \brief Set 
	 */
	void setSendEmail(ConfigNodePropertyBoolean send_email);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAssetExpiredLimit();

	/*! \brief Set 
	 */
	void setAssetExpiredLimit(ConfigNodePropertyInteger asset_expired_limit);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPriorNotificationSeconds();

	/*! \brief Set 
	 */
	void setPriorNotificationSeconds(ConfigNodePropertyInteger prior_notification_seconds);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdamexpirynotificationurlprotocol();

	/*! \brief Set 
	 */
	void setCqdamexpirynotificationurlprotocol(ConfigNodePropertyString cqdamexpirynotificationurlprotocol);


    private:
    ConfigNodePropertyBoolean cqdamexpirynotificationscheduleristimebased;
    ConfigNodePropertyString cqdamexpirynotificationschedulertimebasedrule;
    ConfigNodePropertyInteger cqdamexpirynotificationschedulerperiodrule;
    ConfigNodePropertyBoolean send_email;
    ConfigNodePropertyInteger asset_expired_limit;
    ConfigNodePropertyInteger prior_notification_seconds;
    ConfigNodePropertyString cqdamexpirynotificationurlprotocol;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplExpiryNotificationJobImplProperties_H_ */
