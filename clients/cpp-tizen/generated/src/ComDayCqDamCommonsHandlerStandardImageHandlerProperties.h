/*
 * ComDayCqDamCommonsHandlerStandardImageHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCommonsHandlerStandardImageHandlerProperties_H_
#define _ComDayCqDamCommonsHandlerStandardImageHandlerProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqDamCommonsHandlerStandardImageHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCommonsHandlerStandardImageHandlerProperties();
	ComDayCqDamCommonsHandlerStandardImageHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCommonsHandlerStandardImageHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLargeFileThreshold();

	/*! \brief Set 
	 */
	void setLargeFileThreshold(ConfigNodePropertyInteger  large_file_threshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLargeCommentThreshold();

	/*! \brief Set 
	 */
	void setLargeCommentThreshold(ConfigNodePropertyInteger  large_comment_threshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamenableextmetaextraction();

	/*! \brief Set 
	 */
	void setCqdamenableextmetaextraction(ConfigNodePropertyBoolean  cqdamenableextmetaextraction);

private:
	ConfigNodePropertyInteger large_file_threshold;
	ConfigNodePropertyInteger large_comment_threshold;
	ConfigNodePropertyBoolean cqdamenableextmetaextraction;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCommonsHandlerStandardImageHandlerProperties_H_ */
