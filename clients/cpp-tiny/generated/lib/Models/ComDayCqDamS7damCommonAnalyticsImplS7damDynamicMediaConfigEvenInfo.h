
/*
 * ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo_H_
#define TINY_CPP_CLIENT_ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo();
    ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo();


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
	ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo_H_ */
