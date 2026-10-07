//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_commons_log_log_manager_properties.g.dart';

/// OrgApacheSlingCommonsLogLogManagerProperties
///
/// Properties:
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodLevel] 
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile] 
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodNumber] 
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodSize] 
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern] 
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodConfigurationFile] 
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPackagingDataEnabled] 
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodMaxCallerDataDepth] 
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodMaxOldFileCountInDump] 
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNumOfLines] 
@BuiltValue()
abstract class OrgApacheSlingCommonsLogLogManagerProperties implements Built<OrgApacheSlingCommonsLogLogManagerProperties, OrgApacheSlingCommonsLogLogManagerPropertiesBuilder> {
  @BuiltValueField(wireName: r'org.apache.sling.commons.log.level')
  ConfigNodePropertyDropDown? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodLevel;

  @BuiltValueField(wireName: r'org.apache.sling.commons.log.file')
  ConfigNodePropertyString? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile;

  @BuiltValueField(wireName: r'org.apache.sling.commons.log.file.number')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodNumber;

  @BuiltValueField(wireName: r'org.apache.sling.commons.log.file.size')
  ConfigNodePropertyString? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodSize;

  @BuiltValueField(wireName: r'org.apache.sling.commons.log.pattern')
  ConfigNodePropertyString? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern;

  @BuiltValueField(wireName: r'org.apache.sling.commons.log.configurationFile')
  ConfigNodePropertyString? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodConfigurationFile;

  @BuiltValueField(wireName: r'org.apache.sling.commons.log.packagingDataEnabled')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPackagingDataEnabled;

  @BuiltValueField(wireName: r'org.apache.sling.commons.log.maxCallerDataDepth')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodMaxCallerDataDepth;

  @BuiltValueField(wireName: r'org.apache.sling.commons.log.maxOldFileCountInDump')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodMaxOldFileCountInDump;

  @BuiltValueField(wireName: r'org.apache.sling.commons.log.numOfLines')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNumOfLines;

  OrgApacheSlingCommonsLogLogManagerProperties._();

  factory OrgApacheSlingCommonsLogLogManagerProperties([void updates(OrgApacheSlingCommonsLogLogManagerPropertiesBuilder b)]) = _$OrgApacheSlingCommonsLogLogManagerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCommonsLogLogManagerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCommonsLogLogManagerProperties> get serializer => _$OrgApacheSlingCommonsLogLogManagerPropertiesSerializer();
}

class _$OrgApacheSlingCommonsLogLogManagerPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingCommonsLogLogManagerProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCommonsLogLogManagerProperties, _$OrgApacheSlingCommonsLogLogManagerProperties];

  @override
  final String wireName = r'OrgApacheSlingCommonsLogLogManagerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCommonsLogLogManagerProperties object, {
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
    if (object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodNumber != null) {
      yield r'org.apache.sling.commons.log.file.number';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodNumber,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodSize != null) {
      yield r'org.apache.sling.commons.log.file.size';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodSize,
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
    if (object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodConfigurationFile != null) {
      yield r'org.apache.sling.commons.log.configurationFile';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodConfigurationFile,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPackagingDataEnabled != null) {
      yield r'org.apache.sling.commons.log.packagingDataEnabled';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPackagingDataEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodMaxCallerDataDepth != null) {
      yield r'org.apache.sling.commons.log.maxCallerDataDepth';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodMaxCallerDataDepth,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodMaxOldFileCountInDump != null) {
      yield r'org.apache.sling.commons.log.maxOldFileCountInDump';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodMaxOldFileCountInDump,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNumOfLines != null) {
      yield r'org.apache.sling.commons.log.numOfLines';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNumOfLines,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingCommonsLogLogManagerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCommonsLogLogManagerPropertiesBuilder result,
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
        case r'org.apache.sling.commons.log.file.number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodNumber.replace(valueDes);
          break;
        case r'org.apache.sling.commons.log.file.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodSize.replace(valueDes);
          break;
        case r'org.apache.sling.commons.log.pattern':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern.replace(valueDes);
          break;
        case r'org.apache.sling.commons.log.configurationFile':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodConfigurationFile.replace(valueDes);
          break;
        case r'org.apache.sling.commons.log.packagingDataEnabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPackagingDataEnabled.replace(valueDes);
          break;
        case r'org.apache.sling.commons.log.maxCallerDataDepth':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodMaxCallerDataDepth.replace(valueDes);
          break;
        case r'org.apache.sling.commons.log.maxOldFileCountInDump':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodMaxOldFileCountInDump.replace(valueDes);
          break;
        case r'org.apache.sling.commons.log.numOfLines':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNumOfLines.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingCommonsLogLogManagerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCommonsLogLogManagerPropertiesBuilder();
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

