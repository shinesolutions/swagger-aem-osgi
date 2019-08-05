/*
 * ComDayCqDamCoreImplProcessTextExtractionProcessProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplProcessTextExtractionProcessProperties_H_
#define _ComDayCqDamCoreImplProcessTextExtractionProcessProperties_H_


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

class ComDayCqDamCoreImplProcessTextExtractionProcessProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplProcessTextExtractionProcessProperties();
	ComDayCqDamCoreImplProcessTextExtractionProcessProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplProcessTextExtractionProcessProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getMimeTypes();

	/*! \brief Set 
	 */
	void setMimeTypes(ConfigNodePropertyArray  mimeTypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxExtract();

	/*! \brief Set 
	 */
	void setMaxExtract(ConfigNodePropertyInteger  maxExtract);

private:
	ConfigNodePropertyArray mimeTypes;
	ConfigNodePropertyInteger maxExtract;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplProcessTextExtractionProcessProperties_H_ */
