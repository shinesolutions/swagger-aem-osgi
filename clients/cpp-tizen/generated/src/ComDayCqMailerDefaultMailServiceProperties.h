/*
 * ComDayCqMailerDefaultMailServiceProperties.h
 *
 * 
 */

#ifndef _ComDayCqMailerDefaultMailServiceProperties_H_
#define _ComDayCqMailerDefaultMailServiceProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqMailerDefaultMailServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqMailerDefaultMailServiceProperties();
	ComDayCqMailerDefaultMailServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqMailerDefaultMailServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSmtphost();

	/*! \brief Set 
	 */
	void setSmtphost(ConfigNodePropertyString  smtphost);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSmtpport();

	/*! \brief Set 
	 */
	void setSmtpport(ConfigNodePropertyInteger  smtpport);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSmtpuser();

	/*! \brief Set 
	 */
	void setSmtpuser(ConfigNodePropertyString  smtpuser);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSmtppassword();

	/*! \brief Set 
	 */
	void setSmtppassword(ConfigNodePropertyString  smtppassword);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFromaddress();

	/*! \brief Set 
	 */
	void setFromaddress(ConfigNodePropertyString  fromaddress);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSmtpssl();

	/*! \brief Set 
	 */
	void setSmtpssl(ConfigNodePropertyBoolean  smtpssl);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSmtpstarttls();

	/*! \brief Set 
	 */
	void setSmtpstarttls(ConfigNodePropertyBoolean  smtpstarttls);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDebugemail();

	/*! \brief Set 
	 */
	void setDebugemail(ConfigNodePropertyBoolean  debugemail);

private:
	ConfigNodePropertyString smtphost;
	ConfigNodePropertyInteger smtpport;
	ConfigNodePropertyString smtpuser;
	ConfigNodePropertyString smtppassword;
	ConfigNodePropertyString fromaddress;
	ConfigNodePropertyBoolean smtpssl;
	ConfigNodePropertyBoolean smtpstarttls;
	ConfigNodePropertyBoolean debugemail;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqMailerDefaultMailServiceProperties_H_ */
