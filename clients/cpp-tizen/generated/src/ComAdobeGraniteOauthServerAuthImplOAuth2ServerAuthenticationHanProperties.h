/*
 * ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties_H_
#define _ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties();
	ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties();

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
	ConfigNodePropertyBoolean getOauthofflinevalidation();

	/*! \brief Set 
	 */
	void setOauthofflinevalidation(ConfigNodePropertyBoolean  oauthofflinevalidation);

private:
	ConfigNodePropertyString path;
	ConfigNodePropertyString jaascontrolFlag;
	ConfigNodePropertyString jaasrealmName;
	ConfigNodePropertyInteger jaasranking;
	ConfigNodePropertyBoolean oauthofflinevalidation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties_H_ */
