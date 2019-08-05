/*
 * ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo.h
 *
 * 
 */

#ifndef _ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo_H_
#define _ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo_H_


#include <string>
#include "ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties.h"
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

class ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo();
	ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo();

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
	ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo_H_ */
