/*
 * OrgApacheSlingServletsGetDefaultGetServletInfo.h
 *
 * 
 */

#ifndef _OrgApacheSlingServletsGetDefaultGetServletInfo_H_
#define _OrgApacheSlingServletsGetDefaultGetServletInfo_H_


#include <string>
#include "OrgApacheSlingServletsGetDefaultGetServletProperties.h"
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

class OrgApacheSlingServletsGetDefaultGetServletInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingServletsGetDefaultGetServletInfo();
	OrgApacheSlingServletsGetDefaultGetServletInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingServletsGetDefaultGetServletInfo();

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
	OrgApacheSlingServletsGetDefaultGetServletProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheSlingServletsGetDefaultGetServletProperties  properties);
	/*! \brief Get 
	 */
	std::string getBundleLocation();

	/*! \brief Set 
	 */
	void setBundleLocation(std::string  bundle_location);
	/*! \brief Get 
	 */
	std::string getServiceLocation();

	/*! \brief Set 
	 */
	void setServiceLocation(std::string  service_location);

private:
	std::string pid;
	std::string title;
	std::string description;
	OrgApacheSlingServletsGetDefaultGetServletProperties properties;
	std::string bundle_location;
	std::string service_location;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingServletsGetDefaultGetServletInfo_H_ */