/*
 * ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties_H_
#define _ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties();
	ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFormsformparagraphpostprocessorenabled();

	/*! \brief Set 
	 */
	void setFormsformparagraphpostprocessorenabled(ConfigNodePropertyBoolean  formsformparagraphpostprocessorenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFormsformparagraphpostprocessorformresourcetypes();

	/*! \brief Set 
	 */
	void setFormsformparagraphpostprocessorformresourcetypes(ConfigNodePropertyArray  formsformparagraphpostprocessorformresourcetypes);

private:
	ConfigNodePropertyBoolean formsformparagraphpostprocessorenabled;
	ConfigNodePropertyArray formsformparagraphpostprocessorformresourcetypes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties_H_ */
