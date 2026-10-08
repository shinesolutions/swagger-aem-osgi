
/*
 * ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties();
    ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getGetCacheExpirationUnit();

	/*! \brief Set 
	 */
	void setGetCacheExpirationUnit(ConfigNodePropertyDropDown getCacheExpirationUnit);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getGetCacheExpirationValue();

	/*! \brief Set 
	 */
	void setGetCacheExpirationValue(ConfigNodePropertyInteger getCacheExpirationValue);


    private:
    ConfigNodePropertyDropDown getCacheExpirationUnit;
    ConfigNodePropertyInteger getCacheExpirationValue;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties_H_ */
