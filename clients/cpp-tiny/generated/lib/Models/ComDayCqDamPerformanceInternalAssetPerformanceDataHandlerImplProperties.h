
/*
 * ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties();
    ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getBatchcommitsize();

	/*! \brief Set 
	 */
	void setBatchcommitsize(ConfigNodePropertyInteger batchcommitsize);


    private:
    ConfigNodePropertyInteger batchcommitsize;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties_H_ */
