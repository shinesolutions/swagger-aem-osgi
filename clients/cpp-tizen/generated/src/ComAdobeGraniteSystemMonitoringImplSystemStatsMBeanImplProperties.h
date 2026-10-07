/*
 * ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties_H_
#define _ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties_H_


#include <string>
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

class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties();
	ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulerexpression();

	/*! \brief Set 
	 */
	void setSchedulerexpression(ConfigNodePropertyString  schedulerexpression);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJmxobjectname();

	/*! \brief Set 
	 */
	void setJmxobjectname(ConfigNodePropertyString  jmxobjectname);

private:
	ConfigNodePropertyString schedulerexpression;
	ConfigNodePropertyString jmxobjectname;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties_H_ */
