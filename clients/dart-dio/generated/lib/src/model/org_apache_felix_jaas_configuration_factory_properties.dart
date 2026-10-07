//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_felix_jaas_configuration_factory_properties.g.dart';

/// OrgApacheFelixJaasConfigurationFactoryProperties
///
/// Properties:
/// * [jaasPeriodControlFlag] 
/// * [jaasPeriodRanking] 
/// * [jaasPeriodRealmName] 
/// * [jaasPeriodClassname] 
/// * [jaasPeriodOptions] 
@BuiltValue()
abstract class OrgApacheFelixJaasConfigurationFactoryProperties implements Built<OrgApacheFelixJaasConfigurationFactoryProperties, OrgApacheFelixJaasConfigurationFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'jaas.controlFlag')
  ConfigNodePropertyDropDown? get jaasPeriodControlFlag;

  @BuiltValueField(wireName: r'jaas.ranking')
  ConfigNodePropertyInteger? get jaasPeriodRanking;

  @BuiltValueField(wireName: r'jaas.realmName')
  ConfigNodePropertyString? get jaasPeriodRealmName;

  @BuiltValueField(wireName: r'jaas.classname')
  ConfigNodePropertyString? get jaasPeriodClassname;

  @BuiltValueField(wireName: r'jaas.options')
  ConfigNodePropertyArray? get jaasPeriodOptions;

  OrgApacheFelixJaasConfigurationFactoryProperties._();

  factory OrgApacheFelixJaasConfigurationFactoryProperties([void updates(OrgApacheFelixJaasConfigurationFactoryPropertiesBuilder b)]) = _$OrgApacheFelixJaasConfigurationFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheFelixJaasConfigurationFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheFelixJaasConfigurationFactoryProperties> get serializer => _$OrgApacheFelixJaasConfigurationFactoryPropertiesSerializer();
}

class _$OrgApacheFelixJaasConfigurationFactoryPropertiesSerializer implements PrimitiveSerializer<OrgApacheFelixJaasConfigurationFactoryProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheFelixJaasConfigurationFactoryProperties, _$OrgApacheFelixJaasConfigurationFactoryProperties];

  @override
  final String wireName = r'OrgApacheFelixJaasConfigurationFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheFelixJaasConfigurationFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.jaasPeriodControlFlag != null) {
      yield r'jaas.controlFlag';
      yield serializers.serialize(
        object.jaasPeriodControlFlag,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.jaasPeriodRanking != null) {
      yield r'jaas.ranking';
      yield serializers.serialize(
        object.jaasPeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.jaasPeriodRealmName != null) {
      yield r'jaas.realmName';
      yield serializers.serialize(
        object.jaasPeriodRealmName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jaasPeriodClassname != null) {
      yield r'jaas.classname';
      yield serializers.serialize(
        object.jaasPeriodClassname,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jaasPeriodOptions != null) {
      yield r'jaas.options';
      yield serializers.serialize(
        object.jaasPeriodOptions,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheFelixJaasConfigurationFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheFelixJaasConfigurationFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'jaas.controlFlag':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.jaasPeriodControlFlag.replace(valueDes);
          break;
        case r'jaas.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.jaasPeriodRanking.replace(valueDes);
          break;
        case r'jaas.realmName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jaasPeriodRealmName.replace(valueDes);
          break;
        case r'jaas.classname':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jaasPeriodClassname.replace(valueDes);
          break;
        case r'jaas.options':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.jaasPeriodOptions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheFelixJaasConfigurationFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheFelixJaasConfigurationFactoryPropertiesBuilder();
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

