/*
 * ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo.h
 *
 * 
 */

#ifndef _ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo_H_
#define _ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo_H_


#include <string>
#include "ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.h"
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

class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo();
	ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo();

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
	ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo_H_ */
