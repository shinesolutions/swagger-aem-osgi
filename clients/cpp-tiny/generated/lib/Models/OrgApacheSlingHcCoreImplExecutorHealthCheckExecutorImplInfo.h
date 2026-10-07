
/*
 * OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo_H_
#define TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo();
    OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo();


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
	OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo_H_ */
