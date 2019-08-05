/*
 * ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties_H_
#define _ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties();
	ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString  path);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger  serviceranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaascontrolFlag();

	/*! \brief Set 
	 */
	void setJaascontrolFlag(ConfigNodePropertyString  jaascontrolFlag);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaasrealmName();

	/*! \brief Set 
	 */
	void setJaasrealmName(ConfigNodePropertyString  jaasrealmName);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getJaasranking();

	/*! \brief Set 
	 */
	void setJaasranking(ConfigNodePropertyInteger  jaasranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHeaders();

	/*! \brief Set 
	 */
	void setHeaders(ConfigNodePropertyArray  headers);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCookies();

	/*! \brief Set 
	 */
	void setCookies(ConfigNodePropertyArray  cookies);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getParameters();

	/*! \brief Set 
	 */
	void setParameters(ConfigNodePropertyArray  parameters);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getUsermap();

	/*! \brief Set 
	 */
	void setUsermap(ConfigNodePropertyArray  usermap);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFormat();

	/*! \brief Set 
	 */
	void setFormat(ConfigNodePropertyString  format);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTrustedCredentialsAttribute();

	/*! \brief Set 
	 */
	void setTrustedCredentialsAttribute(ConfigNodePropertyString  trustedCredentialsAttribute);

private:
	ConfigNodePropertyString path;
	ConfigNodePropertyInteger serviceranking;
	ConfigNodePropertyString jaascontrolFlag;
	ConfigNodePropertyString jaasrealmName;
	ConfigNodePropertyInteger jaasranking;
	ConfigNodePropertyArray headers;
	ConfigNodePropertyArray cookies;
	ConfigNodePropertyArray parameters;
	ConfigNodePropertyArray usermap;
	ConfigNodePropertyString format;
	ConfigNodePropertyString trustedCredentialsAttribute;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties_H_ */
