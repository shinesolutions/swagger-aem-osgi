
/*
 * ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties_H_
#define TINY_CPP_CLIENT_ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties();
    ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaxConnections();

	/*! \brief Set 
	 */
	void setMaxConnections(ConfigNodePropertyString maxConnections);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaxRequests();

	/*! \brief Set 
	 */
	void setMaxRequests(ConfigNodePropertyString maxRequests);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getRequestTimeout();

	/*! \brief Set 
	 */
	void setRequestTimeout(ConfigNodePropertyString requestTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLogDir();

	/*! \brief Set 
	 */
	void setLogDir(ConfigNodePropertyString logDir);


    private:
    ConfigNodePropertyString maxConnections;
    ConfigNodePropertyString maxRequests;
    ConfigNodePropertyString requestTimeout;
    ConfigNodePropertyString logDir;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties_H_ */
