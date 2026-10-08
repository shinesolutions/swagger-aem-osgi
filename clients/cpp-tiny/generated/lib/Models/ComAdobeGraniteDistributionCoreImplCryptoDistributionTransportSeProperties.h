
/*
 * ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties_H_


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

class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties();
    ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties();


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
	ConfigNodePropertyString getUsername();

	/*! \brief Set 
	 */
	void setUsername(ConfigNodePropertyString username);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEncryptedPassword();

	/*! \brief Set 
	 */
	void setEncryptedPassword(ConfigNodePropertyString encryptedPassword);


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyString username;
    ConfigNodePropertyString encryptedPassword;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties_H_ */
