/*
 * ComAdobeCqScreensDeviceImplDeviceServiceProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqScreensDeviceImplDeviceServiceProperties_H_
#define _ComAdobeCqScreensDeviceImplDeviceServiceProperties_H_


#include <string>
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

class ComAdobeCqScreensDeviceImplDeviceServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqScreensDeviceImplDeviceServiceProperties();
	ComAdobeCqScreensDeviceImplDeviceServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqScreensDeviceImplDeviceServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobeaemscreensplayerpingfrequency();

	/*! \brief Set 
	 */
	void setComadobeaemscreensplayerpingfrequency(ConfigNodePropertyInteger  comadobeaemscreensplayerpingfrequency);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobeaemscreensdevicepaswordspecialchars();

	/*! \brief Set 
	 */
	void setComadobeaemscreensdevicepaswordspecialchars(ConfigNodePropertyString  comadobeaemscreensdevicepaswordspecialchars);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobeaemscreensdevicepaswordminlowercasechars();

	/*! \brief Set 
	 */
	void setComadobeaemscreensdevicepaswordminlowercasechars(ConfigNodePropertyInteger  comadobeaemscreensdevicepaswordminlowercasechars);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobeaemscreensdevicepaswordminuppercasechars();

	/*! \brief Set 
	 */
	void setComadobeaemscreensdevicepaswordminuppercasechars(ConfigNodePropertyInteger  comadobeaemscreensdevicepaswordminuppercasechars);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobeaemscreensdevicepaswordminnumberchars();

	/*! \brief Set 
	 */
	void setComadobeaemscreensdevicepaswordminnumberchars(ConfigNodePropertyInteger  comadobeaemscreensdevicepaswordminnumberchars);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobeaemscreensdevicepaswordminspecialchars();

	/*! \brief Set 
	 */
	void setComadobeaemscreensdevicepaswordminspecialchars(ConfigNodePropertyInteger  comadobeaemscreensdevicepaswordminspecialchars);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobeaemscreensdevicepaswordminlength();

	/*! \brief Set 
	 */
	void setComadobeaemscreensdevicepaswordminlength(ConfigNodePropertyInteger  comadobeaemscreensdevicepaswordminlength);

private:
	ConfigNodePropertyInteger comadobeaemscreensplayerpingfrequency;
	ConfigNodePropertyString comadobeaemscreensdevicepaswordspecialchars;
	ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminlowercasechars;
	ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminuppercasechars;
	ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminnumberchars;
	ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminspecialchars;
	ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminlength;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqScreensDeviceImplDeviceServiceProperties_H_ */
