//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties.g.dart';

/// OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties
///
/// Properties:
/// * [enabled] 
/// * [servicePeriodRanking] 
@BuiltValue()
abstract class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties implements Built<OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties, OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesBuilder> {
  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties._();

  factory OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties([void updates(OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesBuilder b)]) = _$OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties> get serializer => _$OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesSerializer();
}

class _$OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties, _$OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties];

  @override
  final String wireName = r'OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesBuilder();
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

