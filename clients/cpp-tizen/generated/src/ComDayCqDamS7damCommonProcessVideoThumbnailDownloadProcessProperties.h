/*
 * ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties_H_
#define _ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties_H_


#include <string>
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

class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties();
	ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties();

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

private:
	ConfigNodePropertyString processlabel;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties_H_ */
