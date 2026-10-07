
/*
 * OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties_H_


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

class OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties();
    OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString name);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDescription();

	/*! \brief Set 
	 */
	void setDescription(ConfigNodePropertyString description);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyString description;
    ConfigNodePropertyBoolean enabled;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties_H_ */
