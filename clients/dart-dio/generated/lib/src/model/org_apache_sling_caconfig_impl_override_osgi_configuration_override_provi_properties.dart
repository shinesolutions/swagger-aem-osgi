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

part 'org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_properties.g.dart';

/// OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties
///
/// Properties:
/// * [description] 
/// * [overrides] 
/// * [enabled] 
/// * [servicePeriodRanking] 
@BuiltValue()
abstract class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties implements Built<OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties, OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesBuilder> {
  @BuiltValueField(wireName: r'description')
  ConfigNodePropertyString? get description;

  @BuiltValueField(wireName: r'overrides')
  ConfigNodePropertyArray? get overrides;

  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties._();

  factory OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties([void updates(OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesBuilder b)]) = _$OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties> get serializer => _$OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesSerializer();
}

class _$OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties, _$OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties];

  @override
  final String wireName = r'OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.overrides != null) {
      yield r'overrides';
      yield serializers.serialize(
        object.overrides,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.description.replace(valueDes);
          break;
        case r'overrides':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.overrides.replace(valueDes);
          break;
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesBuilder();
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

