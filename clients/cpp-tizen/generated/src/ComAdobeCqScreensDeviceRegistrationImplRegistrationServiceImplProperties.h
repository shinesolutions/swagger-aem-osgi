/*
 * ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties_H_
#define _ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties();
	ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDeviceRegistrationTimeout();

	/*! \brief Set 
	 */
	void setDeviceRegistrationTimeout(ConfigNodePropertyInteger  deviceRegistrationTimeout);

private:
	ConfigNodePropertyInteger deviceRegistrationTimeout;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties_H_ */
