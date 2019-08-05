/*
 * ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.h
 *
 * 
 */

#ifndef _ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo_H_
#define _ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo_H_


#include <string>
#include "ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.h"
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

class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo();
	ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string  pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo_H_ */
