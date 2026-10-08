//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties.g.dart';

/// ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties
///
/// Properties:
/// * [defaultPeriodAttachmentPeriodTypePeriodBlacklist] 
/// * [baselinePeriodAttachmentPeriodTypePeriodBlacklist] 
@BuiltValue()
abstract class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties implements Built<ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties, ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesBuilder> {
  @BuiltValueField(wireName: r'default.attachment.type.blacklist')
  ConfigNodePropertyArray? get defaultPeriodAttachmentPeriodTypePeriodBlacklist;

  @BuiltValueField(wireName: r'baseline.attachment.type.blacklist')
  ConfigNodePropertyArray? get baselinePeriodAttachmentPeriodTypePeriodBlacklist;

  ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties._();

  factory ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties([void updates(ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesBuilder b)]) = _$ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties> get serializer => _$ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesSerializer();
}

class _$ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties, _$ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties];

  @override
  final String wireName = r'ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.defaultPeriodAttachmentPeriodTypePeriodBlacklist != null) {
      yield r'default.attachment.type.blacklist';
      yield serializers.serialize(
        object.defaultPeriodAttachmentPeriodTypePeriodBlacklist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.baselinePeriodAttachmentPeriodTypePeriodBlacklist != null) {
      yield r'baseline.attachment.type.blacklist';
      yield serializers.serialize(
        object.baselinePeriodAttachmentPeriodTypePeriodBlacklist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'default.attachment.type.blacklist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.defaultPeriodAttachmentPeriodTypePeriodBlacklist.replace(valueDes);
          break;
        case r'baseline.attachment.type.blacklist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.baselinePeriodAttachmentPeriodTypePeriodBlacklist.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesBuilder();
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

