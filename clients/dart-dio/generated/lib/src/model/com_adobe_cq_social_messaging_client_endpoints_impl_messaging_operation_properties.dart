//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties.g.dart';

/// ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties
///
/// Properties:
/// * [messagePeriodProperties] 
/// * [messageBoxSizeLimit] 
/// * [messageCountLimit] 
/// * [notifyFailure] 
/// * [failureMessageFrom] 
/// * [failureTemplatePath] 
/// * [maxRetries] 
/// * [minWaitBetweenRetries] 
/// * [countUpdatePoolSize] 
/// * [inboxPeriodPath] 
/// * [sentitemsPeriodPath] 
/// * [supportAttachments] 
/// * [supportGroupMessaging] 
/// * [maxTotalRecipients] 
/// * [batchSize] 
/// * [maxTotalAttachmentSize] 
/// * [attachmentTypeBlacklist] 
/// * [allowedAttachmentTypes] 
/// * [serviceSelector] 
/// * [fieldWhitelist] 
@BuiltValue()
abstract class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties implements Built<ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties, ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder> {
  @BuiltValueField(wireName: r'message.properties')
  ConfigNodePropertyArray? get messagePeriodProperties;

  @BuiltValueField(wireName: r'messageBoxSizeLimit')
  ConfigNodePropertyInteger? get messageBoxSizeLimit;

  @BuiltValueField(wireName: r'messageCountLimit')
  ConfigNodePropertyInteger? get messageCountLimit;

  @BuiltValueField(wireName: r'notifyFailure')
  ConfigNodePropertyBoolean? get notifyFailure;

  @BuiltValueField(wireName: r'failureMessageFrom')
  ConfigNodePropertyString? get failureMessageFrom;

  @BuiltValueField(wireName: r'failureTemplatePath')
  ConfigNodePropertyString? get failureTemplatePath;

  @BuiltValueField(wireName: r'maxRetries')
  ConfigNodePropertyInteger? get maxRetries;

  @BuiltValueField(wireName: r'minWaitBetweenRetries')
  ConfigNodePropertyInteger? get minWaitBetweenRetries;

  @BuiltValueField(wireName: r'countUpdatePoolSize')
  ConfigNodePropertyInteger? get countUpdatePoolSize;

  @BuiltValueField(wireName: r'inbox.path')
  ConfigNodePropertyString? get inboxPeriodPath;

  @BuiltValueField(wireName: r'sentitems.path')
  ConfigNodePropertyString? get sentitemsPeriodPath;

  @BuiltValueField(wireName: r'supportAttachments')
  ConfigNodePropertyBoolean? get supportAttachments;

  @BuiltValueField(wireName: r'supportGroupMessaging')
  ConfigNodePropertyBoolean? get supportGroupMessaging;

  @BuiltValueField(wireName: r'maxTotalRecipients')
  ConfigNodePropertyInteger? get maxTotalRecipients;

  @BuiltValueField(wireName: r'batchSize')
  ConfigNodePropertyInteger? get batchSize;

  @BuiltValueField(wireName: r'maxTotalAttachmentSize')
  ConfigNodePropertyInteger? get maxTotalAttachmentSize;

  @BuiltValueField(wireName: r'attachmentTypeBlacklist')
  ConfigNodePropertyArray? get attachmentTypeBlacklist;

  @BuiltValueField(wireName: r'allowedAttachmentTypes')
  ConfigNodePropertyArray? get allowedAttachmentTypes;

  @BuiltValueField(wireName: r'serviceSelector')
  ConfigNodePropertyString? get serviceSelector;

  @BuiltValueField(wireName: r'fieldWhitelist')
  ConfigNodePropertyArray? get fieldWhitelist;

  ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties._();

  factory ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties([void updates(ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder b)]) = _$ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties> get serializer => _$ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesSerializer();
}

class _$ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties, _$ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties];

  @override
  final String wireName = r'ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.messagePeriodProperties != null) {
      yield r'message.properties';
      yield serializers.serialize(
        object.messagePeriodProperties,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.messageBoxSizeLimit != null) {
      yield r'messageBoxSizeLimit';
      yield serializers.serialize(
        object.messageBoxSizeLimit,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.messageCountLimit != null) {
      yield r'messageCountLimit';
      yield serializers.serialize(
        object.messageCountLimit,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.notifyFailure != null) {
      yield r'notifyFailure';
      yield serializers.serialize(
        object.notifyFailure,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.failureMessageFrom != null) {
      yield r'failureMessageFrom';
      yield serializers.serialize(
        object.failureMessageFrom,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.failureTemplatePath != null) {
      yield r'failureTemplatePath';
      yield serializers.serialize(
        object.failureTemplatePath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.maxRetries != null) {
      yield r'maxRetries';
      yield serializers.serialize(
        object.maxRetries,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.minWaitBetweenRetries != null) {
      yield r'minWaitBetweenRetries';
      yield serializers.serialize(
        object.minWaitBetweenRetries,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.countUpdatePoolSize != null) {
      yield r'countUpdatePoolSize';
      yield serializers.serialize(
        object.countUpdatePoolSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.inboxPeriodPath != null) {
      yield r'inbox.path';
      yield serializers.serialize(
        object.inboxPeriodPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.sentitemsPeriodPath != null) {
      yield r'sentitems.path';
      yield serializers.serialize(
        object.sentitemsPeriodPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.supportAttachments != null) {
      yield r'supportAttachments';
      yield serializers.serialize(
        object.supportAttachments,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.supportGroupMessaging != null) {
      yield r'supportGroupMessaging';
      yield serializers.serialize(
        object.supportGroupMessaging,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.maxTotalRecipients != null) {
      yield r'maxTotalRecipients';
      yield serializers.serialize(
        object.maxTotalRecipients,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.batchSize != null) {
      yield r'batchSize';
      yield serializers.serialize(
        object.batchSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxTotalAttachmentSize != null) {
      yield r'maxTotalAttachmentSize';
      yield serializers.serialize(
        object.maxTotalAttachmentSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.attachmentTypeBlacklist != null) {
      yield r'attachmentTypeBlacklist';
      yield serializers.serialize(
        object.attachmentTypeBlacklist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.allowedAttachmentTypes != null) {
      yield r'allowedAttachmentTypes';
      yield serializers.serialize(
        object.allowedAttachmentTypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.serviceSelector != null) {
      yield r'serviceSelector';
      yield serializers.serialize(
        object.serviceSelector,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.fieldWhitelist != null) {
      yield r'fieldWhitelist';
      yield serializers.serialize(
        object.fieldWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'message.properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.messagePeriodProperties.replace(valueDes);
          break;
        case r'messageBoxSizeLimit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.messageBoxSizeLimit.replace(valueDes);
          break;
        case r'messageCountLimit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.messageCountLimit.replace(valueDes);
          break;
        case r'notifyFailure':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.notifyFailure.replace(valueDes);
          break;
        case r'failureMessageFrom':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.failureMessageFrom.replace(valueDes);
          break;
        case r'failureTemplatePath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.failureTemplatePath.replace(valueDes);
          break;
        case r'maxRetries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxRetries.replace(valueDes);
          break;
        case r'minWaitBetweenRetries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.minWaitBetweenRetries.replace(valueDes);
          break;
        case r'countUpdatePoolSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.countUpdatePoolSize.replace(valueDes);
          break;
        case r'inbox.path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.inboxPeriodPath.replace(valueDes);
          break;
        case r'sentitems.path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.sentitemsPeriodPath.replace(valueDes);
          break;
        case r'supportAttachments':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.supportAttachments.replace(valueDes);
          break;
        case r'supportGroupMessaging':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.supportGroupMessaging.replace(valueDes);
          break;
        case r'maxTotalRecipients':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxTotalRecipients.replace(valueDes);
          break;
        case r'batchSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.batchSize.replace(valueDes);
          break;
        case r'maxTotalAttachmentSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxTotalAttachmentSize.replace(valueDes);
          break;
        case r'attachmentTypeBlacklist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.attachmentTypeBlacklist.replace(valueDes);
          break;
        case r'allowedAttachmentTypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.allowedAttachmentTypes.replace(valueDes);
          break;
        case r'serviceSelector':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.serviceSelector.replace(valueDes);
          break;
        case r'fieldWhitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.fieldWhitelist.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

