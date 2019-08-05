/*
 * OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo_H_
#define _OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo_H_


#include <string>
#include "OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.h"
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

class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo();
	OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo();

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
	OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo_H_ */
