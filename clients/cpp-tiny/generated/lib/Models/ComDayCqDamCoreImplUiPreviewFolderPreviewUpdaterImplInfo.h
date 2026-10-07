
/*
 * ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo();
    ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo_H_ */
