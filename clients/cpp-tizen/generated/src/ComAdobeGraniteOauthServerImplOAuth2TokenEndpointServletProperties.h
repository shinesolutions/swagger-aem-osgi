/*
 * ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties_H_
#define _ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties_H_


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

class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties();
	ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthissuer();

	/*! \brief Set 
	 */
	void setOauthissuer(ConfigNodePropertyString  oauthissuer);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthaccesstokenexpiresin();

	/*! \brief Set 
	 */
	void setOauthaccesstokenexpiresin(ConfigNodePropertyString  oauthaccesstokenexpiresin);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOsgihttpwhiteboardservletpattern();

	/*! \brief Set 
	 */
	void setOsgihttpwhiteboardservletpattern(ConfigNodePropertyString  osgihttpwhiteboardservletpattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOsgihttpwhiteboardcontextselect();

	/*! \brief Set 
	 */
	void setOsgihttpwhiteboardcontextselect(ConfigNodePropertyString  osgihttpwhiteboardcontextselect);

private:
	ConfigNodePropertyString oauthissuer;
	ConfigNodePropertyString oauthaccesstokenexpiresin;
	ConfigNodePropertyString osgihttpwhiteboardservletpattern;
	ConfigNodePropertyString osgihttpwhiteboardcontextselect;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties_H_ */
