//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties.g.dart';

/// ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties
///
/// Properties:
/// * [emailPeriodName] 
/// * [emailPeriodCreatePostFromReply] 
/// * [emailPeriodAddCommentIdTo] 
/// * [emailPeriodSubjectMaximumLength] 
/// * [emailPeriodReplyToAddress] 
/// * [emailPeriodReplyToDelimiter] 
/// * [emailPeriodTrackerIdPrefixInSubject] 
/// * [emailPeriodTrackerIdPrefixInBody] 
/// * [emailPeriodAsHTML] 
/// * [emailPeriodDefaultUserName] 
/// * [emailPeriodTemplatesPeriodRootPath] 
@BuiltValue()
abstract class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties implements Built<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties, ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder> {
  @BuiltValueField(wireName: r'email.name')
  ConfigNodePropertyString? get emailPeriodName;

  @BuiltValueField(wireName: r'email.createPostFromReply')
  ConfigNodePropertyBoolean? get emailPeriodCreatePostFromReply;

  @BuiltValueField(wireName: r'email.addCommentIdTo')
  ConfigNodePropertyDropDown? get emailPeriodAddCommentIdTo;

  @BuiltValueField(wireName: r'email.subjectMaximumLength')
  ConfigNodePropertyInteger? get emailPeriodSubjectMaximumLength;

  @BuiltValueField(wireName: r'email.replyToAddress')
  ConfigNodePropertyString? get emailPeriodReplyToAddress;

  @BuiltValueField(wireName: r'email.replyToDelimiter')
  ConfigNodePropertyString? get emailPeriodReplyToDelimiter;

  @BuiltValueField(wireName: r'email.trackerIdPrefixInSubject')
  ConfigNodePropertyString? get emailPeriodTrackerIdPrefixInSubject;

  @BuiltValueField(wireName: r'email.trackerIdPrefixInBody')
  ConfigNodePropertyString? get emailPeriodTrackerIdPrefixInBody;

  @BuiltValueField(wireName: r'email.asHTML')
  ConfigNodePropertyBoolean? get emailPeriodAsHTML;

  @BuiltValueField(wireName: r'email.defaultUserName')
  ConfigNodePropertyString? get emailPeriodDefaultUserName;

  @BuiltValueField(wireName: r'email.templates.rootPath')
  ConfigNodePropertyString? get emailPeriodTemplatesPeriodRootPath;

  ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties._();

  factory ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties([void updates(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder b)]) = _$ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties> get serializer => _$ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesSerializer();
}

class _$ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties, _$ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.emailPeriodName != null) {
      yield r'email.name';
      yield serializers.serialize(
        object.emailPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.emailPeriodCreatePostFromReply != null) {
      yield r'email.createPostFromReply';
      yield serializers.serialize(
        object.emailPeriodCreatePostFromReply,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.emailPeriodAddCommentIdTo != null) {
      yield r'email.addCommentIdTo';
      yield serializers.serialize(
        object.emailPeriodAddCommentIdTo,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.emailPeriodSubjectMaximumLength != null) {
      yield r'email.subjectMaximumLength';
      yield serializers.serialize(
        object.emailPeriodSubjectMaximumLength,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.emailPeriodReplyToAddress != null) {
      yield r'email.replyToAddress';
      yield serializers.serialize(
        object.emailPeriodReplyToAddress,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.emailPeriodReplyToDelimiter != null) {
      yield r'email.replyToDelimiter';
      yield serializers.serialize(
        object.emailPeriodReplyToDelimiter,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.emailPeriodTrackerIdPrefixInSubject != null) {
      yield r'email.trackerIdPrefixInSubject';
      yield serializers.serialize(
        object.emailPeriodTrackerIdPrefixInSubject,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.emailPeriodTrackerIdPrefixInBody != null) {
      yield r'email.trackerIdPrefixInBody';
      yield serializers.serialize(
        object.emailPeriodTrackerIdPrefixInBody,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.emailPeriodAsHTML != null) {
      yield r'email.asHTML';
      yield serializers.serialize(
        object.emailPeriodAsHTML,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.emailPeriodDefaultUserName != null) {
      yield r'email.defaultUserName';
      yield serializers.serialize(
        object.emailPeriodDefaultUserName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.emailPeriodTemplatesPeriodRootPath != null) {
      yield r'email.templates.rootPath';
      yield serializers.serialize(
        object.emailPeriodTemplatesPeriodRootPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'email.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.emailPeriodName.replace(valueDes);
          break;
        case r'email.createPostFromReply':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.emailPeriodCreatePostFromReply.replace(valueDes);
          break;
        case r'email.addCommentIdTo':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.emailPeriodAddCommentIdTo.replace(valueDes);
          break;
        case r'email.subjectMaximumLength':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.emailPeriodSubjectMaximumLength.replace(valueDes);
          break;
        case r'email.replyToAddress':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.emailPeriodReplyToAddress.replace(valueDes);
          break;
        case r'email.replyToDelimiter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.emailPeriodReplyToDelimiter.replace(valueDes);
          break;
        case r'email.trackerIdPrefixInSubject':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.emailPeriodTrackerIdPrefixInSubject.replace(valueDes);
          break;
        case r'email.trackerIdPrefixInBody':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.emailPeriodTrackerIdPrefixInBody.replace(valueDes);
          break;
        case r'email.asHTML':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.emailPeriodAsHTML.replace(valueDes);
          break;
        case r'email.defaultUserName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.emailPeriodDefaultUserName.replace(valueDes);
          break;
        case r'email.templates.rootPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.emailPeriodTemplatesPeriodRootPath.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesBuilder();
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

