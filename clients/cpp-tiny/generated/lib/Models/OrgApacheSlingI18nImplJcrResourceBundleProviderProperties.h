
/*
 * OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingI18nImplJcrResourceBundleProviderProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingI18nImplJcrResourceBundleProviderProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingI18nImplJcrResourceBundleProviderProperties();
    OrgApacheSlingI18nImplJcrResourceBundleProviderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingI18nImplJcrResourceBundleProviderProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getLocaledefault();

	/*! \brief Set 
	 */
	void setLocaledefault(ConfigNodePropertyString localedefault);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPreloadbundles();

	/*! \brief Set 
	 */
	void setPreloadbundles(ConfigNodePropertyBoolean preloadbundles);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getInvalidationdelay();

	/*! \brief Set 
	 */
	void setInvalidationdelay(ConfigNodePropertyInteger invalidationdelay);


    private:
    ConfigNodePropertyString localedefault;
    ConfigNodePropertyBoolean preloadbundles;
    ConfigNodePropertyInteger invalidationdelay;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingI18nImplJcrResourceBundleProviderProperties_H_ */
