/*
 * ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties_H_
#define _ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
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

class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties();
	ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getDimdefaultmode();

	/*! \brief Set 
	 */
	void setDimdefaultmode(ConfigNodePropertyDropDown  dimdefaultmode);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDimappcacheenabled();

	/*! \brief Set 
	 */
	void setDimappcacheenabled(ConfigNodePropertyBoolean  dimappcacheenabled);

private:
	ConfigNodePropertyDropDown dimdefaultmode;
	ConfigNodePropertyBoolean dimappcacheenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties_H_ */
