/*
 * ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties_H_
#define _ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties();
	ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCreatePreviewEnabled();

	/*! \brief Set 
	 */
	void setCreatePreviewEnabled(ConfigNodePropertyBoolean  createPreviewEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getUpdatePreviewEnabled();

	/*! \brief Set 
	 */
	void setUpdatePreviewEnabled(ConfigNodePropertyBoolean  updatePreviewEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueueSize();

	/*! \brief Set 
	 */
	void setQueueSize(ConfigNodePropertyInteger  queueSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFolderPreviewRenditionRegex();

	/*! \brief Set 
	 */
	void setFolderPreviewRenditionRegex(ConfigNodePropertyString  folderPreviewRenditionRegex);

private:
	ConfigNodePropertyBoolean createPreviewEnabled;
	ConfigNodePropertyBoolean updatePreviewEnabled;
	ConfigNodePropertyInteger queueSize;
	ConfigNodePropertyString folderPreviewRenditionRegex;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties_H_ */
