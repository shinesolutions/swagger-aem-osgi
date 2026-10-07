//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_hc_core_impl_scriptable_health_check_properties.g.dart';

/// OrgApacheSlingHcCoreImplScriptableHealthCheckProperties
///
/// Properties:
/// * [hcPeriodName] 
/// * [hcPeriodTags] 
/// * [hcPeriodMbeanPeriodName] 
/// * [expression] 
/// * [languagePeriodExtension] 
@BuiltValue()
abstract class OrgApacheSlingHcCoreImplScriptableHealthCheckProperties implements Built<OrgApacheSlingHcCoreImplScriptableHealthCheckProperties, OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.name')
  ConfigNodePropertyString? get hcPeriodName;

  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  @BuiltValueField(wireName: r'hc.mbean.name')
  ConfigNodePropertyString? get hcPeriodMbeanPeriodName;

  @BuiltValueField(wireName: r'expression')
  ConfigNodePropertyString? get expression;

  @BuiltValueField(wireName: r'language.extension')
  ConfigNodePropertyString? get languagePeriodExtension;

  OrgApacheSlingHcCoreImplScriptableHealthCheckProperties._();

  factory OrgApacheSlingHcCoreImplScriptableHealthCheckProperties([void updates(OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesBuilder b)]) = _$OrgApacheSlingHcCoreImplScriptableHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingHcCoreImplScriptableHealthCheckProperties> get serializer => _$OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesSerializer();
}

class _$OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingHcCoreImplScriptableHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingHcCoreImplScriptableHealthCheckProperties, _$OrgApacheSlingHcCoreImplScriptableHealthCheckProperties];

  @override
  final String wireName = r'OrgApacheSlingHcCoreImplScriptableHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingHcCoreImplScriptableHealthCheckProperties object, {
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
    if (object.expression != null) {
      yield r'expression';
      yield serializers.serialize(
        object.expression,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.languagePeriodExtension != null) {
      yield r'language.extension';
      yield serializers.serialize(
        object.languagePeriodExtension,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingHcCoreImplScriptableHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesBuilder result,
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
        case r'expression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.expression.replace(valueDes);
          break;
        case r'language.extension':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.languagePeriodExtension.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingHcCoreImplScriptableHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesBuilder();
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

