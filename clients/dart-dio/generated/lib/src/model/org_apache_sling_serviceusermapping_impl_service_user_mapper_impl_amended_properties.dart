//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties.g.dart';

/// OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties
///
/// Properties:
/// * [servicePeriodRanking] 
/// * [userPeriodMapping] 
@BuiltValue()
abstract class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties implements Built<OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties, OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesBuilder> {
  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  @BuiltValueField(wireName: r'user.mapping')
  ConfigNodePropertyArray? get userPeriodMapping;

  OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties._();

  factory OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties([void updates(OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesBuilder b)]) = _$OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties> get serializer => _$OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesSerializer();
}

class _$OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties, _$OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties];

  @override
  final String wireName = r'OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.userPeriodMapping != null) {
      yield r'user.mapping';
      yield serializers.serialize(
        object.userPeriodMapping,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        case r'user.mapping':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.userPeriodMapping.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesBuilder();
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

