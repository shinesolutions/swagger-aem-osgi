
/*
 * ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties();
    ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCreatePreviewEnabled();

	/*! \brief Set 
	 */
	void setCreatePreviewEnabled(ConfigNodePropertyBoolean createPreviewEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getUpdatePreviewEnabled();

	/*! \brief Set 
	 */
	void setUpdatePreviewEnabled(ConfigNodePropertyBoolean updatePreviewEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueueSize();

	/*! \brief Set 
	 */
	void setQueueSize(ConfigNodePropertyInteger queueSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFolderPreviewRenditionRegex();

	/*! \brief Set 
	 */
	void setFolderPreviewRenditionRegex(ConfigNodePropertyString folderPreviewRenditionRegex);


    private:
    ConfigNodePropertyBoolean createPreviewEnabled;
    ConfigNodePropertyBoolean updatePreviewEnabled;
    ConfigNodePropertyInteger queueSize;
    ConfigNodePropertyString folderPreviewRenditionRegex;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties_H_ */
