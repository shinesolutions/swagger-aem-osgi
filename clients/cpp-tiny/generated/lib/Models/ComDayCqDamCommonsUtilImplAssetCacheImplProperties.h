
/*
 * ComDayCqDamCommonsUtilImplAssetCacheImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCommonsUtilImplAssetCacheImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCommonsUtilImplAssetCacheImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCommonsUtilImplAssetCacheImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCommonsUtilImplAssetCacheImplProperties();
    ComDayCqDamCommonsUtilImplAssetCacheImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCommonsUtilImplAssetCacheImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLargefilemin();

	/*! \brief Set 
	 */
	void setLargefilemin(ConfigNodePropertyInteger largefilemin);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCacheapply();

	/*! \brief Set 
	 */
	void setCacheapply(ConfigNodePropertyBoolean cacheapply);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getMimetypes();

	/*! \brief Set 
	 */
	void setMimetypes(ConfigNodePropertyArray mimetypes);


    private:
    ConfigNodePropertyInteger largefilemin;
    ConfigNodePropertyBoolean cacheapply;
    ConfigNodePropertyArray mimetypes;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCommonsUtilImplAssetCacheImplProperties_H_ */
