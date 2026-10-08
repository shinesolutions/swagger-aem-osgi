
/*
 * ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties();
    ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getJmxobjectname();

	/*! \brief Set 
	 */
	void setJmxobjectname(ConfigNodePropertyString jmxobjectname);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getActive();

	/*! \brief Set 
	 */
	void setActive(ConfigNodePropertyBoolean active);


    private:
    ConfigNodePropertyString jmxobjectname;
    ConfigNodePropertyBoolean active;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties_H_ */
