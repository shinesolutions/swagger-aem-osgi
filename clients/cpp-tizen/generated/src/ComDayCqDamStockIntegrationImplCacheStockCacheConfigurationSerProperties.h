/*
 * ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties_H_
#define _ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties_H_


#include <string>
#include "ConfigNodePropertyDropDown.h"
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

class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties();
	ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getGetCacheExpirationUnit();

	/*! \brief Set 
	 */
	void setGetCacheExpirationUnit(ConfigNodePropertyDropDown  getCacheExpirationUnit);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getGetCacheExpirationValue();

	/*! \brief Set 
	 */
	void setGetCacheExpirationValue(ConfigNodePropertyInteger  getCacheExpirationValue);

private:
	ConfigNodePropertyDropDown getCacheExpirationUnit;
	ConfigNodePropertyInteger getCacheExpirationValue;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties_H_ */
