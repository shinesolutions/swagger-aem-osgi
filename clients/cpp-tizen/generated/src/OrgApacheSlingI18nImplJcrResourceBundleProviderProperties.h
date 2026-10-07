/*
 * OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingI18nImplJcrResourceBundleProviderProperties_H_
#define _OrgApacheSlingI18nImplJcrResourceBundleProviderProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"
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

class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingI18nImplJcrResourceBundleProviderProperties();
	OrgApacheSlingI18nImplJcrResourceBundleProviderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingI18nImplJcrResourceBundleProviderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getLocaledefault();

	/*! \brief Set 
	 */
	void setLocaledefault(ConfigNodePropertyString  localedefault);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPreloadbundles();

	/*! \brief Set 
	 */
	void setPreloadbundles(ConfigNodePropertyBoolean  preloadbundles);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getInvalidationdelay();

	/*! \brief Set 
	 */
	void setInvalidationdelay(ConfigNodePropertyInteger  invalidationdelay);

private:
	ConfigNodePropertyString localedefault;
	ConfigNodePropertyBoolean preloadbundles;
	ConfigNodePropertyInteger invalidationdelay;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingI18nImplJcrResourceBundleProviderProperties_H_ */
