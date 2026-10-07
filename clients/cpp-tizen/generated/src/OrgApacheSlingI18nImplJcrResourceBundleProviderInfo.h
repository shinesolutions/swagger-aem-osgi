/*
 * OrgApacheSlingI18nImplJcrResourceBundleProviderInfo.h
 *
 * 
 */

#ifndef _OrgApacheSlingI18nImplJcrResourceBundleProviderInfo_H_
#define _OrgApacheSlingI18nImplJcrResourceBundleProviderInfo_H_


#include <string>
#include "OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.h"
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

class OrgApacheSlingI18nImplJcrResourceBundleProviderInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingI18nImplJcrResourceBundleProviderInfo();
	OrgApacheSlingI18nImplJcrResourceBundleProviderInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingI18nImplJcrResourceBundleProviderInfo();

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
	OrgApacheSlingI18nImplJcrResourceBundleProviderProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheSlingI18nImplJcrResourceBundleProviderProperties  properties);
	/*! \brief Get 
	 */
	std::string getAdditionalProperties();

	/*! \brief Set 
	 */
	void setAdditionalProperties(std::string  additionalProperties);
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
	OrgApacheSlingI18nImplJcrResourceBundleProviderProperties properties;
	std::string additionalProperties;
	std::string bundle_location;
	std::string service_location;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingI18nImplJcrResourceBundleProviderInfo_H_ */
