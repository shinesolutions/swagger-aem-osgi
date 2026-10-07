//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties.g.dart';

/// OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties
///
/// Properties:
/// * [userPeriodMapping] 
/// * [userPeriodDefault] 
/// * [userPeriodEnablePeriodDefaultPeriodMapping] 
/// * [requirePeriodValidation] 
@BuiltValue()
abstract class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties implements Built<OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties, OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'user.mapping')
  ConfigNodePropertyArray? get userPeriodMapping;

  @BuiltValueField(wireName: r'user.default')
  ConfigNodePropertyString? get userPeriodDefault;

  @BuiltValueField(wireName: r'user.enable.default.mapping')
  ConfigNodePropertyBoolean? get userPeriodEnablePeriodDefaultPeriodMapping;

  @BuiltValueField(wireName: r'require.validation')
  ConfigNodePropertyBoolean? get requirePeriodValidation;

  OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties._();

  factory OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties([void updates(OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesBuilder b)]) = _$OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties> get serializer => _$OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesSerializer();
}

class _$OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties, _$OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties];

  @override
  final String wireName = r'OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.userPeriodMapping != null) {
      yield r'user.mapping';
      yield serializers.serialize(
        object.userPeriodMapping,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.userPeriodDefault != null) {
      yield r'user.default';
      yield serializers.serialize(
        object.userPeriodDefault,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.userPeriodEnablePeriodDefaultPeriodMapping != null) {
      yield r'user.enable.default.mapping';
      yield serializers.serialize(
        object.userPeriodEnablePeriodDefaultPeriodMapping,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.requirePeriodValidation != null) {
      yield r'require.validation';
      yield serializers.serialize(
        object.requirePeriodValidation,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'user.mapping':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.userPeriodMapping.replace(valueDes);
          break;
        case r'user.default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.userPeriodDefault.replace(valueDes);
          break;
        case r'user.enable.default.mapping':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.userPeriodEnablePeriodDefaultPeriodMapping.replace(valueDes);
          break;
        case r'require.validation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.requirePeriodValidation.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesBuilder();
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

