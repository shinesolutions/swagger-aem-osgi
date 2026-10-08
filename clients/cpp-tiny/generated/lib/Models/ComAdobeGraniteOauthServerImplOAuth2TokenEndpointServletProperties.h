
/*
 * ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties_H_


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

class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties();
    ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthissuer();

	/*! \brief Set 
	 */
	void setOauthissuer(ConfigNodePropertyString oauthissuer);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthaccesstokenexpiresin();

	/*! \brief Set 
	 */
	void setOauthaccesstokenexpiresin(ConfigNodePropertyString oauthaccesstokenexpiresin);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOsgihttpwhiteboardservletpattern();

	/*! \brief Set 
	 */
	void setOsgihttpwhiteboardservletpattern(ConfigNodePropertyString osgihttpwhiteboardservletpattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOsgihttpwhiteboardcontextselect();

	/*! \brief Set 
	 */
	void setOsgihttpwhiteboardcontextselect(ConfigNodePropertyString osgihttpwhiteboardcontextselect);


    private:
    ConfigNodePropertyString oauthissuer;
    ConfigNodePropertyString oauthaccesstokenexpiresin;
    ConfigNodePropertyString osgihttpwhiteboardservletpattern;
    ConfigNodePropertyString osgihttpwhiteboardcontextselect;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties_H_ */
