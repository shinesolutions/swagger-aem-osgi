
/*
 * ComAdobeOctopusNcommBootstrapProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeOctopusNcommBootstrapProperties_H_
#define TINY_CPP_CLIENT_ComAdobeOctopusNcommBootstrapProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeOctopusNcommBootstrapProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeOctopusNcommBootstrapProperties();
    ComAdobeOctopusNcommBootstrapProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeOctopusNcommBootstrapProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxConnections();

	/*! \brief Set 
	 */
	void setMaxConnections(ConfigNodePropertyInteger maxConnections);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxRequests();

	/*! \brief Set 
	 */
	void setMaxRequests(ConfigNodePropertyInteger maxRequests);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRequestTimeout();

	/*! \brief Set 
	 */
	void setRequestTimeout(ConfigNodePropertyInteger requestTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRequestRetries();

	/*! \brief Set 
	 */
	void setRequestRetries(ConfigNodePropertyInteger requestRetries);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLaunchTimeout();

	/*! \brief Set 
	 */
	void setLaunchTimeout(ConfigNodePropertyInteger launchTimeout);


    private:
    ConfigNodePropertyInteger maxConnections;
    ConfigNodePropertyInteger maxRequests;
    ConfigNodePropertyInteger requestTimeout;
    ConfigNodePropertyInteger requestRetries;
    ConfigNodePropertyInteger launchTimeout;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeOctopusNcommBootstrapProperties_H_ */
