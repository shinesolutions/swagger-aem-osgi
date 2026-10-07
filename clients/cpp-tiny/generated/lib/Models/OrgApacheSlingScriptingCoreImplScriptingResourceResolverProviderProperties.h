
/*
 * OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties();
    OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLogstacktraceonclose();

	/*! \brief Set 
	 */
	void setLogstacktraceonclose(ConfigNodePropertyBoolean logstacktraceonclose);


    private:
    ConfigNodePropertyBoolean logstacktraceonclose;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties_H_ */
