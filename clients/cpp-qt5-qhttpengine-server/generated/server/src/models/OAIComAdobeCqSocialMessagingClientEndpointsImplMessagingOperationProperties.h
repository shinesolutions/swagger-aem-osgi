/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAIComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties_H
#define OAIComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyArray.h"
#include "OAIConfigNodePropertyBoolean.h"
#include "OAIConfigNodePropertyInteger.h"
#include "OAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties: public OAIObject {
public:
    OAIComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties();
    OAIComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties(QString json);
    ~OAIComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyArray getMessageProperties() const;
    void setMessageProperties(const OAIConfigNodePropertyArray &message_properties);

    OAIConfigNodePropertyInteger getMessageBoxSizeLimit() const;
    void setMessageBoxSizeLimit(const OAIConfigNodePropertyInteger &message_box_size_limit);

    OAIConfigNodePropertyInteger getMessageCountLimit() const;
    void setMessageCountLimit(const OAIConfigNodePropertyInteger &message_count_limit);

    OAIConfigNodePropertyBoolean getNotifyFailure() const;
    void setNotifyFailure(const OAIConfigNodePropertyBoolean &notify_failure);

    OAIConfigNodePropertyString getFailureMessageFrom() const;
    void setFailureMessageFrom(const OAIConfigNodePropertyString &failure_message_from);

    OAIConfigNodePropertyString getFailureTemplatePath() const;
    void setFailureTemplatePath(const OAIConfigNodePropertyString &failure_template_path);

    OAIConfigNodePropertyInteger getMaxRetries() const;
    void setMaxRetries(const OAIConfigNodePropertyInteger &max_retries);

    OAIConfigNodePropertyInteger getMinWaitBetweenRetries() const;
    void setMinWaitBetweenRetries(const OAIConfigNodePropertyInteger &min_wait_between_retries);

    OAIConfigNodePropertyInteger getCountUpdatePoolSize() const;
    void setCountUpdatePoolSize(const OAIConfigNodePropertyInteger &count_update_pool_size);

    OAIConfigNodePropertyString getInboxPath() const;
    void setInboxPath(const OAIConfigNodePropertyString &inbox_path);

    OAIConfigNodePropertyString getSentitemsPath() const;
    void setSentitemsPath(const OAIConfigNodePropertyString &sentitems_path);

    OAIConfigNodePropertyBoolean getSupportAttachments() const;
    void setSupportAttachments(const OAIConfigNodePropertyBoolean &support_attachments);

    OAIConfigNodePropertyBoolean getSupportGroupMessaging() const;
    void setSupportGroupMessaging(const OAIConfigNodePropertyBoolean &support_group_messaging);

    OAIConfigNodePropertyInteger getMaxTotalRecipients() const;
    void setMaxTotalRecipients(const OAIConfigNodePropertyInteger &max_total_recipients);

    OAIConfigNodePropertyInteger getBatchSize() const;
    void setBatchSize(const OAIConfigNodePropertyInteger &batch_size);

    OAIConfigNodePropertyInteger getMaxTotalAttachmentSize() const;
    void setMaxTotalAttachmentSize(const OAIConfigNodePropertyInteger &max_total_attachment_size);

    OAIConfigNodePropertyArray getAttachmentTypeBlacklist() const;
    void setAttachmentTypeBlacklist(const OAIConfigNodePropertyArray &attachment_type_blacklist);

    OAIConfigNodePropertyArray getAllowedAttachmentTypes() const;
    void setAllowedAttachmentTypes(const OAIConfigNodePropertyArray &allowed_attachment_types);

    OAIConfigNodePropertyString getServiceSelector() const;
    void setServiceSelector(const OAIConfigNodePropertyString &service_selector);

    OAIConfigNodePropertyArray getFieldWhitelist() const;
    void setFieldWhitelist(const OAIConfigNodePropertyArray &field_whitelist);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyArray message_properties;
    bool m_message_properties_isSet;

    OAIConfigNodePropertyInteger message_box_size_limit;
    bool m_message_box_size_limit_isSet;

    OAIConfigNodePropertyInteger message_count_limit;
    bool m_message_count_limit_isSet;

    OAIConfigNodePropertyBoolean notify_failure;
    bool m_notify_failure_isSet;

    OAIConfigNodePropertyString failure_message_from;
    bool m_failure_message_from_isSet;

    OAIConfigNodePropertyString failure_template_path;
    bool m_failure_template_path_isSet;

    OAIConfigNodePropertyInteger max_retries;
    bool m_max_retries_isSet;

    OAIConfigNodePropertyInteger min_wait_between_retries;
    bool m_min_wait_between_retries_isSet;

    OAIConfigNodePropertyInteger count_update_pool_size;
    bool m_count_update_pool_size_isSet;

    OAIConfigNodePropertyString inbox_path;
    bool m_inbox_path_isSet;

    OAIConfigNodePropertyString sentitems_path;
    bool m_sentitems_path_isSet;

    OAIConfigNodePropertyBoolean support_attachments;
    bool m_support_attachments_isSet;

    OAIConfigNodePropertyBoolean support_group_messaging;
    bool m_support_group_messaging_isSet;

    OAIConfigNodePropertyInteger max_total_recipients;
    bool m_max_total_recipients_isSet;

    OAIConfigNodePropertyInteger batch_size;
    bool m_batch_size_isSet;

    OAIConfigNodePropertyInteger max_total_attachment_size;
    bool m_max_total_attachment_size_isSet;

    OAIConfigNodePropertyArray attachment_type_blacklist;
    bool m_attachment_type_blacklist_isSet;

    OAIConfigNodePropertyArray allowed_attachment_types;
    bool m_allowed_attachment_types_isSet;

    OAIConfigNodePropertyString service_selector;
    bool m_service_selector_isSet;

    OAIConfigNodePropertyArray field_whitelist;
    bool m_field_whitelist_isSet;

};

}

#endif // OAIComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties_H