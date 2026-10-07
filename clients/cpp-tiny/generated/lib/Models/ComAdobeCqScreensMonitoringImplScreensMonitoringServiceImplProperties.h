
/*
 * ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties();
    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath();

	/*! \brief Set 
	 */
	void setComadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath(ConfigNodePropertyArray comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency();

	/*! \brief Set 
	 */
	void setComadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency(ConfigNodePropertyString comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout();

	/*! \brief Set 
	 */
	void setComadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout(ConfigNodePropertyInteger comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients();

	/*! \brief Set 
	 */
	void setComadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients(ConfigNodePropertyString comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver();

	/*! \brief Set 
	 */
	void setComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver(ConfigNodePropertyString comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport();

	/*! \brief Set 
	 */
	void setComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport(ConfigNodePropertyInteger comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getComadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls();

	/*! \brief Set 
	 */
	void setComadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls(ConfigNodePropertyBoolean comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobecqscreensmonitoringimplScreensMonitoringServiceImplusername();

	/*! \brief Set 
	 */
	void setComadobecqscreensmonitoringimplScreensMonitoringServiceImplusername(ConfigNodePropertyString comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword();

	/*! \brief Set 
	 */
	void setComadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword(ConfigNodePropertyString comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword);


    private:
    ConfigNodePropertyArray comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath;
    ConfigNodePropertyString comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency;
    ConfigNodePropertyInteger comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout;
    ConfigNodePropertyString comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients;
    ConfigNodePropertyString comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver;
    ConfigNodePropertyInteger comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport;
    ConfigNodePropertyBoolean comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls;
    ConfigNodePropertyString comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername;
    ConfigNodePropertyString comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties_H_ */
