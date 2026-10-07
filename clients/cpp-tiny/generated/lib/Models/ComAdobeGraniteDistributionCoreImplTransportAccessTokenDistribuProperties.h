
/*
 * ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties_H_


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

class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties();
    ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString name);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceName();

	/*! \brief Set 
	 */
	void setServiceName(ConfigNodePropertyString serviceName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUserId();

	/*! \brief Set 
	 */
	void setUserId(ConfigNodePropertyString userId);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAccessTokenProvidertarget();

	/*! \brief Set 
	 */
	void setAccessTokenProvidertarget(ConfigNodePropertyString accessTokenProvidertarget);


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyString serviceName;
    ConfigNodePropertyString userId;
    ConfigNodePropertyString accessTokenProvidertarget;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties_H_ */
