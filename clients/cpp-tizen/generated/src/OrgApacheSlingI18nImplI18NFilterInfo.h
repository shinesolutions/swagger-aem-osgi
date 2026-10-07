/*
 * OrgApacheSlingI18nImplI18NFilterInfo.h
 *
 * 
 */

#ifndef _OrgApacheSlingI18nImplI18NFilterInfo_H_
#define _OrgApacheSlingI18nImplI18NFilterInfo_H_


#include <string>
#include "OrgApacheSlingI18nImplI18NFilterProperties.h"
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

class OrgApacheSlingI18nImplI18NFilterInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingI18nImplI18NFilterInfo();
	OrgApacheSlingI18nImplI18NFilterInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingI18nImplI18NFilterInfo();

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
	OrgApacheSlingI18nImplI18NFilterProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheSlingI18nImplI18NFilterProperties  properties);
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
	OrgApacheSlingI18nImplI18NFilterProperties properties;
	std::string bundle_location;
	std::string service_location;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingI18nImplI18NFilterInfo_H_ */
