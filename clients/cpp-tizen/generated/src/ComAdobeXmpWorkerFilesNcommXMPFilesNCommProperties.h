/*
 * ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.h
 *
 * 
 */

#ifndef _ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties_H_
#define _ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties_H_


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

class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties();
	ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaxConnections();

	/*! \brief Set 
	 */
	void setMaxConnections(ConfigNodePropertyString  maxConnections);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaxRequests();

	/*! \brief Set 
	 */
	void setMaxRequests(ConfigNodePropertyString  maxRequests);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRequestTimeout();

	/*! \brief Set 
	 */
	void setRequestTimeout(ConfigNodePropertyString  requestTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLogDir();

	/*! \brief Set 
	 */
	void setLogDir(ConfigNodePropertyString  logDir);

private:
	ConfigNodePropertyString maxConnections;
	ConfigNodePropertyString maxRequests;
	ConfigNodePropertyString requestTimeout;
	ConfigNodePropertyString logDir;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties_H_ */
