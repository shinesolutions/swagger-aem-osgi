/*
 * ComAdobeGraniteMonitoringImplScriptConfigImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteMonitoringImplScriptConfigImplProperties_H_
#define _ComAdobeGraniteMonitoringImplScriptConfigImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeGraniteMonitoringImplScriptConfigImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteMonitoringImplScriptConfigImplProperties();
	ComAdobeGraniteMonitoringImplScriptConfigImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteMonitoringImplScriptConfigImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getScriptfilename();

	/*! \brief Set 
	 */
	void setScriptfilename(ConfigNodePropertyString  scriptfilename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getScriptdisplay();

	/*! \brief Set 
	 */
	void setScriptdisplay(ConfigNodePropertyString  scriptdisplay);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getScriptpath();

	/*! \brief Set 
	 */
	void setScriptpath(ConfigNodePropertyString  scriptpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getScriptplatform();

	/*! \brief Set 
	 */
	void setScriptplatform(ConfigNodePropertyArray  scriptplatform);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getInterval();

	/*! \brief Set 
	 */
	void setInterval(ConfigNodePropertyInteger  interval);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJmxdomain();

	/*! \brief Set 
	 */
	void setJmxdomain(ConfigNodePropertyString  jmxdomain);

private:
	ConfigNodePropertyString scriptfilename;
	ConfigNodePropertyString scriptdisplay;
	ConfigNodePropertyString scriptpath;
	ConfigNodePropertyArray scriptplatform;
	ConfigNodePropertyInteger interval;
	ConfigNodePropertyString jmxdomain;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteMonitoringImplScriptConfigImplProperties_H_ */
