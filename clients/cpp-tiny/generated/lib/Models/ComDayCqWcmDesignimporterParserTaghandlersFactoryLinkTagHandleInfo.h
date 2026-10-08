
/*
 * ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo_H_
#define TINY_CPP_CLIENT_ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo();
    ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo();


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
	ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo_H_ */
