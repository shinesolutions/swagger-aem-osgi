
/*
 * ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties();
    ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties();


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


    private:
    ConfigNodePropertyString jmxobjectname;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties_H_ */
