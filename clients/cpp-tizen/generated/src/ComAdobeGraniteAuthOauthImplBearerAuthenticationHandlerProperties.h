/*
 * ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties_H_
#define _ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties();
	ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties();

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
	ConfigNodePropertyArray getOauthclientIdsallowed();

	/*! \brief Set 
	 */
	void setOauthclientIdsallowed(ConfigNodePropertyArray  oauthclientIdsallowed);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAuthbearersyncims();

	/*! \brief Set 
	 */
	void setAuthbearersyncims(ConfigNodePropertyBoolean  authbearersyncims);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthtokenRequestParameter();

	/*! \brief Set 
	 */
	void setAuthtokenRequestParameter(ConfigNodePropertyString  authtokenRequestParameter);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthbearerconfigid();

	/*! \brief Set 
	 */
	void setOauthbearerconfigid(ConfigNodePropertyString  oauthbearerconfigid);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthjwtsupport();

	/*! \brief Set 
	 */
	void setOauthjwtsupport(ConfigNodePropertyBoolean  oauthjwtsupport);

private:
	ConfigNodePropertyString path;
	ConfigNodePropertyArray oauthclientIdsallowed;
	ConfigNodePropertyBoolean authbearersyncims;
	ConfigNodePropertyString authtokenRequestParameter;
	ConfigNodePropertyString oauthbearerconfigid;
	ConfigNodePropertyBoolean oauthjwtsupport;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties_H_ */
