/*
 * ComDayCqDamCoreImplServletBatchMetadataServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplServletBatchMetadataServletProperties_H_
#define _ComDayCqDamCoreImplServletBatchMetadataServletProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplServletBatchMetadataServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplServletBatchMetadataServletProperties();
	ComDayCqDamCoreImplServletBatchMetadataServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplServletBatchMetadataServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqdambatchmetadataassetdefault();

	/*! \brief Set 
	 */
	void setCqdambatchmetadataassetdefault(ConfigNodePropertyArray  cqdambatchmetadataassetdefault);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqdambatchmetadatacollectiondefault();

	/*! \brief Set 
	 */
	void setCqdambatchmetadatacollectiondefault(ConfigNodePropertyArray  cqdambatchmetadatacollectiondefault);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdambatchmetadatamaxresources();

	/*! \brief Set 
	 */
	void setCqdambatchmetadatamaxresources(ConfigNodePropertyInteger  cqdambatchmetadatamaxresources);

private:
	ConfigNodePropertyArray cqdambatchmetadataassetdefault;
	ConfigNodePropertyArray cqdambatchmetadatacollectiondefault;
	ConfigNodePropertyInteger cqdambatchmetadatamaxresources;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplServletBatchMetadataServletProperties_H_ */
