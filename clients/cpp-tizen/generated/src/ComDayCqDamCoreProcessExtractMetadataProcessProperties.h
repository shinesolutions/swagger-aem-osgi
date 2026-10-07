/*
 * ComDayCqDamCoreProcessExtractMetadataProcessProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreProcessExtractMetadataProcessProperties_H_
#define _ComDayCqDamCoreProcessExtractMetadataProcessProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"
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

class ComDayCqDamCoreProcessExtractMetadataProcessProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreProcessExtractMetadataProcessProperties();
	ComDayCqDamCoreProcessExtractMetadataProcessProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreProcessExtractMetadataProcessProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getProcesslabel();

	/*! \brief Set 
	 */
	void setProcesslabel(ConfigNodePropertyString  processlabel);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamenablesha1();

	/*! \brief Set 
	 */
	void setCqdamenablesha1(ConfigNodePropertyBoolean  cqdamenablesha1);

private:
	ConfigNodePropertyString processlabel;
	ConfigNodePropertyBoolean cqdamenablesha1;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreProcessExtractMetadataProcessProperties_H_ */
