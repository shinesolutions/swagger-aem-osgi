
/*
 * ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo();
    ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo_H_ */
