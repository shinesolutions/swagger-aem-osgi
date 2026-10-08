
/*
 * ComDayCqPollingImporterImplManagedPollConfigImplInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqPollingImporterImplManagedPollConfigImplInfo_H_
#define TINY_CPP_CLIENT_ComDayCqPollingImporterImplManagedPollConfigImplInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComDayCqPollingImporterImplManagedPollConfigImplProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqPollingImporterImplManagedPollConfigImplInfo{
public:

    /*! \brief Constructor.
	 */
    ComDayCqPollingImporterImplManagedPollConfigImplInfo();
    ComDayCqPollingImporterImplManagedPollConfigImplInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqPollingImporterImplManagedPollConfigImplInfo();


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
	ComDayCqPollingImporterImplManagedPollConfigImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqPollingImporterImplManagedPollConfigImplProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComDayCqPollingImporterImplManagedPollConfigImplProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqPollingImporterImplManagedPollConfigImplInfo_H_ */
