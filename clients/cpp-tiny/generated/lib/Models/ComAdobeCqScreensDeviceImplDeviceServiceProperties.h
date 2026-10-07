
/*
 * ComAdobeCqScreensDeviceImplDeviceServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqScreensDeviceImplDeviceServiceProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqScreensDeviceImplDeviceServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqScreensDeviceImplDeviceServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqScreensDeviceImplDeviceServiceProperties();
    ComAdobeCqScreensDeviceImplDeviceServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqScreensDeviceImplDeviceServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobeaemscreensplayerpingfrequency();

	/*! \brief Set 
	 */
	void setComadobeaemscreensplayerpingfrequency(ConfigNodePropertyInteger comadobeaemscreensplayerpingfrequency);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobeaemscreensdevicepaswordspecialchars();

	/*! \brief Set 
	 */
	void setComadobeaemscreensdevicepaswordspecialchars(ConfigNodePropertyString comadobeaemscreensdevicepaswordspecialchars);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobeaemscreensdevicepaswordminlowercasechars();

	/*! \brief Set 
	 */
	void setComadobeaemscreensdevicepaswordminlowercasechars(ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminlowercasechars);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobeaemscreensdevicepaswordminuppercasechars();

	/*! \brief Set 
	 */
	void setComadobeaemscreensdevicepaswordminuppercasechars(ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminuppercasechars);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobeaemscreensdevicepaswordminnumberchars();

	/*! \brief Set 
	 */
	void setComadobeaemscreensdevicepaswordminnumberchars(ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminnumberchars);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobeaemscreensdevicepaswordminspecialchars();

	/*! \brief Set 
	 */
	void setComadobeaemscreensdevicepaswordminspecialchars(ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminspecialchars);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobeaemscreensdevicepaswordminlength();

	/*! \brief Set 
	 */
	void setComadobeaemscreensdevicepaswordminlength(ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminlength);


    private:
    ConfigNodePropertyInteger comadobeaemscreensplayerpingfrequency;
    ConfigNodePropertyString comadobeaemscreensdevicepaswordspecialchars;
    ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminlowercasechars;
    ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminuppercasechars;
    ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminnumberchars;
    ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminspecialchars;
    ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminlength;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqScreensDeviceImplDeviceServiceProperties_H_ */
