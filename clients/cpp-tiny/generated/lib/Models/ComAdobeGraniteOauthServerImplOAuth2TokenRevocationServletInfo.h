
/*
 * ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo();
    ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo();


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
	ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo_H_ */
