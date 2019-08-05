/*
 * ComDayCqDamCoreImplHandlerJpegHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplHandlerJpegHandlerProperties_H_
#define _ComDayCqDamCoreImplHandlerJpegHandlerProperties_H_


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

class ComDayCqDamCoreImplHandlerJpegHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplHandlerJpegHandlerProperties();
	ComDayCqDamCoreImplHandlerJpegHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplHandlerJpegHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamenableextmetaextraction();

	/*! \brief Set 
	 */
	void setCqdamenableextmetaextraction(ConfigNodePropertyBoolean  cqdamenableextmetaextraction);
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

private:
	ConfigNodePropertyBoolean cqdamenableextmetaextraction;
	ConfigNodePropertyInteger large_file_threshold;
	ConfigNodePropertyInteger large_comment_threshold;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplHandlerJpegHandlerProperties_H_ */
