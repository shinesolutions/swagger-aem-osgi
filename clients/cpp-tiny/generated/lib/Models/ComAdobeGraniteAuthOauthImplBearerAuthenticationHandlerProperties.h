
/*
 * ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties();
    ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties();


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
	ConfigNodePropertyArray getOauthclientIdsallowed();

	/*! \brief Set 
	 */
	void setOauthclientIdsallowed(ConfigNodePropertyArray oauthclientIdsallowed);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAuthbearersyncims();

	/*! \brief Set 
	 */
	void setAuthbearersyncims(ConfigNodePropertyBoolean authbearersyncims);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthtokenRequestParameter();

	/*! \brief Set 
	 */
	void setAuthtokenRequestParameter(ConfigNodePropertyString authtokenRequestParameter);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthbearerconfigid();

	/*! \brief Set 
	 */
	void setOauthbearerconfigid(ConfigNodePropertyString oauthbearerconfigid);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOauthjwtsupport();

	/*! \brief Set 
	 */
	void setOauthjwtsupport(ConfigNodePropertyBoolean oauthjwtsupport);


    private:
    ConfigNodePropertyString path;
    ConfigNodePropertyArray oauthclientIdsallowed;
    ConfigNodePropertyBoolean authbearersyncims;
    ConfigNodePropertyString authtokenRequestParameter;
    ConfigNodePropertyString oauthbearerconfigid;
    ConfigNodePropertyBoolean oauthjwtsupport;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties_H_ */
