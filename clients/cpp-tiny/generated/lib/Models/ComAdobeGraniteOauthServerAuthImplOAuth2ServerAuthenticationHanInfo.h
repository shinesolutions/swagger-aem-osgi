
/*
 * ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo();
    ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo();


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
	ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo_H_ */
