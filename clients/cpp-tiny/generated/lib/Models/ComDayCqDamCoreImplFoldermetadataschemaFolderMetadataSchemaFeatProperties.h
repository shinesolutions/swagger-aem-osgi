
/*
 * ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties_H_


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

class ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties();
    ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getIsEnabled();

	/*! \brief Set 
	 */
	void setIsEnabled(ConfigNodePropertyBoolean isEnabled);


    private:
    ConfigNodePropertyBoolean isEnabled;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties_H_ */
