/*
 * ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo.h
 *
 * 
 */

#ifndef _ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo_H_
#define _ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo_H_


#include <string>
#include "ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.h"
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

class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo();
	ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo();

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
	ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo_H_ */
