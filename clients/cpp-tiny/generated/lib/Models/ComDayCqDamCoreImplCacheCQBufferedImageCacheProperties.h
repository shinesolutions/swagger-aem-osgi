
/*
 * ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties();
    ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamimagecachemaxmemory();

	/*! \brief Set 
	 */
	void setCqdamimagecachemaxmemory(ConfigNodePropertyInteger cqdamimagecachemaxmemory);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamimagecachemaxage();

	/*! \brief Set 
	 */
	void setCqdamimagecachemaxage(ConfigNodePropertyInteger cqdamimagecachemaxage);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdamimagecachemaxdimension();

	/*! \brief Set 
	 */
	void setCqdamimagecachemaxdimension(ConfigNodePropertyString cqdamimagecachemaxdimension);


    private:
    ConfigNodePropertyInteger cqdamimagecachemaxmemory;
    ConfigNodePropertyInteger cqdamimagecachemaxage;
    ConfigNodePropertyString cqdamimagecachemaxdimension;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties_H_ */
