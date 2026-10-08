//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_hc_core_impl_composite_health_check_properties.g.dart';

/// OrgApacheSlingHcCoreImplCompositeHealthCheckProperties
///
/// Properties:
/// * [hcPeriodName] 
/// * [hcPeriodTags] 
/// * [hcPeriodMbeanPeriodName] 
/// * [filterPeriodTags] 
/// * [filterPeriodCombineTagsWithOr] 
@BuiltValue()
abstract class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties implements Built<OrgApacheSlingHcCoreImplCompositeHealthCheckProperties, OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.name')
  ConfigNodePropertyString? get hcPeriodName;

  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  @BuiltValueField(wireName: r'hc.mbean.name')
  ConfigNodePropertyString? get hcPeriodMbeanPeriodName;

  @BuiltValueField(wireName: r'filter.tags')
  ConfigNodePropertyArray? get filterPeriodTags;

  @BuiltValueField(wireName: r'filter.combineTagsWithOr')
  ConfigNodePropertyBoolean? get filterPeriodCombineTagsWithOr;

  OrgApacheSlingHcCoreImplCompositeHealthCheckProperties._();

  factory OrgApacheSlingHcCoreImplCompositeHealthCheckProperties([void updates(OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesBuilder b)]) = _$OrgApacheSlingHcCoreImplCompositeHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingHcCoreImplCompositeHealthCheckProperties> get serializer => _$OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesSerializer();
}

class _$OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingHcCoreImplCompositeHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingHcCoreImplCompositeHealthCheckProperties, _$OrgApacheSlingHcCoreImplCompositeHealthCheckProperties];

  @override
  final String wireName = r'OrgApacheSlingHcCoreImplCompositeHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingHcCoreImplCompositeHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hcPeriodName != null) {
      yield r'hc.name';
      yield serializers.serialize(
        object.hcPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.hcPeriodMbeanPeriodName != null) {
      yield r'hc.mbean.name';
      yield serializers.serialize(
        object.hcPeriodMbeanPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.filterPeriodTags != null) {
      yield r'filter.tags';
      yield serializers.serialize(
        object.filterPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.filterPeriodCombineTagsWithOr != null) {
      yield r'filter.combineTagsWithOr';
      yield serializers.serialize(
        object.filterPeriodCombineTagsWithOr,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingHcCoreImplCompositeHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hc.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.hcPeriodName.replace(valueDes);
          break;
        case r'hc.tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.hcPeriodTags.replace(valueDes);
          break;
        case r'hc.mbean.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.hcPeriodMbeanPeriodName.replace(valueDes);
          break;
        case r'filter.tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.filterPeriodTags.replace(valueDes);
          break;
        case r'filter.combineTagsWithOr':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.filterPeriodCombineTagsWithOr.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingHcCoreImplCompositeHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesBuilder();
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

