/*
 * ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties_H_
#define _ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties_H_


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

class ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties();
	ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties();

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

#endif /* _ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties_H_ */
