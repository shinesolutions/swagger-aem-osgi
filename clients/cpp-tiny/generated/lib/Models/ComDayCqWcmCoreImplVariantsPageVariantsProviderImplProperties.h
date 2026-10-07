
/*
 * ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties_H_


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

class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties();
    ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultexternalizerdomain();

	/*! \brief Set 
	 */
	void setDefaultexternalizerdomain(ConfigNodePropertyString defaultexternalizerdomain);


    private:
    ConfigNodePropertyString defaultexternalizerdomain;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties_H_ */
