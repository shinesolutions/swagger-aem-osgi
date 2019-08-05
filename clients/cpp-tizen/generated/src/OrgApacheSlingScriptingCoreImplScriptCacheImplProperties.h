/*
 * OrgApacheSlingScriptingCoreImplScriptCacheImplProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingScriptingCoreImplScriptCacheImplProperties_H_
#define _OrgApacheSlingScriptingCoreImplScriptCacheImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingScriptingCoreImplScriptCacheImplProperties();
	OrgApacheSlingScriptingCoreImplScriptCacheImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingScriptingCoreImplScriptCacheImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapacheslingscriptingcachesize();

	/*! \brief Set 
	 */
	void setOrgapacheslingscriptingcachesize(ConfigNodePropertyInteger  orgapacheslingscriptingcachesize);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapacheslingscriptingcacheadditionalExtensions();

	/*! \brief Set 
	 */
	void setOrgapacheslingscriptingcacheadditionalExtensions(ConfigNodePropertyArray  orgapacheslingscriptingcacheadditional_extensions);

private:
	ConfigNodePropertyInteger orgapacheslingscriptingcachesize;
	ConfigNodePropertyArray orgapacheslingscriptingcacheadditional_extensions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingScriptingCoreImplScriptCacheImplProperties_H_ */
