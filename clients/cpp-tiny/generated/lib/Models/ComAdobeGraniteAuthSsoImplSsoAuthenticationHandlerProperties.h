
/*
 * ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties();
    ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString path);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger serviceranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaascontrolFlag();

	/*! \brief Set 
	 */
	void setJaascontrolFlag(ConfigNodePropertyString jaascontrolFlag);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaasrealmName();

	/*! \brief Set 
	 */
	void setJaasrealmName(ConfigNodePropertyString jaasrealmName);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getJaasranking();

	/*! \brief Set 
	 */
	void setJaasranking(ConfigNodePropertyInteger jaasranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHeaders();

	/*! \brief Set 
	 */
	void setHeaders(ConfigNodePropertyArray headers);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCookies();

	/*! \brief Set 
	 */
	void setCookies(ConfigNodePropertyArray cookies);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getParameters();

	/*! \brief Set 
	 */
	void setParameters(ConfigNodePropertyArray parameters);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getUsermap();

	/*! \brief Set 
	 */
	void setUsermap(ConfigNodePropertyArray usermap);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFormat();

	/*! \brief Set 
	 */
	void setFormat(ConfigNodePropertyString format);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTrustedCredentialsAttribute();

	/*! \brief Set 
	 */
	void setTrustedCredentialsAttribute(ConfigNodePropertyString trustedCredentialsAttribute);


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
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties_H_ */
