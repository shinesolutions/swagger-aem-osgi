//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_commons_log_log_manager_factory_writer_properties.g.dart';

/// OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties
///
/// Properties:
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile] 
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodNumber] 
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodSize] 
/// * [orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodBuffered] 
@BuiltValue()
abstract class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties implements Built<OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties, OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesBuilder> {
  @BuiltValueField(wireName: r'org.apache.sling.commons.log.file')
  ConfigNodePropertyString? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile;

  @BuiltValueField(wireName: r'org.apache.sling.commons.log.file.number')
  ConfigNodePropertyInteger? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodNumber;

  @BuiltValueField(wireName: r'org.apache.sling.commons.log.file.size')
  ConfigNodePropertyString? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodSize;

  @BuiltValueField(wireName: r'org.apache.sling.commons.log.file.buffered')
  ConfigNodePropertyBoolean? get orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodBuffered;

  OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties._();

  factory OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties([void updates(OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesBuilder b)]) = _$OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties> get serializer => _$OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesSerializer();
}

class _$OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties, _$OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties];

  @override
  final String wireName = r'OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    if (object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodBuffered != null) {
      yield r'org.apache.sling.commons.log.file.buffered';
      yield serializers.serialize(
        object.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodBuffered,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
        case r'org.apache.sling.commons.log.file.buffered':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFilePeriodBuffered.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesBuilder();
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

