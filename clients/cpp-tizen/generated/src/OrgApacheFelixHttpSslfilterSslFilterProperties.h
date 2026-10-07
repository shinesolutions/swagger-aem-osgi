/*
 * OrgApacheFelixHttpSslfilterSslFilterProperties.h
 *
 * 
 */

#ifndef _OrgApacheFelixHttpSslfilterSslFilterProperties_H_
#define _OrgApacheFelixHttpSslfilterSslFilterProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class OrgApacheFelixHttpSslfilterSslFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheFelixHttpSslfilterSslFilterProperties();
	OrgApacheFelixHttpSslfilterSslFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheFelixHttpSslfilterSslFilterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSslforwardheader();

	/*! \brief Set 
	 */
	void setSslforwardheader(ConfigNodePropertyString  sslforwardheader);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSslforwardvalue();

	/*! \brief Set 
	 */
	void setSslforwardvalue(ConfigNodePropertyString  sslforwardvalue);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSslforwardcertheader();

	/*! \brief Set 
	 */
	void setSslforwardcertheader(ConfigNodePropertyString  sslforwardcertheader);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRewriteabsoluteurls();

	/*! \brief Set 
	 */
	void setRewriteabsoluteurls(ConfigNodePropertyBoolean  rewriteabsoluteurls);

private:
	ConfigNodePropertyString sslforwardheader;
	ConfigNodePropertyString sslforwardvalue;
	ConfigNodePropertyString sslforwardcertheader;
	ConfigNodePropertyBoolean rewriteabsoluteurls;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheFelixHttpSslfilterSslFilterProperties_H_ */
