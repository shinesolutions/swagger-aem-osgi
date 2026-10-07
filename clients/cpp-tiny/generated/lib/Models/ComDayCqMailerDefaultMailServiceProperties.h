
/*
 * ComDayCqMailerDefaultMailServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqMailerDefaultMailServiceProperties_H_
#define TINY_CPP_CLIENT_ComDayCqMailerDefaultMailServiceProperties_H_


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

class ComDayCqMailerDefaultMailServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqMailerDefaultMailServiceProperties();
    ComDayCqMailerDefaultMailServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqMailerDefaultMailServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSmtphost();

	/*! \brief Set 
	 */
	void setSmtphost(ConfigNodePropertyString smtphost);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSmtpport();

	/*! \brief Set 
	 */
	void setSmtpport(ConfigNodePropertyInteger smtpport);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSmtpuser();

	/*! \brief Set 
	 */
	void setSmtpuser(ConfigNodePropertyString smtpuser);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSmtppassword();

	/*! \brief Set 
	 */
	void setSmtppassword(ConfigNodePropertyString smtppassword);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFromaddress();

	/*! \brief Set 
	 */
	void setFromaddress(ConfigNodePropertyString fromaddress);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSmtpssl();

	/*! \brief Set 
	 */
	void setSmtpssl(ConfigNodePropertyBoolean smtpssl);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSmtpstarttls();

	/*! \brief Set 
	 */
	void setSmtpstarttls(ConfigNodePropertyBoolean smtpstarttls);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDebugemail();

	/*! \brief Set 
	 */
	void setDebugemail(ConfigNodePropertyBoolean debugemail);


    private:
    ConfigNodePropertyString smtphost;
    ConfigNodePropertyInteger smtpport;
    ConfigNodePropertyString smtpuser;
    ConfigNodePropertyString smtppassword;
    ConfigNodePropertyString fromaddress;
    ConfigNodePropertyBoolean smtpssl;
    ConfigNodePropertyBoolean smtpstarttls;
    ConfigNodePropertyBoolean debugemail;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqMailerDefaultMailServiceProperties_H_ */
