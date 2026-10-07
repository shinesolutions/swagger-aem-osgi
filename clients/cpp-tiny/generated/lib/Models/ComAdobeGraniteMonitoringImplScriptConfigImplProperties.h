
/*
 * ComAdobeGraniteMonitoringImplScriptConfigImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteMonitoringImplScriptConfigImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteMonitoringImplScriptConfigImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteMonitoringImplScriptConfigImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteMonitoringImplScriptConfigImplProperties();
    ComAdobeGraniteMonitoringImplScriptConfigImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteMonitoringImplScriptConfigImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getScriptfilename();

	/*! \brief Set 
	 */
	void setScriptfilename(ConfigNodePropertyString scriptfilename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getScriptdisplay();

	/*! \brief Set 
	 */
	void setScriptdisplay(ConfigNodePropertyString scriptdisplay);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getScriptpath();

	/*! \brief Set 
	 */
	void setScriptpath(ConfigNodePropertyString scriptpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getScriptplatform();

	/*! \brief Set 
	 */
	void setScriptplatform(ConfigNodePropertyArray scriptplatform);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getInterval();

	/*! \brief Set 
	 */
	void setInterval(ConfigNodePropertyInteger interval);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJmxdomain();

	/*! \brief Set 
	 */
	void setJmxdomain(ConfigNodePropertyString jmxdomain);


    private:
    ConfigNodePropertyString scriptfilename;
    ConfigNodePropertyString scriptdisplay;
    ConfigNodePropertyString scriptpath;
    ConfigNodePropertyArray scriptplatform;
    ConfigNodePropertyInteger interval;
    ConfigNodePropertyString jmxdomain;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteMonitoringImplScriptConfigImplProperties_H_ */
