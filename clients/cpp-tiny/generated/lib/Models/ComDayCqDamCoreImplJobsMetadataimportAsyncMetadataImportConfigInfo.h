
/*
 * ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo();
    ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo();


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
	ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo_H_ */
