/*
 * ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties_H_
#define _ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties_H_


#include <string>
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

class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties();
	ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamimagecachemaxmemory();

	/*! \brief Set 
	 */
	void setCqdamimagecachemaxmemory(ConfigNodePropertyInteger  cqdamimagecachemaxmemory);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamimagecachemaxage();

	/*! \brief Set 
	 */
	void setCqdamimagecachemaxage(ConfigNodePropertyInteger  cqdamimagecachemaxage);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdamimagecachemaxdimension();

	/*! \brief Set 
	 */
	void setCqdamimagecachemaxdimension(ConfigNodePropertyString  cqdamimagecachemaxdimension);

private:
	ConfigNodePropertyInteger cqdamimagecachemaxmemory;
	ConfigNodePropertyInteger cqdamimagecachemaxage;
	ConfigNodePropertyString cqdamimagecachemaxdimension;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties_H_ */
