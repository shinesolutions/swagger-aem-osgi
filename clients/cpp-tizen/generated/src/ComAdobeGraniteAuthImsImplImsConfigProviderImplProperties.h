/*
 * ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties_H_
#define _ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties_H_


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

class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties();
	ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthconfigmanagerimsconfigid();

	/*! \brief Set 
	 */
	void setOauthconfigmanagerimsconfigid(ConfigNodePropertyString  oauthconfigmanagerimsconfigid);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getImsowningEntity();

	/*! \brief Set 
	 */
	void setImsowningEntity(ConfigNodePropertyString  imsowningEntity);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAeminstanceId();

	/*! \brief Set 
	 */
	void setAeminstanceId(ConfigNodePropertyString  aeminstanceId);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getImsserviceCode();

	/*! \brief Set 
	 */
	void setImsserviceCode(ConfigNodePropertyString  imsserviceCode);

private:
	ConfigNodePropertyString oauthconfigmanagerimsconfigid;
	ConfigNodePropertyString imsowningEntity;
	ConfigNodePropertyString aeminstanceId;
	ConfigNodePropertyString imsserviceCode;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties_H_ */
