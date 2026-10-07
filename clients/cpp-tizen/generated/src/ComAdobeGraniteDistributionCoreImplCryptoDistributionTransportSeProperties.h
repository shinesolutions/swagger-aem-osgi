/*
 * ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties_H_
#define _ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties_H_


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

class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties();
	ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties();

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
	ConfigNodePropertyString getUsername();

	/*! \brief Set 
	 */
	void setUsername(ConfigNodePropertyString  username);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEncryptedPassword();

	/*! \brief Set 
	 */
	void setEncryptedPassword(ConfigNodePropertyString  encryptedPassword);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyString username;
	ConfigNodePropertyString encryptedPassword;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties_H_ */
