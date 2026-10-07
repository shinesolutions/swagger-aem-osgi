//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties.g.dart';

/// ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties
///
/// Properties:
/// * [enable] 
/// * [uGCLimit] 
/// * [ugcLimitDuration] 
/// * [domains] 
/// * [toList] 
@BuiltValue()
abstract class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties implements Built<ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties, ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesBuilder> {
  @BuiltValueField(wireName: r'enable')
  ConfigNodePropertyBoolean? get enable;

  @BuiltValueField(wireName: r'UGCLimit')
  ConfigNodePropertyInteger? get uGCLimit;

  @BuiltValueField(wireName: r'ugcLimitDuration')
  ConfigNodePropertyInteger? get ugcLimitDuration;

  @BuiltValueField(wireName: r'domains')
  ConfigNodePropertyArray? get domains;

  @BuiltValueField(wireName: r'toList')
  ConfigNodePropertyArray? get toList;

  ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties._();

  factory ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties([void updates(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesBuilder b)]) = _$ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties> get serializer => _$ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesSerializer();
}

class _$ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties, _$ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enable != null) {
      yield r'enable';
      yield serializers.serialize(
        object.enable,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.uGCLimit != null) {
      yield r'UGCLimit';
      yield serializers.serialize(
        object.uGCLimit,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.ugcLimitDuration != null) {
      yield r'ugcLimitDuration';
      yield serializers.serialize(
        object.ugcLimitDuration,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.domains != null) {
      yield r'domains';
      yield serializers.serialize(
        object.domains,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.toList != null) {
      yield r'toList';
      yield serializers.serialize(
        object.toList,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enable.replace(valueDes);
          break;
        case r'UGCLimit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.uGCLimit.replace(valueDes);
          break;
        case r'ugcLimitDuration':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.ugcLimitDuration.replace(valueDes);
          break;
        case r'domains':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.domains.replace(valueDes);
          break;
        case r'toList':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.toList.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesBuilder();
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

