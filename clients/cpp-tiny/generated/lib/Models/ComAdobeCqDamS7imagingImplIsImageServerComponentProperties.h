
/*
 * ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDamS7imagingImplIsImageServerComponentProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqDamS7imagingImplIsImageServerComponentProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDamS7imagingImplIsImageServerComponentProperties();
    ComAdobeCqDamS7imagingImplIsImageServerComponentProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDamS7imagingImplIsImageServerComponentProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getTcpPort();

	/*! \brief Set 
	 */
	void setTcpPort(ConfigNodePropertyString tcpPort);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAllowRemoteAccess();

	/*! \brief Set 
	 */
	void setAllowRemoteAccess(ConfigNodePropertyBoolean allowRemoteAccess);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaxRenderRgnPixels();

	/*! \brief Set 
	 */
	void setMaxRenderRgnPixels(ConfigNodePropertyString maxRenderRgnPixels);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaxMessageSize();

	/*! \brief Set 
	 */
	void setMaxMessageSize(ConfigNodePropertyString maxMessageSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRandomAccessUrlTimeout();

	/*! \brief Set 
	 */
	void setRandomAccessUrlTimeout(ConfigNodePropertyInteger randomAccessUrlTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getWorkerThreads();

	/*! \brief Set 
	 */
	void setWorkerThreads(ConfigNodePropertyInteger workerThreads);


    private:
    ConfigNodePropertyString tcpPort;
    ConfigNodePropertyBoolean allowRemoteAccess;
    ConfigNodePropertyString maxRenderRgnPixels;
    ConfigNodePropertyString maxMessageSize;
    ConfigNodePropertyInteger randomAccessUrlTimeout;
    ConfigNodePropertyInteger workerThreads;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqDamS7imagingImplIsImageServerComponentProperties_H_ */
