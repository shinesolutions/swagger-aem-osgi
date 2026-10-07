/*
 * ComDayCqDamCoreProcessMetadataProcessorProcessProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreProcessMetadataProcessorProcessProperties_H_
#define _ComDayCqDamCoreProcessMetadataProcessorProcessProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqDamCoreProcessMetadataProcessorProcessProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreProcessMetadataProcessorProcessProperties();
	ComDayCqDamCoreProcessMetadataProcessorProcessProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreProcessMetadataProcessorProcessProperties();

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
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqdammetadataxssprotectedproperties();

	/*! \brief Set 
	 */
	void setCqdammetadataxssprotectedproperties(ConfigNodePropertyArray  cqdammetadataxssprotectedproperties);

private:
	ConfigNodePropertyString processlabel;
	ConfigNodePropertyBoolean cqdamenablesha1;
	ConfigNodePropertyArray cqdammetadataxssprotectedproperties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreProcessMetadataProcessorProcessProperties_H_ */
