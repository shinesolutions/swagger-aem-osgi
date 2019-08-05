/*
 * OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties_H_
#define _OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties();
	OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLogstacktraceonclose();

	/*! \brief Set 
	 */
	void setLogstacktraceonclose(ConfigNodePropertyBoolean  logstacktraceonclose);

private:
	ConfigNodePropertyBoolean logstacktraceonclose;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties_H_ */
