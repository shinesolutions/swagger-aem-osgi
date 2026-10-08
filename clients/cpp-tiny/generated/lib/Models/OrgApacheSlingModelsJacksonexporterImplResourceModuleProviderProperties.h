
/*
 * OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties_H_


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

class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties();
    OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxrecursionlevels();

	/*! \brief Set 
	 */
	void setMaxrecursionlevels(ConfigNodePropertyInteger maxrecursionlevels);


    private:
    ConfigNodePropertyInteger maxrecursionlevels;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties_H_ */
