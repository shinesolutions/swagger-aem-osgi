
/*
 * ComAdobeCqDamCfmImplConfFeatureConfigImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDamCfmImplConfFeatureConfigImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqDamCfmImplConfFeatureConfigImplProperties_H_


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

class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDamCfmImplConfFeatureConfigImplProperties();
    ComAdobeCqDamCfmImplConfFeatureConfigImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDamCfmImplConfFeatureConfigImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDamcfmresourceTypes();

	/*! \brief Set 
	 */
	void setDamcfmresourceTypes(ConfigNodePropertyArray damcfmresourceTypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDamcfmreferenceProperties();

	/*! \brief Set 
	 */
	void setDamcfmreferenceProperties(ConfigNodePropertyArray damcfmreferenceProperties);


    private:
    ConfigNodePropertyArray damcfmresourceTypes;
    ConfigNodePropertyArray damcfmreferenceProperties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqDamCfmImplConfFeatureConfigImplProperties_H_ */
