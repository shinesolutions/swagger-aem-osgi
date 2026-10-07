
/*
 * ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties();
    ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyArray path);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger serviceranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getIdpUrl();

	/*! \brief Set 
	 */
	void setIdpUrl(ConfigNodePropertyString idpUrl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getIdpCertAlias();

	/*! \brief Set 
	 */
	void setIdpCertAlias(ConfigNodePropertyString idpCertAlias);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getIdpHttpRedirect();

	/*! \brief Set 
	 */
	void setIdpHttpRedirect(ConfigNodePropertyBoolean idpHttpRedirect);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceProviderEntityId();

	/*! \brief Set 
	 */
	void setServiceProviderEntityId(ConfigNodePropertyString serviceProviderEntityId);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAssertionConsumerServiceURL();

	/*! \brief Set 
	 */
	void setAssertionConsumerServiceURL(ConfigNodePropertyString assertionConsumerServiceURL);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSpPrivateKeyAlias();

	/*! \brief Set 
	 */
	void setSpPrivateKeyAlias(ConfigNodePropertyString spPrivateKeyAlias);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getKeyStorePassword();

	/*! \brief Set 
	 */
	void setKeyStorePassword(ConfigNodePropertyString keyStorePassword);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultRedirectUrl();

	/*! \brief Set 
	 */
	void setDefaultRedirectUrl(ConfigNodePropertyString defaultRedirectUrl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUserIDAttribute();

	/*! \brief Set 
	 */
	void setUserIDAttribute(ConfigNodePropertyString userIDAttribute);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getUseEncryption();

	/*! \brief Set 
	 */
	void setUseEncryption(ConfigNodePropertyBoolean useEncryption);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCreateUser();

	/*! \brief Set 
	 */
	void setCreateUser(ConfigNodePropertyBoolean createUser);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUserIntermediatePath();

	/*! \brief Set 
	 */
	void setUserIntermediatePath(ConfigNodePropertyString userIntermediatePath);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAddGroupMemberships();

	/*! \brief Set 
	 */
	void setAddGroupMemberships(ConfigNodePropertyBoolean addGroupMemberships);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGroupMembershipAttribute();

	/*! \brief Set 
	 */
	void setGroupMembershipAttribute(ConfigNodePropertyString groupMembershipAttribute);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDefaultGroups();

	/*! \brief Set 
	 */
	void setDefaultGroups(ConfigNodePropertyArray defaultGroups);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getNameIdFormat();

	/*! \brief Set 
	 */
	void setNameIdFormat(ConfigNodePropertyString nameIdFormat);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSynchronizeAttributes();

	/*! \brief Set 
	 */
	void setSynchronizeAttributes(ConfigNodePropertyArray synchronizeAttributes);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHandleLogout();

	/*! \brief Set 
	 */
	void setHandleLogout(ConfigNodePropertyBoolean handleLogout);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLogoutUrl();

	/*! \brief Set 
	 */
	void setLogoutUrl(ConfigNodePropertyString logoutUrl);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClockTolerance();

	/*! \brief Set 
	 */
	void setClockTolerance(ConfigNodePropertyInteger clockTolerance);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDigestMethod();

	/*! \brief Set 
	 */
	void setDigestMethod(ConfigNodePropertyString digestMethod);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSignatureMethod();

	/*! \brief Set 
	 */
	void setSignatureMethod(ConfigNodePropertyString signatureMethod);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getIdentitySyncType();

	/*! \brief Set 
	 */
	void setIdentitySyncType(ConfigNodePropertyDropDown identitySyncType);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getIdpIdentifier();

	/*! \brief Set 
	 */
	void setIdpIdentifier(ConfigNodePropertyString idpIdentifier);


    private:
    ConfigNodePropertyArray path;
    ConfigNodePropertyInteger serviceranking;
    ConfigNodePropertyString idpUrl;
    ConfigNodePropertyString idpCertAlias;
    ConfigNodePropertyBoolean idpHttpRedirect;
    ConfigNodePropertyString serviceProviderEntityId;
    ConfigNodePropertyString assertionConsumerServiceURL;
    ConfigNodePropertyString spPrivateKeyAlias;
    ConfigNodePropertyString keyStorePassword;
    ConfigNodePropertyString defaultRedirectUrl;
    ConfigNodePropertyString userIDAttribute;
    ConfigNodePropertyBoolean useEncryption;
    ConfigNodePropertyBoolean createUser;
    ConfigNodePropertyString userIntermediatePath;
    ConfigNodePropertyBoolean addGroupMemberships;
    ConfigNodePropertyString groupMembershipAttribute;
    ConfigNodePropertyArray defaultGroups;
    ConfigNodePropertyString nameIdFormat;
    ConfigNodePropertyArray synchronizeAttributes;
    ConfigNodePropertyBoolean handleLogout;
    ConfigNodePropertyString logoutUrl;
    ConfigNodePropertyInteger clockTolerance;
    ConfigNodePropertyString digestMethod;
    ConfigNodePropertyString signatureMethod;
    ConfigNodePropertyDropDown identitySyncType;
    ConfigNodePropertyString idpIdentifier;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties_H_ */
