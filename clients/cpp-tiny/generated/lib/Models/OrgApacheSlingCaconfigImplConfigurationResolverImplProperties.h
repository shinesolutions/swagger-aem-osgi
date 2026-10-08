
/*
 * OrgApacheSlingCaconfigImplConfigurationResolverImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingCaconfigImplConfigurationResolverImplProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingCaconfigImplConfigurationResolverImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCaconfigImplConfigurationResolverImplProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingCaconfigImplConfigurationResolverImplProperties();
    OrgApacheSlingCaconfigImplConfigurationResolverImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingCaconfigImplConfigurationResolverImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getConfigBucketNames();

	/*! \brief Set 
	 */
	void setConfigBucketNames(ConfigNodePropertyArray configBucketNames);


    private:
    ConfigNodePropertyArray configBucketNames;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingCaconfigImplConfigurationResolverImplProperties_H_ */
