//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_properties.g.dart';

/// ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties
///
/// Properties:
/// * [defaultPeriodAttachmentPeriodTypePeriodBlacklist] 
/// * [baselinePeriodAttachmentPeriodTypePeriodBlacklist] 
@BuiltValue()
abstract class ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties implements Built<ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties, ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesBuilder> {
  @BuiltValueField(wireName: r'default.attachment.type.blacklist')
  ConfigNodePropertyArray? get defaultPeriodAttachmentPeriodTypePeriodBlacklist;

  @BuiltValueField(wireName: r'baseline.attachment.type.blacklist')
  ConfigNodePropertyArray? get baselinePeriodAttachmentPeriodTypePeriodBlacklist;

  ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties._();

  factory ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties([void updates(ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesBuilder b)]) = _$ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties> get serializer => _$ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesSerializer();
}

class _$ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties, _$ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties];

  @override
  final String wireName = r'ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties object, {
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
    ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesBuilder result,
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
  ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesBuilder();
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

