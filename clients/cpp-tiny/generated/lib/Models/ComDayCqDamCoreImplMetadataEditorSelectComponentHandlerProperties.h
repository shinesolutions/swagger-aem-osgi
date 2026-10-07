
/*
 * ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties_H_


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

class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties();
    ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getGranitedata();

	/*! \brief Set 
	 */
	void setGranitedata(ConfigNodePropertyArray granitedata);


    private:
    ConfigNodePropertyArray granitedata;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties_H_ */
