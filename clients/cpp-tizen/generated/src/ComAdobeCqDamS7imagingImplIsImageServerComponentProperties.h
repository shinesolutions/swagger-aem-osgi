/*
 * ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqDamS7imagingImplIsImageServerComponentProperties_H_
#define _ComAdobeCqDamS7imagingImplIsImageServerComponentProperties_H_


#include <string>
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

class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqDamS7imagingImplIsImageServerComponentProperties();
	ComAdobeCqDamS7imagingImplIsImageServerComponentProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqDamS7imagingImplIsImageServerComponentProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getTcpPort();

	/*! \brief Set 
	 */
	void setTcpPort(ConfigNodePropertyString  tcpPort);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAllowRemoteAccess();

	/*! \brief Set 
	 */
	void setAllowRemoteAccess(ConfigNodePropertyBoolean  allowRemoteAccess);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaxRenderRgnPixels();

	/*! \brief Set 
	 */
	void setMaxRenderRgnPixels(ConfigNodePropertyString  maxRenderRgnPixels);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaxMessageSize();

	/*! \brief Set 
	 */
	void setMaxMessageSize(ConfigNodePropertyString  maxMessageSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRandomAccessUrlTimeout();

	/*! \brief Set 
	 */
	void setRandomAccessUrlTimeout(ConfigNodePropertyInteger  randomAccessUrlTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getWorkerThreads();

	/*! \brief Set 
	 */
	void setWorkerThreads(ConfigNodePropertyInteger  workerThreads);

private:
	ConfigNodePropertyString tcpPort;
	ConfigNodePropertyBoolean allowRemoteAccess;
	ConfigNodePropertyString maxRenderRgnPixels;
	ConfigNodePropertyString maxMessageSize;
	ConfigNodePropertyInteger randomAccessUrlTimeout;
	ConfigNodePropertyInteger workerThreads;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqDamS7imagingImplIsImageServerComponentProperties_H_ */
