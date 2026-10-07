
/*
 * ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplMissingMetadataNotificationJobProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplMissingMetadataNotificationJobProperties_H_


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

class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplMissingMetadataNotificationJobProperties();
    ComDayCqDamCoreImplMissingMetadataNotificationJobProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplMissingMetadataNotificationJobProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdammissingmetadatanotificationscheduleristimebased();

	/*! \brief Set 
	 */
	void setCqdammissingmetadatanotificationscheduleristimebased(ConfigNodePropertyBoolean cqdammissingmetadatanotificationscheduleristimebased);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdammissingmetadatanotificationschedulertimebasedrule();

	/*! \brief Set 
	 */
	void setCqdammissingmetadatanotificationschedulertimebasedrule(ConfigNodePropertyString cqdammissingmetadatanotificationschedulertimebasedrule);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdammissingmetadatanotificationschedulerperiodrule();

	/*! \brief Set 
	 */
	void setCqdammissingmetadatanotificationschedulerperiodrule(ConfigNodePropertyInteger cqdammissingmetadatanotificationschedulerperiodrule);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdammissingmetadatanotificationrecipient();

	/*! \brief Set 
	 */
	void setCqdammissingmetadatanotificationrecipient(ConfigNodePropertyString cqdammissingmetadatanotificationrecipient);


    private:
    ConfigNodePropertyBoolean cqdammissingmetadatanotificationscheduleristimebased;
    ConfigNodePropertyString cqdammissingmetadatanotificationschedulertimebasedrule;
    ConfigNodePropertyInteger cqdammissingmetadatanotificationschedulerperiodrule;
    ConfigNodePropertyString cqdammissingmetadatanotificationrecipient;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplMissingMetadataNotificationJobProperties_H_ */
