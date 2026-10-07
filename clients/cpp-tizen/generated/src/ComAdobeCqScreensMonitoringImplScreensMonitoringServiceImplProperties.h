/*
 * ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties_H_
#define _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties();
	ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath();

	/*! \brief Set 
	 */
	void setComadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath(ConfigNodePropertyArray  comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency();

	/*! \brief Set 
	 */
	void setComadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency(ConfigNodePropertyString  comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout();

	/*! \brief Set 
	 */
	void setComadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout(ConfigNodePropertyInteger  comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients();

	/*! \brief Set 
	 */
	void setComadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients(ConfigNodePropertyString  comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver();

	/*! \brief Set 
	 */
	void setComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver(ConfigNodePropertyString  comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport();

	/*! \brief Set 
	 */
	void setComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport(ConfigNodePropertyInteger  comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getComadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls();

	/*! \brief Set 
	 */
	void setComadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls(ConfigNodePropertyBoolean  comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobecqscreensmonitoringimplScreensMonitoringServiceImplusername();

	/*! \brief Set 
	 */
	void setComadobecqscreensmonitoringimplScreensMonitoringServiceImplusername(ConfigNodePropertyString  comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword();

	/*! \brief Set 
	 */
	void setComadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword(ConfigNodePropertyString  comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties_H_ */
