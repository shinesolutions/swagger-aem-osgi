
/*
 * OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo_H_
#define TINY_CPP_CLIENT_OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo();
    OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo();


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
	OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo_H_ */
