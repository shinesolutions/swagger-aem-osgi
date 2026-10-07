//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_commons_log_log_manager_factory_config_properties.g.dart';

/// OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties
///
/// Properties:
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodLevel] 
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile] 
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern] 
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNames] 
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodAdditiv] 
@BuiltValue()
abstract class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties implements Built<OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties, OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesBuilder> {
  @BuiltValueField(wireName: r'org.apache.sling.commons.log.level')
  ConfigNodePropertyDropDown? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodLevel;

  @BuiltValueField(wireName: r'org.apache.sling.commons.log.file')
  ConfigNodePropertyString? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile;

  @BuiltValueField(wireName: r'org.apache.sling.commons.log.pattern')
  ConfigNodePropertyString? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern;

  @BuiltValueField(wireName: r'org.apache.sling.commons.log.names')
  ConfigNodePropertyArray? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNames;

  @BuiltValueField(wireName: r'org.apache.sling.commons.log.additiv')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodAdditiv;

  OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties._();

  factory OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties([void updates(OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesBuilder b)]) = _$OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties> get serializer => _$OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesSerializer();
}

class _$OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties, _$OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties];

  @override
  final String wireName = r'OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodLevel != null) {
      yield r'org.apache.sling.commons.log.level';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodLevel,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile != null) {
      yield r'org.apache.sling.commons.log.file';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern != null) {
      yield r'org.apache.sling.commons.log.pattern';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNames != null) {
      yield r'org.apache.sling.commons.log.names';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNames,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodAdditiv != null) {
      yield r'org.apache.sling.commons.log.additiv';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodAdditiv,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'org.apache.sling.commons.log.level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodLevel.replace(valueDes);
          break;
        case r'org.apache.sling.commons.log.file':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile.replace(valueDes);
          break;
        case r'org.apache.sling.commons.log.pattern':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern.replace(valueDes);
          break;
        case r'org.apache.sling.commons.log.names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNames.replace(valueDes);
          break;
        case r'org.apache.sling.commons.log.additiv':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodAdditiv.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesBuilder();
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

