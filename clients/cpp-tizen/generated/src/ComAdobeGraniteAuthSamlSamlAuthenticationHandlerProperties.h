/*
 * ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties_H_
#define _ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
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

class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties();
	ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyArray  path);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger  serviceranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getIdpUrl();

	/*! \brief Set 
	 */
	void setIdpUrl(ConfigNodePropertyString  idpUrl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getIdpCertAlias();

	/*! \brief Set 
	 */
	void setIdpCertAlias(ConfigNodePropertyString  idpCertAlias);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getIdpHttpRedirect();

	/*! \brief Set 
	 */
	void setIdpHttpRedirect(ConfigNodePropertyBoolean  idpHttpRedirect);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceProviderEntityId();

	/*! \brief Set 
	 */
	void setServiceProviderEntityId(ConfigNodePropertyString  serviceProviderEntityId);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAssertionConsumerServiceURL();

	/*! \brief Set 
	 */
	void setAssertionConsumerServiceURL(ConfigNodePropertyString  assertionConsumerServiceURL);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSpPrivateKeyAlias();

	/*! \brief Set 
	 */
	void setSpPrivateKeyAlias(ConfigNodePropertyString  spPrivateKeyAlias);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getKeyStorePassword();

	/*! \brief Set 
	 */
	void setKeyStorePassword(ConfigNodePropertyString  keyStorePassword);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultRedirectUrl();

	/*! \brief Set 
	 */
	void setDefaultRedirectUrl(ConfigNodePropertyString  defaultRedirectUrl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUserIDAttribute();

	/*! \brief Set 
	 */
	void setUserIDAttribute(ConfigNodePropertyString  userIDAttribute);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getUseEncryption();

	/*! \brief Set 
	 */
	void setUseEncryption(ConfigNodePropertyBoolean  useEncryption);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCreateUser();

	/*! \brief Set 
	 */
	void setCreateUser(ConfigNodePropertyBoolean  createUser);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUserIntermediatePath();

	/*! \brief Set 
	 */
	void setUserIntermediatePath(ConfigNodePropertyString  userIntermediatePath);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAddGroupMemberships();

	/*! \brief Set 
	 */
	void setAddGroupMemberships(ConfigNodePropertyBoolean  addGroupMemberships);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGroupMembershipAttribute();

	/*! \brief Set 
	 */
	void setGroupMembershipAttribute(ConfigNodePropertyString  groupMembershipAttribute);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDefaultGroups();

	/*! \brief Set 
	 */
	void setDefaultGroups(ConfigNodePropertyArray  defaultGroups);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getNameIdFormat();

	/*! \brief Set 
	 */
	void setNameIdFormat(ConfigNodePropertyString  nameIdFormat);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSynchronizeAttributes();

	/*! \brief Set 
	 */
	void setSynchronizeAttributes(ConfigNodePropertyArray  synchronizeAttributes);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getHandleLogout();

	/*! \brief Set 
	 */
	void setHandleLogout(ConfigNodePropertyBoolean  handleLogout);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLogoutUrl();

	/*! \brief Set 
	 */
	void setLogoutUrl(ConfigNodePropertyString  logoutUrl);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClockTolerance();

	/*! \brief Set 
	 */
	void setClockTolerance(ConfigNodePropertyInteger  clockTolerance);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDigestMethod();

	/*! \brief Set 
	 */
	void setDigestMethod(ConfigNodePropertyString  digestMethod);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSignatureMethod();

	/*! \brief Set 
	 */
	void setSignatureMethod(ConfigNodePropertyString  signatureMethod);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getIdentitySyncType();

	/*! \brief Set 
	 */
	void setIdentitySyncType(ConfigNodePropertyDropDown  identitySyncType);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getIdpIdentifier();

	/*! \brief Set 
	 */
	void setIdpIdentifier(ConfigNodePropertyString  idpIdentifier);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties_H_ */
