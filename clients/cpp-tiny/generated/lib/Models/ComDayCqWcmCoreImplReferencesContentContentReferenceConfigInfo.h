
/*
 * ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo();
    ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo();


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
	ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo_H_ */
