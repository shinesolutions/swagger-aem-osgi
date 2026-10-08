
/*
 * ComDayCqDamCoreImplServletBatchMetadataServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplServletBatchMetadataServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplServletBatchMetadataServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplServletBatchMetadataServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplServletBatchMetadataServletProperties();
    ComDayCqDamCoreImplServletBatchMetadataServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplServletBatchMetadataServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqdambatchmetadataassetdefault();

	/*! \brief Set 
	 */
	void setCqdambatchmetadataassetdefault(ConfigNodePropertyArray cqdambatchmetadataassetdefault);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqdambatchmetadatacollectiondefault();

	/*! \brief Set 
	 */
	void setCqdambatchmetadatacollectiondefault(ConfigNodePropertyArray cqdambatchmetadatacollectiondefault);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdambatchmetadatamaxresources();

	/*! \brief Set 
	 */
	void setCqdambatchmetadatamaxresources(ConfigNodePropertyInteger cqdambatchmetadatamaxresources);


    private:
    ConfigNodePropertyArray cqdambatchmetadataassetdefault;
    ConfigNodePropertyArray cqdambatchmetadatacollectiondefault;
    ConfigNodePropertyInteger cqdambatchmetadatamaxresources;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplServletBatchMetadataServletProperties_H_ */
