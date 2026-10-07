
/*
 * OrgApacheSlingScriptingCoreImplScriptCacheImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingScriptingCoreImplScriptCacheImplProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingScriptingCoreImplScriptCacheImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingScriptingCoreImplScriptCacheImplProperties();
    OrgApacheSlingScriptingCoreImplScriptCacheImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingScriptingCoreImplScriptCacheImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapacheslingscriptingcachesize();

	/*! \brief Set 
	 */
	void setOrgapacheslingscriptingcachesize(ConfigNodePropertyInteger orgapacheslingscriptingcachesize);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapacheslingscriptingcacheadditionalExtensions();

	/*! \brief Set 
	 */
	void setOrgapacheslingscriptingcacheadditionalExtensions(ConfigNodePropertyArray orgapacheslingscriptingcacheadditional_extensions);


    private:
    ConfigNodePropertyInteger orgapacheslingscriptingcachesize;
    ConfigNodePropertyArray orgapacheslingscriptingcacheadditional_extensions;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingScriptingCoreImplScriptCacheImplProperties_H_ */
