
/*
 * ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties_H_


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

class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties();
    ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getContentReferenceConfigresourceTypes();

	/*! \brief Set 
	 */
	void setContentReferenceConfigresourceTypes(ConfigNodePropertyArray contentReferenceConfigresourceTypes);


    private:
    ConfigNodePropertyArray contentReferenceConfigresourceTypes;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties_H_ */
