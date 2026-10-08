
/*
 * ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties();
    ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getDimdefaultmode();

	/*! \brief Set 
	 */
	void setDimdefaultmode(ConfigNodePropertyDropDown dimdefaultmode);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDimappcacheenabled();

	/*! \brief Set 
	 */
	void setDimappcacheenabled(ConfigNodePropertyBoolean dimappcacheenabled);


    private:
    ConfigNodePropertyDropDown dimdefaultmode;
    ConfigNodePropertyBoolean dimappcacheenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties_H_ */
