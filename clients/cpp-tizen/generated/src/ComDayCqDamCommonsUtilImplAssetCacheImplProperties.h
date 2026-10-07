/*
 * ComDayCqDamCommonsUtilImplAssetCacheImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCommonsUtilImplAssetCacheImplProperties_H_
#define _ComDayCqDamCommonsUtilImplAssetCacheImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqDamCommonsUtilImplAssetCacheImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCommonsUtilImplAssetCacheImplProperties();
	ComDayCqDamCommonsUtilImplAssetCacheImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCommonsUtilImplAssetCacheImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLargefilemin();

	/*! \brief Set 
	 */
	void setLargefilemin(ConfigNodePropertyInteger  largefilemin);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCacheapply();

	/*! \brief Set 
	 */
	void setCacheapply(ConfigNodePropertyBoolean  cacheapply);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getMimetypes();

	/*! \brief Set 
	 */
	void setMimetypes(ConfigNodePropertyArray  mimetypes);

private:
	ConfigNodePropertyInteger largefilemin;
	ConfigNodePropertyBoolean cacheapply;
	ConfigNodePropertyArray mimetypes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCommonsUtilImplAssetCacheImplProperties_H_ */
