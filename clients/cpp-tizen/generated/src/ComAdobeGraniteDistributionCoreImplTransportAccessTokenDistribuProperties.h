/*
 * ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties_H_
#define _ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties_H_


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

class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties();
	ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString  name);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceName();

	/*! \brief Set 
	 */
	void setServiceName(ConfigNodePropertyString  serviceName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUserId();

	/*! \brief Set 
	 */
	void setUserId(ConfigNodePropertyString  userId);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAccessTokenProvidertarget();

	/*! \brief Set 
	 */
	void setAccessTokenProvidertarget(ConfigNodePropertyString  accessTokenProvidertarget);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyString serviceName;
	ConfigNodePropertyString userId;
	ConfigNodePropertyString accessTokenProvidertarget;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties_H_ */
