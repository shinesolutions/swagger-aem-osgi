
/*
 * ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties_H_
#define TINY_CPP_CLIENT_ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties();
    ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getMaileremailembed();

	/*! \brief Set 
	 */
	void setMaileremailembed(ConfigNodePropertyBoolean maileremailembed);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaileremailcharset();

	/*! \brief Set 
	 */
	void setMaileremailcharset(ConfigNodePropertyString maileremailcharset);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaileremailretrieverUserID();

	/*! \brief Set 
	 */
	void setMaileremailretrieverUserID(ConfigNodePropertyString maileremailretrieverUserID);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaileremailretrieverUserPWD();

	/*! \brief Set 
	 */
	void setMaileremailretrieverUserPWD(ConfigNodePropertyString maileremailretrieverUserPWD);


    private:
    ConfigNodePropertyBoolean maileremailembed;
    ConfigNodePropertyString maileremailcharset;
    ConfigNodePropertyString maileremailretrieverUserID;
    ConfigNodePropertyString maileremailretrieverUserPWD;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties_H_ */
