/*
 * ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplMissingMetadataNotificationJobProperties_H_
#define _ComDayCqDamCoreImplMissingMetadataNotificationJobProperties_H_


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

class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplMissingMetadataNotificationJobProperties();
	ComDayCqDamCoreImplMissingMetadataNotificationJobProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplMissingMetadataNotificationJobProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdammissingmetadatanotificationscheduleristimebased();

	/*! \brief Set 
	 */
	void setCqdammissingmetadatanotificationscheduleristimebased(ConfigNodePropertyBoolean  cqdammissingmetadatanotificationscheduleristimebased);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdammissingmetadatanotificationschedulertimebasedrule();

	/*! \brief Set 
	 */
	void setCqdammissingmetadatanotificationschedulertimebasedrule(ConfigNodePropertyString  cqdammissingmetadatanotificationschedulertimebasedrule);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdammissingmetadatanotificationschedulerperiodrule();

	/*! \brief Set 
	 */
	void setCqdammissingmetadatanotificationschedulerperiodrule(ConfigNodePropertyInteger  cqdammissingmetadatanotificationschedulerperiodrule);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdammissingmetadatanotificationrecipient();

	/*! \brief Set 
	 */
	void setCqdammissingmetadatanotificationrecipient(ConfigNodePropertyString  cqdammissingmetadatanotificationrecipient);

private:
	ConfigNodePropertyBoolean cqdammissingmetadatanotificationscheduleristimebased;
	ConfigNodePropertyString cqdammissingmetadatanotificationschedulertimebasedrule;
	ConfigNodePropertyInteger cqdammissingmetadatanotificationschedulerperiodrule;
	ConfigNodePropertyString cqdammissingmetadatanotificationrecipient;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplMissingMetadataNotificationJobProperties_H_ */
