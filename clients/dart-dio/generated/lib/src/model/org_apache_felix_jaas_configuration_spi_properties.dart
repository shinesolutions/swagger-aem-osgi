//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_felix_jaas_configuration_spi_properties.g.dart';

/// OrgApacheFelixJaasConfigurationSpiProperties
///
/// Properties:
/// * [jaasPeriodDefaultRealmName] 
/// * [jaasPeriodConfigProviderName] 
/// * [jaasPeriodGlobalConfigPolicy] 
@BuiltValue()
abstract class OrgApacheFelixJaasConfigurationSpiProperties implements Built<OrgApacheFelixJaasConfigurationSpiProperties, OrgApacheFelixJaasConfigurationSpiPropertiesBuilder> {
  @BuiltValueField(wireName: r'jaas.defaultRealmName')
  ConfigNodePropertyString? get jaasPeriodDefaultRealmName;

  @BuiltValueField(wireName: r'jaas.configProviderName')
  ConfigNodePropertyString? get jaasPeriodConfigProviderName;

  @BuiltValueField(wireName: r'jaas.globalConfigPolicy')
  ConfigNodePropertyDropDown? get jaasPeriodGlobalConfigPolicy;

  OrgApacheFelixJaasConfigurationSpiProperties._();

  factory OrgApacheFelixJaasConfigurationSpiProperties([void updates(OrgApacheFelixJaasConfigurationSpiPropertiesBuilder b)]) = _$OrgApacheFelixJaasConfigurationSpiProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheFelixJaasConfigurationSpiPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheFelixJaasConfigurationSpiProperties> get serializer => _$OrgApacheFelixJaasConfigurationSpiPropertiesSerializer();
}

class _$OrgApacheFelixJaasConfigurationSpiPropertiesSerializer implements PrimitiveSerializer<OrgApacheFelixJaasConfigurationSpiProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheFelixJaasConfigurationSpiProperties, _$OrgApacheFelixJaasConfigurationSpiProperties];

  @override
  final String wireName = r'OrgApacheFelixJaasConfigurationSpiProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheFelixJaasConfigurationSpiProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.jaasPeriodDefaultRealmName != null) {
      yield r'jaas.defaultRealmName';
      yield serializers.serialize(
        object.jaasPeriodDefaultRealmName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jaasPeriodConfigProviderName != null) {
      yield r'jaas.configProviderName';
      yield serializers.serialize(
        object.jaasPeriodConfigProviderName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jaasPeriodGlobalConfigPolicy != null) {
      yield r'jaas.globalConfigPolicy';
      yield serializers.serialize(
        object.jaasPeriodGlobalConfigPolicy,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheFelixJaasConfigurationSpiProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheFelixJaasConfigurationSpiPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'jaas.defaultRealmName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jaasPeriodDefaultRealmName.replace(valueDes);
          break;
        case r'jaas.configProviderName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jaasPeriodConfigProviderName.replace(valueDes);
          break;
        case r'jaas.globalConfigPolicy':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.jaasPeriodGlobalConfigPolicy.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheFelixJaasConfigurationSpiProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheFelixJaasConfigurationSpiPropertiesBuilder();
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

