/*
 * ComAdobeOctopusNcommBootstrapProperties.h
 *
 * 
 */

#ifndef _ComAdobeOctopusNcommBootstrapProperties_H_
#define _ComAdobeOctopusNcommBootstrapProperties_H_


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

class ComAdobeOctopusNcommBootstrapProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeOctopusNcommBootstrapProperties();
	ComAdobeOctopusNcommBootstrapProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeOctopusNcommBootstrapProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxConnections();

	/*! \brief Set 
	 */
	void setMaxConnections(ConfigNodePropertyInteger  maxConnections);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxRequests();

	/*! \brief Set 
	 */
	void setMaxRequests(ConfigNodePropertyInteger  maxRequests);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRequestTimeout();

	/*! \brief Set 
	 */
	void setRequestTimeout(ConfigNodePropertyInteger  requestTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRequestRetries();

	/*! \brief Set 
	 */
	void setRequestRetries(ConfigNodePropertyInteger  requestRetries);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLaunchTimeout();

	/*! \brief Set 
	 */
	void setLaunchTimeout(ConfigNodePropertyInteger  launchTimeout);

private:
	ConfigNodePropertyInteger maxConnections;
	ConfigNodePropertyInteger maxRequests;
	ConfigNodePropertyInteger requestTimeout;
	ConfigNodePropertyInteger requestRetries;
	ConfigNodePropertyInteger launchTimeout;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeOctopusNcommBootstrapProperties_H_ */
